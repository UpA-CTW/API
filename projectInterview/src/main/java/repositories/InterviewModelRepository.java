package repositories;

import models.InterviewModel;

public class InterviewModelRepository extends EntityRepository<InterviewModel>{

	@Override
	protected Class<InterviewModel> getEntityClass() {
		return InterviewModel.class;
	}

	@Override
	protected String getAllEntities() {
		return InterviewModel.GET_ALL_INTERVIEWMODELS_QUERY_NAME;
	}

}
