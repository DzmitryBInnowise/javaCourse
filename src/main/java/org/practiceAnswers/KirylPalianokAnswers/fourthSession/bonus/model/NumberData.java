package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.model;

import java.io.Serializable;
import java.util.List;

public class NumberData implements Serializable {

	private final List<Integer> numbers;

	public NumberData(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}
}
