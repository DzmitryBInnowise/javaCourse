package org.practiceAnswers.KirylPalianokAnswers.thirdSession.model;

public class Counter {

	private static int count = 0;
	private final int MAX = 100;

	public Counter() {
		count++;
	}

	public static int getCount() {
		return count;
	}

}
