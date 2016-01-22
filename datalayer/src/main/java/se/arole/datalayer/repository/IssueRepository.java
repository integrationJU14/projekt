package se.arole.datalayer.repository;

import org.springframework.data.repository.CrudRepository;

import se.arole.datalayer.entity.Issue;

public interface IssueRepository extends CrudRepository<Issue, Long> {
	Issue findByIssueId(Integer issueId);
}
