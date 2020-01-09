package models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name=Question.GET_ALL_QUESTIONS_QUERY_NAME, query="SELECT q FROM Question q")
@NamedQuery(name=Question.GET_QUESTION_BY_VALUE_QUERY_NAME, query="UPDATE Question q SET q.attributes = null WHERE q.attributes.id = :id")

public class Question extends GenericEntity {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_QUESTIONS_QUERY_NAME = "Question.getAllEntity";
	public static final String GET_QUESTION_BY_VALUE_QUERY_NAME = "Question.getQuestionByName";

	
	@OneToMany
	private Collection<AttributeValue> attributes;
	private String question;
	private String answer;

	public Question() {
		
	}

	public Collection<AttributeValue> getAttributes() {
		return attributes;
	}

	public void setAttributes(Collection<AttributeValue> attributes) {
		this.attributes = attributes;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

	
}
