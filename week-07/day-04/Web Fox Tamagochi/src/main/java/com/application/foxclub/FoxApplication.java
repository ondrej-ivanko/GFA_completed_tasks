package com.application.fox;

import com.application.fox.models.SavedFoxes;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoxApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
