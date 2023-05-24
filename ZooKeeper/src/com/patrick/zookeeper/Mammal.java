package com.patrick.zookeeper;

public class Mammal {
	public int energyLevel; 
	
	public Mammal() {
		this.setEnergyLevel(100);
	}
	
	public void displayEnergy() {
		System.out.println("You have "+ energyLevel + "energy" );
	}
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
