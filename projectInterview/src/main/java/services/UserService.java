package services;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;

import models.User;
import models.DTOs.UserDTO;
import repositories.UserRepository;
import utils.PasswordUtils;

@RequestScoped
public class UserService extends EntityService<UserRepository, User>  {


    @Transactional
    public User findUserByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Transactional
    public void createUser(UserDTO userDTO) {

        String username=userDTO.getName();
        String email=userDTO.getEmail();

        User user=new User();

        //password->(hash, salt)
        String password = userDTO.getPassword();


        String[] hashCode=passwordToHashcode(password);

        //set fields to Entity
        user.setName(username); 
        user.setHashcode(hashCode[0]);
        user.setSalt(hashCode[1]);
        user.setEmail(email);

        //Adicionar entity ao repositório
        repository.createEntity(user);
    }
    
	@Override
	@Transactional
	public User edit(long id, User entity) {
		
			return repository.editEntity(entity);
	}

    public void checkIfUserValid(UserDTO userDTO, String password) throws Exception {            
        //User valid if both username and password are valid
        checkIfPasswordValid(userDTO, password);
    }

    public void checkIfPasswordValid(UserDTO userDTO, String password) throws Exception {
        User myUser=repository.findUserByEmail(userDTO.getEmail());
        String key=myUser.getHashcode();
        String salt=myUser.getSalt();

        if(!PasswordUtils.verifyPassword(password, key, salt))
            throw new BadRequestException("Invalid Password");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////Password-Methods//////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String[] passwordToHashcode(String password) {
        String salt = PasswordUtils.generateSalt(50).get();
        String key = PasswordUtils.hashPassword(password, salt).get();
        String[] result= {key, salt};
        return result;
    }

}

