package com.embedded.listing.controller;

import com.embedded.listing.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	private ToDoRepository repository;

	@GetMapping("/")
	public String initPage(Model model) {
		return "todolist";
	}

	@GetMapping("/list")
	public String mainPage(Model model) {
		model.addAttribute("todos", repository.findAll());
		return "todolist";
	}

}
