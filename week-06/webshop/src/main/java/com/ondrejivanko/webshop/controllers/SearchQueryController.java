package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SearchQueryController {

	private ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/search-item", method = RequestMethod.POST)
	public String searchQuery(Model model, @RequestParam String query) {
		model.addAttribute("items", storage.findQuery(query));
		return "webshop";
	}
}
