package se.arole.datalayer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class WorkItem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	Integer itemId;
	String description;
	String status;
	@ManyToOne
    @JoinColumn(name = "userID")
	User solver;
	public WorkItem() {
		
	}
	public WorkItem(Integer itemId, String description, String status) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.status = status;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getSolver() {
		return solver;
	}
	public void setSolver(User solver) {
		this.solver = solver;
	}
	
	
	
}
