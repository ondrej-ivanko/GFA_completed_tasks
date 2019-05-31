package com.form.posting.controllers;

import model.Pub;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * PubController
 */
@Controller
public class PubController {



	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("pubForForm", (new Pub()));
		return "index";
	}

	@PostMapping("/")
	public String save(@ModelAttribute Pub pub) {
		pub.getAllPubs().add(pub);
		return "redirect:/";
	}

}