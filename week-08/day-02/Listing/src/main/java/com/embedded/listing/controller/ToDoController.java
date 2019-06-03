package com.embedded.listing.controller;

import com.embedded.listing.model.Assignee;
import com.embedded.listing.model.ToDo;
import com.embedded.listing.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/todo")
public class ToDoController {

	@Autowired
	private ToDoRepository repository;

	@GetMapping(value = {"/", "/list"})
	public String mainPage(Model model, @RequestParam (required = false) boolean isActive,
	                       @RequestParam (required = false) String query) {
		if (isActive) {
			Iterable<ToDo> iterable = repository.findAll();
			List<ToDo> wasDone = StreamSupport.stream(iterable.spliterator(), false)
					                     .filter(ToDo::isDone).collect(Collectors.toList());
			model.addAttribute("todos", wasDone);
		} else if (query != null) {
			model.addAttribute("todos", query);
		} else {
			model.addAttribute("todos", repository.findAll());
		}
		return "todolist";
	}

	@GetMapping(value = "list/{id}/delete")
	public String deleteItem(@PathVariable long id) {
		repository.deleteById(id);
		return "redirect:/todo/list";
	}

	@GetMapping(value = "/list/{id}/edit")
	public String editItem(@PathVariable long id, Model model) {
		ToDo item = repository.findById(id).get();
		model.addAttribute("item", item);
		model.addAttribute("newAssignee", new Assignee());
		model.addAttribute("assigneeForDeletion", item.getAssignees());
		return "editable";
	}

	@PostMapping(value = "/list/{id}/edit")
	public String saveChanges(@ModelAttribute ToDo item, @ModelAttribute Assignee assignee,
	                          @RequestParam (required = false) Assignee toRemove,
	                          @PathVariable long id) {
		item.setId(id);
		if (!assignee.getName().equals("") || !assignee.getEmail().equals("")) {
			item.addAssignee(assignee);
			repository.save(item);
		}
		if (toRemove != null) {
			item.removeAssignee(toRemove);
			item.getAssignees().remove(toRemove);
		}
		return "redirect:/todo/list";
	}

	@PostMapping(value = "/list")
	public String showSearchedItem(@RequestParam String query, Model model) {
		model.addAttribute("todos", repository.findMyQuery(query));
		return "todolist";
	}




}
