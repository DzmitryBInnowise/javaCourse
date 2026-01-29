package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

public class Box<T> {

	private T value;
	private T[] array;

	public Box(T value) {
		this.value = value;
	}

	public Box(T[] array) {
		this.array = array;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T[] getArray() {
		return array;
	}

	public static <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}
}
