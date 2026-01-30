package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.service;

import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.model.NumberData;

import java.util.List;

public class NumberService {

	public int findMax(NumberData data) {
		List<Integer> numbers = data.getNumbers();

		if (numbers == null || numbers.isEmpty()) {
			throw new IllegalStateException("Список чисел пуст");
		}

		int max = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
		}

		return max;
	}

}
