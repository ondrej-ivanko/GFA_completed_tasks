package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SearchQueryController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchQuery(@RequestParam String query, Model model) {
		List<ShopItem> queriedItems = storage.getStockedItems().stream()
				.filter(shopItem -> shopItem.getName().contains(query) || shopItem.getDescription().contains(query))
				.collect(Collectors.toList());
		model.addAttribute("items", queriedItems);
		return "webshop";
	}
}
