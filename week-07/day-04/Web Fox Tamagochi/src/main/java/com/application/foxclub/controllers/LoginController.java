package com.application.fox.controllers;

import com.application.fox.models.SavedFoxes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

	private SavedFoxes foxes = new SavedFoxes();

	@GetMapping(value = "/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginWithFox(Model model, @RequestParam String name) {
		model.addAttribute("name", name);
		if (name == null) {
			return "redirect:/login";
		} else if (foxes.isInList(name)) {
		return "redirect:/login";
		}
		return "redirect:/name=" + name;
	}
}
