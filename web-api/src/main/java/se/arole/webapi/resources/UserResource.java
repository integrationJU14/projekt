package se.arole.webapi.resources;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import se.arole.api.controller.UserController;
import se.arole.api.resource.UserVO;

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
	public Response createUser(UserVO user) {
		UserVO createdUser = userController.create(user);
		URI location = uriInfo.getAbsolutePathBuilder().path("" + createdUser.getUserId()).build();

		return Response.created(location).build();
	}

	@PUT
	@Path("/{id}")
	public Response updateUser(@PathParam("id") Integer id, UserVO user) {

		userController.getUser(id);
		UserVO updatedUser = userController.update(id, user);

		return Response.ok(updatedUser).build();
	}

	@GET
	@Path("/{id}")
	public Response getUser(@PathParam("id") Integer id) {
		UserVO user = userController.getUser(id);

		return Response.ok(user).build();
	}

	@GET
	@QueryParam("{userName}")
	public Response getUser(@QueryParam("userName") String userName) {
		UserVO user = userController.getUser(userName);
		// TODO: POssibility to add a mapper for an exception if no customer is
		// found
		return Response.ok(user).build();
	}

}
