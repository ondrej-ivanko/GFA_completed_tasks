package com.utilities.service.controllers;

import com.utilities.service.service.CaesarEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DecryptController {

	CaesarEncoder encoder;

	@Autowired
	public DecryptController(CaesarEncoder encoder) {
		this.encoder = encoder;
	}

	@RequestMapping(value = "/useful/decode/", method = RequestMethod.GET)
	public String encode() {
		return "index";
	}

	@RequestMapping(value = "/useful/decode/", method = RequestMethod.POST)
	public String encode(Model model, @RequestParam String query, @RequestParam int num) {
		String decoded = encoder.caesar(query, num * (-1));
		model.addAttribute("decrypt", decoded);
		return "encoder";
	}
}
