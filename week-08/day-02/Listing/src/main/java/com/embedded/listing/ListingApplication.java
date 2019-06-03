package com.embedded.listing;


import com.embedded.listing.model.Assignee;
import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.AssigneeRepository;
import com.embedded.listing.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ListingApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository toDoRepository;
	@Autowired
	AssigneeRepository assigneeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
