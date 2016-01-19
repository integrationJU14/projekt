package se.arole.datalayer.serviceImp;

import java.util.List;

import se.arole.datalayer.entity.User;
import se.arole.datalayer.repository.UserRepository;
import se.arole.datalayer.service.UserService;

public class UserServiceImp implements UserService {

	UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user, Integer userId) {
		User tempUser = userRepository.findOne(userId);
		userRepository.delete(userId);
		tempUser = user;
		return userRepository.save(tempUser);
	}

	@Override
	public void changeStatusUser(boolean isActive, Integer userId) {
		User tempUser = userRepository.findOne(userId);
		userRepository.delete(userId);
		userRepository.save(new User(tempUser.getName(),tempUser.getUserId(), isActive));
		
	}

	@Override
	public User getUser(Integer userId) {
		return userRepository.findOne(userId);
	}

	@Override
	public User getUserByUsername(String userName) {
		List<User> users = (List<User>) userRepository.findAll();
		return users.stream().filter(user -> user.getName().contains(userName)).findFirst().orElse(null);
	}

}
