package se.arole.datalayer.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Issue implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	Integer issueId;
	boolean isSolved;

	public Issue() {

	}

	public Issue(Integer issueId, boolean isSolved) {
		super();
		this.issueId = issueId;
		this.isSolved = isSolved;
	}

	public Integer getIssueId() {
		return issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
	}

	public boolean isSolved() {
		return isSolved;
	}

	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

}
