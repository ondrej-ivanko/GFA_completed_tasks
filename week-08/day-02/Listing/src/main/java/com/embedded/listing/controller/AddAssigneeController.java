package com.embedded.listing.controller;

import com.embedded.listing.model.Assignee;
import com.embedded.listing.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
		return "addAss";
	}

	@PostMapping("/addAssignee")
	public String saveAssignee(@ModelAttribute Assignee assignee) {
		repo.save(assignee);
		return "redirect:/assignees";
	}
}
