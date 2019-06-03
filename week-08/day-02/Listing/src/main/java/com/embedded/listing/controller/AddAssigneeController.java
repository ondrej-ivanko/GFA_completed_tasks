package com.embedded.listing.controller;

import com.embedded.listing.model.Assignee;
import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.AssigneeRepository;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AddAssigneeController {

	@Autowired
	private AssigneeRepository repo;

	@GetMapping("/addAssignee")
	public String showForm(Model model) {
		model.addAttribute("assignee", new Assignee());
		model.addAttribute("newTask", new ToDo());
		return "addAss";
	}

	@PostMapping("/addAssignee")
	public String saveAssignee(@ModelAttribute Assignee assignee,
	                           @ModelAttribute ToDo todo) {
		if (!todo.getTitle().equals("")) {
			assignee.addToDo(todo);
		} if (!assignee.getEmail().equals("") || !assignee.getName().equals("")) {
			repo.save(assignee);
		}
		return "redirect:/assignees";
	}
}
