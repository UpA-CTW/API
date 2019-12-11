package Models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Question extends GenericEntity {

	private static final long serialVersionUID = 1L;
	
	private String question;
	private String answer;
	
	@ManyToOne
	private Attribute attribute;

	public Question() {
		
	}
	
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
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
