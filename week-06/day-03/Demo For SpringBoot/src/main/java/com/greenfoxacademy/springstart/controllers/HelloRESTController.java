package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

	@RequestMapping(value="/greeting")
	public @ResponseBody String hello(@RequestParam String name) {
		Greeting greeting = new Greeting(1, "Hello World!");
		return "{ id: " + greeting.getId() + ", " + "content: " + greeting.getContent() + ", " + name + " }";
	}

}
