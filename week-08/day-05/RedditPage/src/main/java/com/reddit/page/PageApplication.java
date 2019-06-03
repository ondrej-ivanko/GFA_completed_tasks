package com.reddit.page;

import com.reddit.page.model.Post;
import com.reddit.page.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PageApplication implements CommandLineRunner {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(PageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
