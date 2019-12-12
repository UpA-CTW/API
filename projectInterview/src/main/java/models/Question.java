package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name=Question.GET_ALL_QUESTIONS_QUERY, query="SELECT q FROM Question q")
@NamedQuery(name=Question.GET_ALL_QUESTIONS_ID_QUERY, query="SELECT q.id FROM Question q")
@NamedQuery(name=Question.GET_QUESTION_BY_NAME_QUERY, query="SELECT q FROM Question q WHERE q.name LIKE %name%")

public class Question extends GenericEntity {

	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_QUESTIONS_QUERY = "Question.getAllQuestions";
	public static final String GET_ALL_QUESTIONS_ID_QUERY = "Question.getAllQuestionsId";
	public static final String GET_QUESTION_BY_NAME_QUERY = "Question.getQuestionByName";

	
	@ManyToOne
	private Attribute attribute;
	private String question;
	private String answer;

	public Question() {
		
	}
	
	public Question(String question, String answer, Attribute attribute) {
		this.question = question;
		this.answer = answer;
		this.attribute = attribute;
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
