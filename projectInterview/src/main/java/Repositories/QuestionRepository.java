package Repositories;

import Models.Question;

public class QuestionRepository extends EntityRepository<Question> {
	
	@Override
	protected  String getAllEntityQueryName() {
		return Question.GET_ALL_QUESTIONS_QUERY;
	}

	@Override
	protected String getAllEntityIdsQueryName() {
		return Question.GET_ALL_QUESTIONS_ID_QUERY;
	}

	@Override
	protected Class<Question> getEntityClass() {
		return Question.class;
	}

}
