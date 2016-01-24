package se.arole.webapi.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import se.arole.api.service.UserServiceApi;
import se.arole.api.service.sql.UserServiceApiSQL;
import se.arole.datalayer.entity.User;

@Produces({ MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON })
@Consumes(MediaType.APPLICATION_JSON)
@Path("user")
public final class UserResource {

	private UserServiceApi userController = new UserServiceApiSQL();

	@Context
	private UriInfo uriInfo;

	@GET
	@Path("{userId}")
	public User getAllUsers(@PathParam("userId") Integer userId) {
		return	userController.getByUserId(userId);
		
	}

	@POST
	public Response createUser(User user) {

		User createdUser = userController.createUser(user);
		URI location = uriInfo.getAbsolutePathBuilder().path("" + createdUser.getUserId()).build();

		return Response.created(location).build();
	}
	//
	// @PUT
	// @Path("/{id}")
	// public Response updateUser(@PathParam("id") Integer id, UserVO user) {
	//
	// userController.getUser(id);
	// UserVO updatedUser = userController.update(id, user);
	//
	// return Response.ok(updatedUser).build();
	// }
	//
	// @GET
	// @Path("/{id}")
	// public Response getUser(@PathParam("id") Integer id) {
	// UserVO user = userController.getUser(id);
	//
	// return Response.ok(user).build();
	// }
	//
	// @GET
	// @QueryParam("{userName}")
	// public Response getUser(@QueryParam("userName") String userName) {
	// UserVO user = userController.getUser(userName);
	// // TODO: POssibility to add a mapper for an exception if no customer is
	// // found
	// return Response.ok(user).build();
	// }

}
