package com.orientation.exam.controllers;

import com.orientation.exam.models.Login;
import com.orientation.exam.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.URI;

@Controller
public class LoginController {

	@Autowired
	LoginService service;

	@GetMapping("/")
	public String loginPage(Model model, @RequestParam (required = false) String alias,
	                        @RequestParam (required = false) String secretCode,
	                        @RequestParam (required = false) boolean error) {
		model.addAttribute("login", new Login());
		model.addAttribute("alias", alias);
		model.addAttribute("code", secretCode);
		model.addAttribute("error", error);
		return "index";
	}

	@PostMapping("/save-link")
	public String acceptLoginInput(@ModelAttribute Login login) {
		if (service.aliasInDatabase(login)) {
			return "redirect:/?error=true";
		} else {
			service.save(login);
			return "redirect:/?alias=" + login.getAlias() + "&secretCode=" + login.getSecretCode();
		}
	}

	@GetMapping("/a/{alias}")
	public String incrementCount(@PathVariable String alias) {
		if (service.findAndIncrement(alias)) {
			return "redirect:" + service.findUrl(alias);
		} else {
			return "Alias does not exist";
		}
	}
}
