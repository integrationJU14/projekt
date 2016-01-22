package se.arole.datalayer.serviceImp;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import se.arole.datalayer.config.Config;
import se.arole.datalayer.config.Services;
import se.arole.datalayer.entity.Team;

/**
 * @author Holstad
 *
 */
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class, Services.class })
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class TeamServiceImpTest {

	private Team team;
	@Autowired
	private TeamServiceImp teamServiceImp;

	@Before
	public void initTeam() {
		team = new Team("teamOne", 1);
	}
	
	@Test
	public void addTeam(){
		teamServiceImp.createTeam(team);
	}
}
