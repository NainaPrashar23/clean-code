package org.example.exercises;

import java.util.Arrays;

public class OlxApp {

	private static final String ITEM_AGED_WINE = "Aged Wine";
	private static final String ITEM_BACKSTAGE_PASS = "ColdPlay concert passes";
	private static final String ITEM_LEGENDARY = "PokemonGo";

	private final Item[] items;

	public OlxApp(Item[] items) {
		this.items = items;
	}

	public static void main(String[] args) {
		Item[] items = new Item[] {
				new Item("Mangoes", 10, 20)
		};

		OlxApp app = new OlxApp(items);
		app.updateQuality();
		System.out.println(app);
	}

	public void updateQuality() {
		for (Item item : items) {
			updateItem(item);
		}
	}

	private void updateItem(Item item) {
		switch (item.getName()) {
			case ITEM_AGED_WINE:
				updateAgedWine(item);
				break;
			case ITEM_BACKSTAGE_PASS:
				updateBackstagePass(item);
				break;
			case ITEM_LEGENDARY:
				break;
			default:
				updateRegularItem(item);
				break;
		}

		if (!item.getName().equals(ITEM_LEGENDARY)) {
			item.setSellIn(item.getSellIn() - 1);
		}

		if (item.getSellIn() < 0) {
			handleExpiredItem(item);
		}
	}

	private void updateAgedWine(Item item) {
		increaseQuality(item, 1);
	}

	private void updateBackstagePass(Item item) {
		increaseQuality(item, 1);
		if (item.getSellIn() <= 10) increaseQuality(item, 1);
		if (item.getSellIn() <= 5) increaseQuality(item, 1);
	}

	private void updateRegularItem(Item item) {
		if (item.getQuality() > 0) {
			item.setQuality(item.getQuality() - 1);
		}
	}

	private void handleExpiredItem(Item item) {
		switch (item.getName()) {
			case ITEM_AGED_WINE:
				increaseQuality(item, 1);
				break;
			case ITEM_BACKSTAGE_PASS:
				item.setQuality(0);
				break;
			case ITEM_LEGENDARY:
				break;
			default:
				if (item.getQuality() > 0) {
					item.setQuality(item.getQuality() - 1);
				}
				break;
		}
	}

	private void increaseQuality(Item item, int amount) {
		int newQuality = Math.min(50, item.getQuality() + amount);
		item.setQuality(newQuality);
	}

	@Override
	public String toString() {
		return Arrays.toString(items);
	}
}