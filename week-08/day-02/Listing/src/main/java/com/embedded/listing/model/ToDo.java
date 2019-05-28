package com.embedded.listing.model;

import javax.persistence.*;

@Entity
public class ToDo {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private	Long id;
	private boolean urgent = false;
	private String title;
	private boolean done = false;

	public ToDo(){
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
}
