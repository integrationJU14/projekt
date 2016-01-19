package se.arole.webapi.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import se.arole.api.controller.UserController;
import se.arole.api.resource.User;

@Path("user")
public final class UserResource {

	private UserController userController;

	@Context
	private UriInfo uriInfo;

	@GET
	public Response getAll() {
		return Response.ok("Not implemented getAllUser method").build();
	}

	@POST
	public Response createUser(User user) {
		User createdUser = userController.create(user);
		URI location = uriInfo.getAbsolutePathBuilder().path("" + createdUser.getUserId()).build();

		return Response.created(location).build();
	}

	@GET
	@Path("/{id}")
	public Response getUser(@PathParam("id") Integer id) {
		User user = userController.getUser(id);

		return Response.ok(user).build();
	}

	@GET
	@Path("/{username}")
	public Response getUser(@PathParam("username") String userName) {
		User user = userController.getUser(userName);

		return Response.ok(user).build();
	}

}
