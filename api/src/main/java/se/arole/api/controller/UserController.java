package se.arole.api.controller;

import java.util.Collection;
import java.util.Collections;

import se.arole.api.adapter.UserAdapter;
import se.arole.api.resource.User;
import se.arole.datalayer.service.UserService;

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

	public User getUser(Integer id) {
		se.arole.datalayer.entity.User user = userService.getUser(id);

		return UserAdapter.fromUserDb(user);
	}

	public User getUser(String userName) {
		se.arole.datalayer.entity.User userByUsername = userService.getUserByUsername(userName);
		
		return UserAdapter.fromUserDb(userByUsername);
	}
}
