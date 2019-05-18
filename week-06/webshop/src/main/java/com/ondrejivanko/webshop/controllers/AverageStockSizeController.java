package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AverageStockSizeController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/average-stock")
	public String averageStock(Model model) {
		double average = storage.getStockedItems().stream()
				.map(ShopItem::getQuantity)
				.mapToDouble(item -> item)
				.average()
				.getAsDouble();
		model.addAttribute("averagestock", average);
		return "average";

	}
}
