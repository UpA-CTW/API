package repositories;

import java.util.Collection;

import models.Interview;


public class InterviewRepository extends EntityRepository<Interview>{

	@Override
	protected Class<Interview> getEntityClass() {
		return Interview.class;
	}

	@Override
	protected String getAllEntities() {
		return Interview.GET_ALL_INTERVIEWS_QUERY_NAME;
	}
	
	public Collection<Interview> getByUser(Number id) {
		return entityManager
				.createNamedQuery(Interview.GET_ALL_INTERVIEWS_BY_USER_QUERY_NAME, Interview.class)
				.setParameter("id", id)
				.getResultList();
	}

}
