package controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.Attribute;
import repositories.AttributeRepository;
import services.AttributeService;

@Path("attribute")
public class AttributeController extends EntityController <AttributeService, AttributeRepository, Attribute>{
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Attribute post(Attribute attribute) {
		return service.create(attribute);
	}

}
