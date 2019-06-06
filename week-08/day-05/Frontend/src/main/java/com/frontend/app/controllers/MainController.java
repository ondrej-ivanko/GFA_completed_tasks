package com.frontend.app.controllers;

import com.frontend.app.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

	@GetMapping("/doubling")
	public Object doubleIt(@RequestParam (required = false) Integer input) {
		if (input != null) {
			Doubling doubling = new Doubling(input);
			return doubling;
		} else {
			Error error = new Error("Please provide an input!");
			return error;
		}
	}

	@GetMapping("/greeter")
	public Object greeter(@RequestParam (required = false) String name,
	                      @RequestParam (required = false) String title) {
		if (name != null && title != null) {
			Person person = new Person(name, title);
			return person;
		} if (name == null && title == null) {
			return new Error("Please provide a name and a title!");
		} if (name != null && title == null) {
			return new Error("Please provide a title!");
		} else {
			return new Error("Please provide a name!");
		}
	}

	@GetMapping("/appenda/{appendable}")
	public Object appender(@PathVariable (required = false) String appendable) {
		AppendA appendA = new AppendA(appendable);
		if (appendable == null) {
			ResponseEntity responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
			return responseEntity;
		} else {
			return appendA;
		}
	}

	@PostMapping(value = "/dountil/{action}")
	public Object repeater(@PathVariable String action, @RequestBody Until until) {
		if (until != null) {
		NumModifier modifier = new NumModifier(until, action);
		return modifier;
		} else {
			return new Error("Please provide a number!");
		}
	}
}
