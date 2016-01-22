package se.arole.datalayer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import se.arole.datalayer.entity.User;
/**
 * @author Holstad
 *
 */
@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	User findByUserId(Integer userId);
}
