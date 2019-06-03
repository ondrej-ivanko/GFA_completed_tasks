package com.reddit.page.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String header;
	private String subject;
	private int votes = 0;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new Date();

	public Post(){
	}

	public Post(String header, String subject) {
		this.header = header;
		this.subject = subject;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public void downVote() {
		this.votes = this.votes - 1;
	}

	public void upVote() {
		this.votes = this.votes + 1;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
