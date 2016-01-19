package se.arole.webapi.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
		Collection<User> users = userController.getAll();
		return Response.ok(users).build();
	}

	@POST
	public Response createUser(User user) {
		User createdUser = userController.create(user);

		URI location = uriInfo.getAbsolutePathBuilder().path("" + createdUser.getUserId()).build();
		return Response.created(location).build();
	}

}
