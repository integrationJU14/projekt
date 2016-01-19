package se.arole.datalayer.service;

import java.util.List;

import se.arole.datalayer.entity.Team;
import se.arole.datalayer.entity.User;

public interface TeamService {

	Team saveTeam(Team team);

	Team updateTeam(Team team, int teamId);

	List<Team> getAllTeams();

	void addUser(User user, int teamId);

}
