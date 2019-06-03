package com.embedded.listing.controller;

import com.embedded.listing.model.Assignee;
import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneesController {

	@Autowired
	private AssigneeRepository repo;

	@GetMapping("/assignees")
	public String listOfAssignees(Model model) {
		model.addAttribute("assignees",repo.findAll());
		return "assigneelist";
	}

	@PostMapping(value = "/assignees")
	public String refineAsignees(@RequestParam String query, Model model) {
		model.addAttribute("assignees", repo.findAnyUser(query));
		return "assigneelist";
	}

	@GetMapping(value = "{id}/delete")
	public String deleteItem(@PathVariable long id) {
		repo.deleteById(id);
		return "redirect:/assignees";
	}

	@GetMapping(value = "/{id}/edit")
	public String editItem(@PathVariable long id, Model model) {
		Assignee assignee = repo.findById(id).get();
		model.addAttribute("assignee", assignee);
		model.addAttribute("newTask", new ToDo());
		return "edit-assignee";
	}

	@PostMapping(value = "/{id}/edit")
	public String saveChanges(@ModelAttribute Assignee assignee,
	                          @ModelAttribute ToDo todo,
	                          @PathVariable long id) {
		assignee.setId(id);
		if (!todo.getTitle().equals("")) {
			assignee.addToDo(todo);
		} if (!assignee.getEmail().equals("") || !assignee.getName().equals("")) {
			repo.save(assignee);
		}
		return "redirect:/assignees";
	}
}
