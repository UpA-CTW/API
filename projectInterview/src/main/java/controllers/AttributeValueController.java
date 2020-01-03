package controllers;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import models.AttributeValue;
import repositories.AttributeValueRepository;
import services.AttributeValueService;

@Path("attributevalue")
public class AttributeValueController extends EntityController <AttributeValueService, AttributeValueRepository, AttributeValue>{

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public AttributeValue post(AttributeValue attribute) {
		return service.create(attribute);
	}
	
	@GET
	@Path("filter")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<AttributeValue> getByAttribute(@QueryParam("attribute") String attribute) {
		return service.getByAttribute(attribute);
	}
	
}
