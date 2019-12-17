package services;

import javax.transaction.Transactional;

import models.Question;
import repositories.QuestionRepository;

public class QuestionService extends EntityService<QuestionRepository, Question>{

	@Override
	@Transactional
	public Question edit(long id, Question entity) {
		Question question = repository.consultEntity(id);
		entity.setId(id);
		if(entity.getQuestion() == null) {
			entity.setQuestion(question.getQuestion());
		}
		if(entity.getAnswer() == null) {
			entity.setAnswer(question.getAnswer());
		}
		if(entity.getAttributes() == null) {
			entity.setAttributes(question.getAttributes());
		}
		return repository.editEntity(entity);
	}

}
