package com.application.foxclub.controllers;

import com.application.foxclub.models.Fox;
import com.application.foxclub.models.SavedFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

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

	@GetMapping(value = "/index")
	public String loggedIn(Model model, @PathParam("name") String name) {
		Fox myfox = foxes.findFox(name);
		model.addAttribute("fox", myfox);
		model.addAttribute("name", name);
		return "index";
	}

	@GetMapping(value = "/information")
	public String showInfo(Model model, @PathParam("name") String name) {
		model.addAttribute("name", name);
		return "information";
	}
}
