package services;

import javax.transaction.Transactional;

import models.InterviewModel;
import repositories.InterviewModelRepository;

public class InterviewModelService extends EntityService<InterviewModelRepository, InterviewModel>{

	@Override
	@Transactional
	public InterviewModel edit(long id, InterviewModel entity) {
		InterviewModel interviewModel = repository.consultEntity(id);
		entity.setId(id);
		if(entity.getTitle() == null) {
			entity.setTitle(interviewModel.getTitle());
		}
		if(entity.getQuestions() == null) {
			entity.setQuestions(interviewModel.getQuestions());
		}
		return repository.editEntity(entity);
	}

}
