package models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name=InterviewModel.GET_ALL_INTERVIEWMODELS_QUERY_NAME, query="SELECT i FROM InterviewModel i")
public class InterviewModel extends GenericEntity{
	
	private static final long serialVersionUID = 1L;
	
	public static final String GET_ALL_INTERVIEWMODELS_QUERY_NAME = "Interview.getAllInterviewModels";
	
	
	@OneToMany
	private Collection<Question> questions;
	private String title;
	
	public InterviewModel() {
		
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
	
	

}
