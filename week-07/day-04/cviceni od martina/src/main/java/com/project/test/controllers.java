package com.project.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controllers {

	@GetMapping(value = "")
	public String indexPage() {
		return "index";
	}

	@PostMapping(value = "")
	public String submitForm(Model model, @RequestParam String addressing, String name, String surname) {
		model.addAttribute("addresing", addressing);
		model.addAttribute("name", name);
		model.addAttribute("surname", surname);
		return "welcome";
	}

	@RequestMapping(value = "/Welcome", method = RequestMethod.POST)
	public String welcomeUser(Model model, @RequestParam String addressing, String name, String surname) {
		model.addAttribute("addresing", addressing);
		model.addAttribute("name", name);
		model.addAttribute("surname", surname);
		return "welcome";
	}

}
