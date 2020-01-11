package services;

import java.util.Collection;

import javax.transaction.Transactional;

import models.Interview;
import repositories.InterviewRepository;

public class InterviewService extends EntityService<InterviewRepository, Interview>{

	@Override
	@Transactional
	public Interview edit(long id, Interview entity) {
		Interview interview = repository.consultEntity(id);
		entity.setId(id);
		if(entity.getTitle() == null) {
			entity.setTitle(interview.getTitle());
		}
		if(entity.getQuestions() == null) {
			entity.setQuestions(interview.getQuestions());
		}
		if(entity.getUser() == null) {
			entity.setUser(interview.getUser());
		}
		if(entity.getCandidate() == null) {
			entity.setCandidate(interview.getCandidate());
		}
				
		entity.setFinalEvaluation(interview.getFinalEvaluation());
		
		
		return repository.editEntity(entity);
	}
	
	@Transactional
	public Collection<Interview> getByUser(Number id) {
		return repository.getByUser(id);
	}

}
