package repositories;

import java.util.Collection;

import models.Question;

public class QuestionRepository extends EntityRepository<Question> {
	


	@Override
	protected Class<Question> getEntityClass() {
		return Question.class;
	}
	
	@Override
	protected  String getAllEntities() {
		return Question.GET_ALL_QUESTIONS_QUERY_NAME;
	}

	public Collection<Question> getByValue(String value) {
		return entityManager
				.createNamedQuery(Question.GET_QUESTION_BY_VALUE_QUERY_NAME, Question.class)
				.setParameter("value", value)
				.getResultList();
	}

	public void removeAttributes(long id) {
		entityManager
		.createNamedQuery(Question.UPDATE_QUESTION_ATTRIBUTEVALUES_QUERY_NAME)
		.setParameter("id", id)
		.executeUpdate();
	}



//	@Override
//	public Collection <Question> getByName(String name) {
//		return entityManager
//				.createNamedQuery(Question.GET_QUESTION_BY_NAME_QUERY_NAME, Question.class)
//				.setParameter("name", name)
//				.getResultList();
//	}
	

}
