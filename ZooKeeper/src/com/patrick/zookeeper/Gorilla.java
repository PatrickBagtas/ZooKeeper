package com.patrick.zookeeper;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}

	
	public void throwSomething() {
		System.out.println("Gorilla man threw thing");
		energyLevel -=5;
		displayEnergy();
	}
	
	public void eatBananas(){
		System.out.println("Gorilla man satisfied by eating banana");
		energyLevel +=10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla man has climbed a tree");
		energyLevel -=10;
		displayEnergy();
	}
}
