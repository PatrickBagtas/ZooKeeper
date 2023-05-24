package com.patrick.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("woosh (Bat has started flying)");
		energyLevel -=50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("nom nom ( Bat has eaten a human");
		energyLevel +=25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("crackalackin (A town has been set on fire)");
		energyLevel -=100;
		displayEnergy();
	}
}
