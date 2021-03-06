package se.arole.datalayer.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import se.arole.datalayer.entity.User;
import se.arole.datalayer.repository.UserRepository;
import se.arole.datalayer.service.UserService;

/**
 * @author Holstad
 *
 */
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImp(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	public UserServiceImp() {}
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user, Integer userId) {
		User tempUser = userRepository.findByUserId(userId);
		userRepository.delete(tempUser.getId());
		tempUser = user;
		return userRepository.save(tempUser);
	}

	@Override
	public void changeStatusUser(boolean isActive, Integer userId) {
		User tempUser = userRepository.findByUserId(userId);
		userRepository.delete(tempUser.getId());
		userRepository.save(new User(tempUser.getName(),tempUser.getUserId(), isActive));
		
	}

	@Override
	public User getUser(Integer userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public User getUserByUsername(String userName) {
		List<User> users = (List<User>) userRepository.findAll();
		return users.stream().filter(user -> user.getName().contains(userName)).findFirst().orElse(null);
	}

}
