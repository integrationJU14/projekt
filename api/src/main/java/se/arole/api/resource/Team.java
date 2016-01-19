package se.arole.api.resource;

import java.util.List;

public class Team {
	
	long teamId;
	String teamName;
	List<User> teamUsers;
	
	public Team(long teamId, String teamName) {
		this.teamId = teamId;
		this.teamName = teamName;
	}

}
