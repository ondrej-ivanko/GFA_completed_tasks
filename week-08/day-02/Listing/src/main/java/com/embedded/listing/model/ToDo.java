package com.embedded.listing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	Long id;
	private boolean urgent = false;
	private String title;
	private boolean done = false;
	@Temporal(TemporalType.DATE)
	private Date date = new Date();

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Assignee> assignees = new ArrayList<>();

	public ToDo(){
	}

	public ToDo(boolean urgent, String title, boolean done) {
		this.urgent = urgent;
		this.title = title;
		this.done = done;
	}

	public void addAssignee(Assignee assignee) {
		this.assignees.add(assignee);
		assignee.addToDo(this);
	}

	public ToDo(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Assignee> getAssignees() {
		return assignees;
	}

	public void setAssignees(List<Assignee> assignees) {
		this.assignees = assignees;
	}

	public String nameAss() {
		return this.getAssignees().stream().findAny().get().toString();
	}
}
