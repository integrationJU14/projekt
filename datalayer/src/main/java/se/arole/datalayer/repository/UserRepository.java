package se.arole.datalayer.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import se.arole.datalayer.entity.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
User findByName(String name);
}
