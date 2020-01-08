package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.InterviewModel;
import repositories.InterviewModelRepository;
import services.InterviewModelService;

@Path("interviewmodel")
public class InterviewModelController extends EntityController<InterviewModelService, InterviewModelRepository, InterviewModel>{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public InterviewModel post(InterviewModel interview) {
		return service.create(interview);
	}
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String put(@PathParam("id") long id, InterviewModel entity) {
		service.edit(id, entity);
		return "Edited Successfully";
	}
	
}
