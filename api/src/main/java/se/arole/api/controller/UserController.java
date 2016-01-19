package se.arole.api.controller;

import java.util.Collection;
import java.util.Collections;

import se.arole.api.adapter.UserAdapter;
import se.arole.api.resource.User;
import se.arole.datalayer.services.UserService;

public final class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	public Collection<User> getAll() {
		return Collections.EMPTY_LIST;
	}

	public User create(User user) {
		se.arole.datalayer.entity.User userDb = UserAdapter.toUserDb(user);
		se.arole.datalayer.entity.User createdUser = userService.createUser(userDb);
		
		return UserAdapter.fromUserDb(createdUser);
	}
}
