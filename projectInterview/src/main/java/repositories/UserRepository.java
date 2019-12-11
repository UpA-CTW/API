package repositories;

import models.User;

public class UserRepository extends EntityRepository<User>{

	@Override
	protected String getAllEntityIdsQueryName() {
		return User.GET_ALL_USERS_ID_QUERY;
	}

	@Override
	protected Class<User> getEntityClass() {
		return User.class;
	}

	@Override
	protected String getAllEntityQueryName() {
		return User.GET_ALL_USERS_QUERY;
	}

	
}
