package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Question;
import repositories.QuestionRepository;
import services.QuestionService;

@Path("question")
public class QuestionController extends EntityController <QuestionService, QuestionRepository, Question> {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Question post(Question question) {
		return service.create(question);
	}
	
	
}
