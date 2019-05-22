package com.utilities.service.controllers;

import com.utilities.service.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

	private UtilityService service;

	public EmailController(UtilityService service) {
		this.service = service;
	}

	@GetMapping(value = "/useful/{email}")
	public String checkMail(Model model, @RequestParam String email) {
		if (service.validateEmail(email)) {
			model.addAttribute("email", email + "is a valid email address");
		} else {
			model.addAttribute("email", email + "is not a valid email address");
		}
		return "index";
	}
}
