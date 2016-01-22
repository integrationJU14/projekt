package se.arole.datalayer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import se.arole.datalayer.service.UserService;
import se.arole.datalayer.serviceImp.UserServiceImp;

@Configuration
public class Services {
	
	@Bean
	public UserService userService(){
		return new UserServiceImp();
	}
	
}
