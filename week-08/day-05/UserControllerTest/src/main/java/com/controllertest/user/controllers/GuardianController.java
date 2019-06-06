package com.controllertest.user.controllers;

import com.controllertest.user.models.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

	@GetMapping("/groot")
	public Object get(@RequestParam (required = false) String message) {
		if (message == null || message.isEmpty()) {
			return new Error("I am groot.");
		} else {
			Message msg = new Message(message);
			return msg;
		}
	}
}
