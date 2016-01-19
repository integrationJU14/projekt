package se.arole.datalayer.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import se.arole.datalayer.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Serializable> {

}
