package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AverageStockSizeController {

	private ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/average-stock")
	public String averageStock(Model model) {
		model.addAttribute("averagestock", storage.averageStockSize());
		return "average";
	}
}
