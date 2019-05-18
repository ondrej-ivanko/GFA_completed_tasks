package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MostExpensiveItemController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/most-expensive", method = RequestMethod.GET)
	public String mostExpensiveItem(Model model) {
		model.addAttribute("items", storage.mostExpensive());
		return "webshop";

	}

}
