package se.arole.datalayer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
}
