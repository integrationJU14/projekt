package se.arole.api.service.sql;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.arole.api.service.UserServiceApi;
import se.arole.datalayer.entity.User;
import se.arole.datalayer.service.UserService;

public class UserServiceApiSQL implements UserServiceApi {

	@Override
	public User createUser(User user) {
		User createdUser;
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {

			// Configure Spring DI
			context.scan("se.arole.datalayer");
			context.refresh();
			UserService uService = context.getBean(UserService.class);
			createdUser=uService.createUser(user);
			
		}
		return createdUser;

	}

	@Override
	public User updateUser(User user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeStatusUser(boolean isActive, Integer userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getByUserId(Integer userId) {
		User user;
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {

			// Configure Spring DI
			context.scan("se.arole.datalayer");
			context.refresh();
			UserService uService = context.getBean(UserService.class);
			user=uService.getByUserId(userId);
			
		}
		return user;
	}

	@Override
	public User getUserByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
