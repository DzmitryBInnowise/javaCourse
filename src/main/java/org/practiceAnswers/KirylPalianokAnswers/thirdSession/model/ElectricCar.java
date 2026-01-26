package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model;

public class ElectricCar extends Vehicle implements Electric{

	@Override
	public void charge() {
		System.out.println("Charging...");
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}
}
