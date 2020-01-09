package services;

import java.util.Collection;

import javax.transaction.Transactional;

import models.AttributeValue;
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

	public Collection<Question> getByValue(String value) {
		return repository.getByValue(value);
	}

	@Transactional
	public void removeAttribute(long id) {
//		Collection<Question> questions = repository.getAll();
//		for(Question question : questions) {
//			for(AttributeValue attributeValue : question.getAttributes()) {
//				if (attributeValue.getId() == id) {
//					//question.getAttributes().remove(attributeValue);
//					repository.editEntity(question);
//				}
//			}
//		}
		repository.removeAttributes(id);
	}

}
