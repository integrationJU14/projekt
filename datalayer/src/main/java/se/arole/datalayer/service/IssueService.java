package se.arole.datalayer.service;

import java.util.List;
import se.arole.datalayer.entity.Issue;

public interface IssueService {
	
	Issue createIssue(Issue issue);
	
	Issue updateIssue(Issue issue, int issueId);
	
	void addIssueToWorkItem(int workItemId, Issue issue);
	
	List<Issue> workItemsWithIssues(/**/);

}
