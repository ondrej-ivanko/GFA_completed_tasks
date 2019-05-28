package com.application.foxclub.controllers;

import com.application.foxclub.models.SavedFoxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class FoodDrinkControllers {

	private SavedFoxes foxes;

	@Autowired
	public FoodDrinkControllers(SavedFoxes foxes) {
		this.foxes = foxes;
	}

	@GetMapping(value = "/nutritionStore")
	public String nutritionPage(Model model, @PathParam("name") String name) {
		model.addAttribute("name", name);
		model.addAttribute("food", foxes.findFox(name));
		model.addAttribute("drink", foxes.findFox(name));
		return "nutrition";
	}

	@PostMapping(value = "/nutritionStore")
	public String changeFoodOrDrink(@RequestParam String food,
	                              @RequestParam String drink,
	                              @PathParam("name") String name, Model model) {
		if (food != null) {
			foxes.getCurrentFox().setFood(food);
		} if (drink != null) {
			foxes.getCurrentFox().setDrink(drink);
		}
		model.addAttribute("name", name);
		model.addAttribute("food", foxes.findFox(name));
		model.addAttribute("drink", foxes.findFox(name));
		return "redirect:/index/?name=" + foxes.getCurrentFox().getName();
	}
}
