package com.app.greenfox.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentServiceInt {

	public List<String> findAll();

	public void save(String student);

	public int count();

	public String isPresent(String student);
}
