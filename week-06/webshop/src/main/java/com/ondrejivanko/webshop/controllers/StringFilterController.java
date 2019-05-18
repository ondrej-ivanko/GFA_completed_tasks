package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StringFilterController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/contains-nike")
	public String filterString(Model model) {
		model.addAttribute("items", storage.findNike());
		return "webshop";
	}
}
