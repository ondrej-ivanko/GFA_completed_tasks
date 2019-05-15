package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static oracle.jrockit.jfr.events.Bits.intValue;


@RestController
public class HelloRESTController {

	@RequestMapping(value="/greeting")
	public @ResponseBody String hello(@RequestParam String name) {
		Greeting greeting = new Greeting("Hello World!");
			return greeting.getHellos()[intValue(greeting.getId()) - 1] + " " + name + "! This site was loaded " + greeting.getId()
					       + " times since last server start.";
	}

}
