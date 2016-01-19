package se.arole.datalayer.services;

import java.util.List;

import se.arole.datalayer.entity.Status;
import se.arole.datalayer.entity.Team;
import se.arole.datalayer.entity.User;
import se.arole.datalayer.entity.WorkItem;

public interface WorkItemService {

	WorkItem createWorkItem(WorkItem workItem);

	void changeStatusWorkItem(Status status, long workItemId);

	void addWorkItemToUser(WorkItem workItem, User user);

	List<WorkItem> workItemByStatus(Status status);

	List<WorkItem> workItemsByTeam(Team team);

	List<WorkItem> workItembyUser(User user);

	WorkItem descriptionWorkItem(String description);

}
