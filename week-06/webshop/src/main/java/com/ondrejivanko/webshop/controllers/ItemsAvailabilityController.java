package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ItemsAvailabilityController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping (value="/only-available", method = RequestMethod.GET)
	public String showAvailableItems(Model model) {
		List<ShopItem> available = storage.getStockedItems().stream()
				.filter(shopItem -> shopItem.getQuantity() > 0)
				.collect(Collectors.toList());
		model.addAttribute("items", available);
		return "webshop";
	}
}
