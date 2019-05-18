package com.ondrejivanko.webshop.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShopStorage {

	private List<ShopItem> stockedItems = Arrays.asList(new ShopItem("nike shoes", "running shoes", 1500, 15),
			new ShopItem("sweater", "woolen sweater", 800, 5));

	// public void addItem(ShopItem item) {
	//	stockedItems.add((item));
	// }

	public List<ShopItem> getStockedItems() {
		return stockedItems;
	}

	public double averageStockSize() {
		double average = getStockedItems().stream()
				                 .map(ShopItem::getQuantity)
				                 .mapToDouble(item -> item)
				                 .average()
				                 .getAsDouble();
		return average;
	}

	public List<ShopItem> sortedByCheapest() {
		List<ShopItem> byCheapestItem = getStockedItems().stream()
				                                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
				                                .collect(Collectors.toList());
		return byCheapestItem;
	}

	public List<ShopItem> availableStock() {
		List<ShopItem> available = getStockedItems().stream()
				                           .filter(shopItem -> shopItem.getQuantity() > 0)
				                           .collect(Collectors.toList());
		return available;
	}

	public List<ShopItem> mostExpensive() {
		List<ShopItem> expItemList = new ArrayList<>();
		getStockedItems()
				.stream()
				.max(Comparator.comparingDouble(ShopItem::getPrice))
				.ifPresent(expItemList::add);
		return expItemList;
	}

	public List<ShopItem> findQuery(String query) {
		List<ShopItem> queriedItems = getStockedItems().stream()
				                              .filter(shopItem -> shopItem.getName().contains(query) || shopItem.getDescription().contains(query))
				                              .collect(Collectors.toList());
		return queriedItems;
	}

	public List<ShopItem> findNike() {
		List<ShopItem> matchingItems = getStockedItems().stream()
				                               .filter(shopItem -> shopItem.getDescription().contains("nike")
						                                                   || shopItem.getName().contains("nike"))
				                               .collect(Collectors.toList());
		return matchingItems;
	}
}
