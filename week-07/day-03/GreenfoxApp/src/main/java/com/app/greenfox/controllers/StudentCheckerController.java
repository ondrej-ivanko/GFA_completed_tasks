package com.app.greenfox.controllers;

import com.app.greenfox.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentCheckerController {

	StudentService service;

	public StudentCheckerController(StudentService service) {
		this.service = service;
	}

	@RequestMapping(value = "/gfa/check")
	public String checkIsPresent() {
		return "checker";
	}

	@RequestMapping(value = "/gfa/isPresent", method = RequestMethod.GET)
	@ResponseBody
	public String isPresent(@RequestParam String name) {
		return service.isPresent(name);
	}
}
