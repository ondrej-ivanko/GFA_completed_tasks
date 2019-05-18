package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebShopInitializer {

	private ShopStorage storage = new ShopStorage();

	@RequestMapping (value="/webshop", method = RequestMethod.GET)
	public String outputList(Model model) {
		model.addAttribute("items", storage.getStockedItems());
		return "webshop";
	}
}
