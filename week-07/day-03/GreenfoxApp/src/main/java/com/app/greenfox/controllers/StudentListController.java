package com.app.greenfox.controllers;

import com.app.greenfox.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentListController {

	StudentService service;

	public StudentListController(StudentService service) {
		this.service = service;
	}

	@RequestMapping(value = "/gfa/list")
	public String index(Model model) {
		model.addAttribute("students", service.findAll());
		return "listofstudents";
	}
}
