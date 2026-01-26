package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.vehicle;

import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.interfaces.Electric;

public class ElectricCar extends Vehicle implements Electric {

	@Override
	public void charge() {
		System.out.println("Charging...");
	}

	@Override
	public void move() {
		System.out.println("Moving...");
	}
}
