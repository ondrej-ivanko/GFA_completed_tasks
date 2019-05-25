package com.application.foxclub.controllers;

import com.application.foxclub.models.SavedFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


	private SavedFoxes foxes;

	@Autowired
	public MainController(SavedFoxes foxes) {
		this.foxes = foxes;
	}

	@GetMapping(value = "")
	public String homePage() {
		return "login";
	}

	@GetMapping(value = "/fox/index")
	public String loggedIn(Model model, @RequestParam String name) {
		model.addAttribute("name", name);
		return "index";
	}

	/*@GetMapping(value = "fox/index/information")
	public String showInfo(Model model, @RequestParam String name) {
		model.addAttribute("name", name);
		return "index";
	}*/
}
