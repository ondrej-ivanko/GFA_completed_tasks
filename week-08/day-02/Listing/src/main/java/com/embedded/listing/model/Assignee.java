package com.embedded.listing.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long aId;
	private String name;
	private String email;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ToDo> toDos = new ArrayList<>();

	public Assignee() {
	}

	public Assignee(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void addToDo(ToDo toDo) {
		toDos.add(toDo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public List<ToDo> getToDos() {
		return toDos;
	}

	public void setToDos(List<ToDo> toDos) {
		this.toDos = toDos;
	}
}
