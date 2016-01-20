package se.arole.api.adapter;

import se.arole.api.resource.User;

public class UserAdapter {

	public static se.arole.datalayer.entity.User toUserDb(User user) {
		String userName = user.getUserName();
		boolean isActive = user.isActive();

		// TODO: Check Integer/Long as UserId
		Integer userId = (int) user.getUserId();

		return new se.arole.datalayer.entity.User(userName, userId, isActive);
	}

	public static User fromUserDb(se.arole.datalayer.entity.User userDb) {
		Integer id = userDb.getUserId();
		String userName = userDb.getName();

		return new User(id, true, userName, "", "");
	}
}
