package se.arole.datalayer.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import se.arole.datalayer.config.Config;
import se.arole.datalayer.config.Services;
import se.arole.datalayer.entity.User;
import se.arole.datalayer.repository.UserRepository;


/**
 *@author Holstad
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class, Services.class })
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userR;

	@Test
	public void writeToDbTest() {
		User user = new User("ola", 1, true);
		userR.save(user);
	}

}
