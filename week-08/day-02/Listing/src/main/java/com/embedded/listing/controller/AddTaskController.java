package com.embedded.listing.controller;

import com.embedded.listing.model.Assignee;
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
		model.addAttribute("newAssignee", new Assignee());
		return "addform";
	}

	@PostMapping("/add")
	public String saveItem(@ModelAttribute ToDo todo, @ModelAttribute Assignee assignee) {
		if (!assignee.getName().equals("") || !assignee.getEmail().equals("")) {
			todo.addAssignee(assignee);
		} if (!todo.getTitle().equals("")) {
			repository.save(todo);
		}
		return "redirect:/todo/list";
	}
}
