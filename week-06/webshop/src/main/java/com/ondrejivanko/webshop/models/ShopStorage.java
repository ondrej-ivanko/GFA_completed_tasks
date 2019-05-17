package com.ondrejivanko.webshop.models;

import java.util.ArrayList;
import java.util.List;

public class ShopStorage {

	private List<ShopItem> stockedItems = new ArrayList<>();

	public void addItem(ShopItem item) {
		stockedItems.add((item));
	}

	public List<ShopItem> getStockedItems() {
		return stockedItems;
	}
}
