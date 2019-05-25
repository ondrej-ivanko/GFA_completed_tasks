package com.application.foxclub.controllers;

import com.application.foxclub.models.SavedFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

	@Autowired
	private SavedFoxes foxes;

	@GetMapping(value = "/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping(value = "/login")
	public String submitForm(@RequestParam String name) {
		return "redirect:/fox/index/?name=" + name;
	}
}
