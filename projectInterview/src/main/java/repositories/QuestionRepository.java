package repositories;

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



//	@Override
//	public Collection <Question> getByName(String name) {
//		return entityManager
//				.createNamedQuery(Question.GET_QUESTION_BY_NAME_QUERY_NAME, Question.class)
//				.setParameter("name", name)
//				.getResultList();
//	}
	

}
