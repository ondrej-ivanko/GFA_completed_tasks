package com.ondrejivanko.webshop.controllers;

import com.ondrejivanko.webshop.models.ShopItem;
import com.ondrejivanko.webshop.models.ShopStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
public class MostExpensiveItemController {

	ShopStorage storage = new ShopStorage();

	@RequestMapping(value = "/most-expensive", method = RequestMethod.GET)
	public String mostExpensiveItem(Model model) {
		List<ShopItem> expItemList = new ArrayList<>();
		storage.getStockedItems()
				                     .stream()
				                     .max(Comparator.comparingDouble(ShopItem::getPrice))
				                               .ifPresent(expItemList::add);
		model.addAttribute("items", expItemList);
		return "webshop";

	}

}
