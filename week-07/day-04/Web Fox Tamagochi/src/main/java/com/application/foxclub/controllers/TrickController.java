package com.application.foxclub.controllers;

import com.application.foxclub.models.Fox;
import com.application.foxclub.models.SavedFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
public class TrickController {

	private SavedFoxes foxes;

	@Autowired
	public TrickController(SavedFoxes foxes) {
		this.foxes = foxes;
	}

	@GetMapping(value = "/trickCenter")
	public String tricksPage(Model model, @PathParam("name") String name) {
		model.addAttribute("name", name);
		model.addAttribute("tricks", foxes.getTricks());
		return "tricks";
	}

	@RequestMapping(value = "/trickCenter", method = RequestMethod.POST)
	public String addTrick(Model model, @RequestParam String trick) {
		model.addAttribute("tricks", foxes.getTricks());
		Fox fox = foxes.findFox(foxes.getCurrentFox().getName());
		if (!fox.getTricks().contains(trick)) {
			fox.getTricks().add(trick);
			foxes.getTricks().remove(trick);
		}
		return "redirect:/index/?name=" + foxes.getCurrentFox().getName();
	}

}
