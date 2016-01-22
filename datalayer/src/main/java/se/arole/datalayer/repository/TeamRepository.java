package se.arole.datalayer.repository;

import org.springframework.data.repository.CrudRepository;

import se.arole.datalayer.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
	Team findByTeamId(Integer teamId);
}
