package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String put(@PathParam("id") long id, Question entity) {
		service.edit(id, entity);
		return "Edited Successfully";
	}
	

	
	
}
