package se.arole.api.service;

import se.arole.datalayer.entity.User;

public interface UserServiceApi {
	User createUser (User user);
	User updateUser (User user, Integer userId);
	void changeStatusUser (boolean isActive, Integer userId);
	User getByUserId (Integer userId);
	User getUserByUsername (String userName);

}
