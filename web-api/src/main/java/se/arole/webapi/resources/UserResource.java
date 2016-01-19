package se.arole.webapi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import se.arole.api.resource.User;

@Path("user")
public class UserResource {

	@GET
	public Response getAll() {

		return null;
	}

	@POST
	public Response createUser(User user) {

		return null;
	}

}
