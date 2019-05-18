package com.ondrejivanko.webshop.models;

import java.util.Arrays;
import java.util.List;

public class ShopStorage {

	private List<ShopItem> stockedItems = Arrays.asList(new ShopItem("nike shoes", "running shoes", 1500, 15),
			new ShopItem("sweater", "woolen sweater", 800, 5));

	public void addItem(ShopItem item) {
		stockedItems.add((item));
	}

	public List<ShopItem> getStockedItems() {
		return stockedItems;
	}


}
