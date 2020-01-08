package models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name=Interview.GET_ALL_INTERVIEWS_QUERY_NAME, query="SELECT i FROM Interview i")
@NamedQuery(name=Interview.GET_ALL_INTERVIEWS_BY_USER_QUERY_NAME, query="SELECT i FROM Interview i WHERE i.user.id = :id")
public class Interview extends GenericEntity{
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_INTERVIEWS_QUERY_NAME = "Interview.getAllInterviews";
	
	public static final String GET_ALL_INTERVIEWS_BY_USER_QUERY_NAME = "Interview.getAllInterviewsByUser";
	
	@OneToMany
	private Collection<Question> questions;
	private String title;
	private String candidate;
	@ManyToOne
	private User user;
	private String[] evaluations;
	
	public Interview() {
		
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String[] getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(String[] evaluations) {
		this.evaluations = evaluations;
	}
	
	
	
	
}
