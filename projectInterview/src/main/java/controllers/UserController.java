package controllers;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import models.DTOs.UserDTO;
import services.UserService;

@Path("users")
public class UserController extends UserService{
	
	@Inject
	 UserService  userService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String create(UserDTO user) {
		userService.createUser(user);
		return "";
	}
	
	@POST
	@Path("auth")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String login(UserDTO user) {
		try {
			userService.checkIfUserValid(user, user.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	

}
