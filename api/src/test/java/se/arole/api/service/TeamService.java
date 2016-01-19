package se.arole.api.service;

import java.util.List;

import se.arole.api.resource.Team;
import se.arole.api.resource.User;

public interface TeamService {
	
	Team saveTeam(Team team);
	Team updateTeam(Team team, int teamId);
	List<Team> getAllTeams();
	void addUser(User user, int teamId);
	

}
