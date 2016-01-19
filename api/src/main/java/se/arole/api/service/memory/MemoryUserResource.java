package se.arole.api.service.memory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import se.arole.api.resource.User;

public class MemoryUserResource {
	
	private final Map<String, User> users = new HashMap<>();
	
	public User createUser(User user) {
		long userId = Long.parseLong(UUID.randomUUID().toString());
		user = user.setUserId(userId);
		users.put(""+userId, user);
		
		return user;
	}
	
	public User updateUser(User tempUser, long userId) {
		
		User user = users.get(userId);
		
		user.setUserName(tempUser.getUserName());
		user.setFirstName(tempUser.getFirstName());
		user.setLastName(tempUser.getLastName());
		
		users.put(""+userId, user);
		
		return user;
	}
	
	public User get(long userId){
		return users.get(userId);
	}
	
//	public User getUserByUsername(){
//		
//	}

}
