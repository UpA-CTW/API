package controllers;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.User;
import models.DTOs.UserDTO;
import repositories.UserRepository;
import services.UserService;

@Path("user")
public class UserController extends EntityController <UserService, UserRepository, User> {
	
	@Inject
	 UserService  userService;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String create(UserDTO user) {
		userService.createUser(user);
		return "User Created";
	}
	
	@POST
	@Path("auth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(UserDTO user) {
		try {
			userService.checkIfUserValid(user, user.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	

}
