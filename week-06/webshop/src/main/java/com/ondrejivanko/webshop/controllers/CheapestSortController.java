package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CheapestSortController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/cheapest-first", method = RequestMethod.GET)
	public String sortByCheapest(Model model) {
		List<ShopItem> byCheapestItem = storage.getStockedItems().stream()
				.sorted(Comparator.comparingDouble(shopItem -> shopItem.getPrice()))
				.collect(Collectors.toList());
		model.addAttribute("items", byCheapestItem);
		return "webshop";
	}
}
