package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class StringFilterController {

	@RequestMapping(value = "/contains-nike")
	public String filterString(Model model) {
		ShopStorage storage = new ShopStorage();
		List<ShopItem> matchingItems = storage.getStockedItems().stream()
				.filter(shopItem -> shopItem.getDescription().contains("nike")
						                    || shopItem.getName().contains("nike"))
				.collect(Collectors.toList());
		model.addAttribute("items", matchingItems);
		return "webshop";
	}
}
