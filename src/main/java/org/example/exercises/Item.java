package org.example.exercises;

public class Item {

	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public int getQuality() {
		return quality;
	}

	@Override
	public String toString() {
		return String.format("Item{name='%s', sellIn=%d, quality=%d}", name, sellIn, quality);
	}
}
