package com.greenfox.messageservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwitcherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SwitcherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
	}
}
