package se.arole.datalayer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import se.arole.datalayer.entity.User;
import se.arole.datalayer.entity.WorkItem;

public interface WorkItemRepository extends CrudRepository<WorkItem, Long>{

List<WorkItem> findBySolver(User solver);
List<WorkItem> findByStatus(String status);
WorkItem findByItemId(Integer itemId);

}
