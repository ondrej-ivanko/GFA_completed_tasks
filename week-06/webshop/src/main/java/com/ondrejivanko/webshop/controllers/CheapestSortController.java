package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CheapestSortController {

	private ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/cheapest-first", method = RequestMethod.GET)
	public String sortByCheapest(Model model) {
		model.addAttribute("items", storage.sortedByCheapest());
		return "webshop";
	}
}
