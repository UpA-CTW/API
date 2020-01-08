package controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;

import models.Interview;
import repositories.InterviewRepository;
import services.InterviewService;

@Path("interview")
public class InterviewController extends EntityController<InterviewService, InterviewRepository, Interview>{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Interview post(Interview interview) {
		return service.create(interview);
	}
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String put(@PathParam("id") long id, Interview entity) {
		service.edit(id, entity);
		return "Edited Successfully";
	}
	
	@GET
	@Path("user")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Interview> getByUser(@QueryParam("userid") long id) {
		return service.getByUser(id);
	}
}
