package com.embedded.listing;

import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingApplication implements CommandLineRunner {

	@Autowired
	ToDoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ListingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new ToDo("Clean the House"));
		repository.save(new ToDo("Learn ORM"));
		repository.save(new ToDo("Fuck this shit!!"));
		repository.save(new ToDo("Learn SQL"));
	}
}
