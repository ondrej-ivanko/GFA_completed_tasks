package com.app.greenfox.controllers;

import com.app.greenfox.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddingStudentsController {

	StudentService service;

	public AddingStudentsController(StudentService service) {
		this.service = service;
	}

	@GetMapping(value = "/gfa/add")
	public String addStudent() {
		return "add_student";
	}

	@GetMapping(value = "/gfa/save")
	public String saveMessage(Model model, @RequestParam String student) {
		service.save(student);
		model.addAttribute("student", student);
		return "studentsaved";
	}

}
