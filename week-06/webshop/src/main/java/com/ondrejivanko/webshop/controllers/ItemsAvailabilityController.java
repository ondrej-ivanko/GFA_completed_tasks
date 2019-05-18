package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemsAvailabilityController {

	private ShopStorage storage = new ShopStorage();

	@RequestMapping (value="/only-available", method = RequestMethod.GET)
	public String showAvailableItems(Model model) {
		model.addAttribute("items", storage.availableStock());
		return "webshop";
	}
}
