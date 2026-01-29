package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

import java.util.List;

public class Calculator<T extends Number> {

	private T value;

	public Calculator(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public double doubleValue() {
		return value.doubleValue();
	}

	public static void printNumbers(List<? extends Number> list) {

		for (Number number : list) {
			System.out.println(number);
		}
	}
}
