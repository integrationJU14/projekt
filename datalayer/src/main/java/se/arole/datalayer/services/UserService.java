package se.arole.datalayer.services;

import se.arole.datalayer.entity.User;

public interface UserService {
	
	User createUser (User user);
	User updateUser (User user, long userId);
	void changeStatusUser (boolean isActive, long userId);
	User getUser (long userId);
	User getUserByUsername (String userName);
	

}
