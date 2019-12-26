package controllers;

import java.util.Collection;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import models.User;
import models.DTOs.UserDTO;
import repositories.UserRepository;
import services.UserService;

@Path("user")
public class UserController extends EntityController <UserService, UserRepository, User> {
	
	@Inject
	 UserService  userService;
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String create(UserDTO user) {
		userService.createUser(user);
		return "User Created";
	}
	
	@POST
	@Path("auth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(UserDTO user) {
		try {
			User account = userService.findUserByEmail(user.getEmail());
			userService.checkIfUserValid(user, user.getPassword());
			return Response.ok().entity(account).build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}
	}
	
	@GET
	@Path("filter")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection <User> getByEmail(@QueryParam("email") String email) throws Exception {
		return service.getByEmail(email);
	}
	

}
