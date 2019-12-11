package Repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityRepository {

	@PersistenceContext
	protected EntityManager entityManager;
	
	
}
