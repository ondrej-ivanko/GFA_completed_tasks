package com.utilities.service.controllers;

import com.utilities.service.service.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulController {

	private UtilityService service;

	public UsefulController(UtilityService service) {
		this.service = service;
	}

	@GetMapping(value = "/useful")
	public String linksToUtilities(Model model) {
		model.addAttribute("color", service.randomColor());
		return "index";
	}
}
