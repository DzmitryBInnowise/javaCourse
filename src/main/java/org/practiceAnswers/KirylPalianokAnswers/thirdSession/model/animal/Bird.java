package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.animal;

import org.practiceAnswers.KirylPalianokAnswers.thirdSession.model.interfaces.Flyable;

public class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird is flyable now");
	}
}
