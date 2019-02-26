package com.builtbroken.deadmanssatchel.config;

public class SatchelWorldData {
	
	public final int openTimer;
	public final int dropTimer;
	public final float randomBagDropChance;
	public final float randomBagItemDropChance;
	public final boolean onlyOwner;
	
	public SatchelWorldData(int openTimer, int dropTimer, float randomBagDropChance, float randomBagItemDropChance, boolean onlyOwner) {
		this.openTimer = openTimer;
		this.dropTimer = dropTimer;
		this.randomBagDropChance = randomBagDropChance;
		this.randomBagItemDropChance = randomBagItemDropChance;
		this.onlyOwner = onlyOwner;
	}
	
	
}