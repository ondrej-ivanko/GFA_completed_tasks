package com.embedded.listing.controller;

import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class AddTaskController {

	@Autowired
	ToDoRepository repository;


	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("newTodo", new ToDo());
		return "addform";
	}

	@PostMapping("/add")
	public String saveItem(@ModelAttribute ToDo todo) {
		repository.save(todo);
		return "redirect:/todo/list";
	}
}
