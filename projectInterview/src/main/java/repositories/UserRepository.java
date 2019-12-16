package repositories;

import java.util.Collection;

import models.User;

public class UserRepository extends EntityRepository<User>{

	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}

	@Override
	protected String getAllEntities() {
		return User.GET_ALL_USERS_QUERY_NAME ;
	}

//	public List<User> findUsersByEmail(String email) {
//		return entityManager
//				.createNamedQuery(User.GET_USER_BY_EMAIL_QUERY, User.class)
//				.setParameter("email", email)
//				.getResultList();
//	}
	
	public User findUserByEmail(String email) {
		return entityManager
				.createNamedQuery(User.GET_USER_BY_EMAIL_QUERY_NAME , User.class)
				.setParameter("email", email)
				.getSingleResult();
	}

	@Override
	public Collection<User> getOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
