package org.practiceAnswers.KirylPalianokAnswers.secondSession;

import org.practiceAnswers.KirylPalianokAnswers.secondSession.model.Animal;
import org.practiceAnswers.KirylPalianokAnswers.secondSession.model.BankAccount;
import org.practiceAnswers.KirylPalianokAnswers.secondSession.model.Dog;
import org.practiceAnswers.KirylPalianokAnswers.secondSession.model.Person;

import java.util.Arrays;

public class SecondSessionKirylPalianok {

	public static void main(String[] args) {

		/* =====================================================
		 * 1️⃣ МАССИВЫ
		 * =====================================================
		 */

        // ЗАДАНИЕ 1.1
		readArray();

		// ЗАДАНИЕ 1.2
		findMinAndMaxElement();

		// ЗАДАНИЕ 1.3
		sumOfAllElements();

		// ЗАДАНИЕ 1.4
		workWithArrayReferences();

		// ЗАДАНИЕ 1.5
		workWithArrays();

		/* =====================================================
		 * 2️⃣ STRING / STRINGBUILDER
		 * =====================================================
		 */

		// ЗАДАНИЕ 2.1
		showStringImmutability();

		// ЗАДАНИЕ 2.2
		compareStrings();

		// ЗАДАНИЕ 2.3
		workWithSB();

		// ЗАДАНИЕ 2.4
		reverseStringWithSB();

		/* =====================================================
		 * 3️⃣ КЛАСС И ОБЪЕКТ
		 * =====================================================
		 */

		// ЗАДАНИЕ 3.1
		Person person = new Person("John", 26);
		person.printInfo();

		// ЗАДАНИЕ 3.2
		BankAccount bankAccount = new BankAccount("Kirill", 500);
		bankAccount.deposit(200);
		bankAccount.getBalance();
		bankAccount.withdraw(701);
		bankAccount.withdraw(100);
		bankAccount.getBalance();

		/* =====================================================
		 * 4️⃣ НАСЛЕДОВАНИЕ
		 * =====================================================
		 */

		// ЗАДАНИЕ 4.2
		Dog dog = new Dog("Albert");
		dog.makeSound();

		// ЗАДАНИЕ 4.3
		demonstratePolymorphism();

		/* =====================================================
		 * 5️⃣ МЕТОДЫ
		 * =====================================================
		 */

        // ЗАДАНИЕ 5.1
		int result1 = sum(5, 3);
		System.out.println("sum(int, int) = " + result1);

		// ЗАДАНИЕ 5.2 (перегрузка)
		double result2 = sum(2.5, 4.3);
		System.out.println("sum(double, double) = " + result2);

		int result3 = sum(1, 2, 3);
		System.out.println("sum(int, int, int) = " + result3);

		// ЗАДАНИЕ 5.3
		System.out.println("printNumbers(1, 5):");
		printNumbers(1, 5);

		// ЗАДАНИЕ 5.4
		int number = 10;
		System.out.println("isEven(" + number + ") = " + isEven(number));

		/* =====================================================
		 * 6️⃣ ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ (⭐)
		 * ===================================================== */

        // ЗАДАНИЕ 6.1 ⭐
		System.out.println("Average of array:");
		averageOfArray();

		System.out.println();

		// ЗАДАНИЕ 6.2 ⭐
		System.out.println("Palindrome check:");
		checkPalindrome();

		System.out.println();

		// ЗАДАНИЕ 6.3 ⭐ (через цикл)
		System.out.println("Factorial with loop:");
		factorialWithLoop(5);

		System.out.println();

		// ЗАДАНИЕ 6.4 ⭐ (через рекурсию)
		System.out.println("Factorial with recursion:");
		factorialWithRecursion(5);

	}

	/* =====================================================
	 * 1️⃣ МАССИВЫ
	 * =====================================================
	 */

	public static void readArray() {

		// ЗАДАНИЕ 1.1
		// Создай массив из 5 целых чисел
		// Заполни его любыми значениями
		// Выведи массив в консоль

		int[] numbers = {34, 12, 4, 67, 102};

		for (int number : numbers) {

			System.out.println(number);
		}
	}



	public static void findMinAndMaxElement() {

		// ЗАДАНИЕ 1.2
		// Найди минимальный и максимальный элемент массива

		int[] numbers = {34, 12, 4, 67, 102};

		int min = numbers[0];
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Минимум: " + min);
		System.out.println("Максимум: " + max);

	}

	public static void sumOfAllElements() {

		// ЗАДАНИЕ 1.3
		// Найди сумму всех элементов массива

		int[] numbers = {34, 12, 4, 67, 102};
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];
		}

		System.out.println("Сумма элементов: " + sum);
	}

	public static void workWithArrayReferences() {

		// ЗАДАНИЕ 1.4
		// Создай второй массив
		// Скопируй ссылку на первый массив
		// Измени любой элемент второго массива
		// Выведи оба массива и ОБЪЯСНИ результат

		int[] numbers = {34, 12, 4, 67, 102};
		int[] values = {1, 4, 3, 10, 3};

		values = numbers;
		values[3] = 100;

		System.out.println("Первый массив:");
		for (int value : values) {
			System.out.println(value);
		}

		System.out.println("Второй массив:");
		for (int number : numbers) {
			System.out.println(number);
		}

		/*
		Массив создаётся в куче, а в переменной хранится ссылка на этот массив.
        При присваивании values = numbers копируется не сам массив, а ссылка на уже существующий объект.
        Поэтому обе переменные указывают на один и тот же массив в памяти.
        При изменении массива через values изменения будут видны и через numbers.
		*/
	}

	public static void workWithArrays() {

		// ЗАДАНИЕ 1.5
		// Создай НОВЫЙ массив
		// Скопируй в него элементы первого массива (поэлементно)
		// Измени новый массив
		// Убедись, что первый не изменился

		int[] numbers = {34, 12, 4, 67, 102};
		int[] values;

		values = Arrays.copyOf(numbers, numbers.length);
		values[2] = 1000;

		System.out.println("Новый массив:");
		for (int value : values) {
			System.out.println(value);
		}

		System.out.println("Исходный массив:");
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	/* =====================================================
	 * 2️⃣ STRING / STRINGBUILDER
	 * =====================================================
	 */

	public static void showStringImmutability() {

		// ЗАДАНИЕ 2.1
		// Создай строку
		// Присвой её другой переменной
		// "Измени" вторую строку
		// Выведи обе строки
		// Объясни, почему первая не изменилась

		String s1 = "Somebody That I Used To Know";
		String s2 = s1;

		s2 = "Somebody Like You";

		System.out.println(s1);
		System.out.println(s2);

		/*
		Строки в Java являются иммутабельными, то есть неизменяемыми.
		При присваивании s2 = s1 обе переменные ссылаются на один объект в куче.
		Однако при выполнении s2 = "The Air That I Breathe" создаётся новый объект строки,
		и переменная s2 начинает ссылаться на него.
        Переменная s1 при этом остаётся ссылаться на исходную строку, поэтому её значение не меняется.
		 */
	}

	public static void compareStrings() {

		// ЗАДАНИЕ 2.2
		// Сравни две строки с помощью == и equals()
		// Выведи результаты

		String s1 = "Somebody That I Used To Know";
		String s2 = "Somebody Like You";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

	public static void workWithSB() {

		// ЗАДАНИЕ 2.3
		// Используя StringBuilder:
		// - собери строку из чисел от 1 до 10 через пробел

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 10; i++) {

			sb.append(i).append(" ");
		}

		String result = sb.toString();
		System.out.println(result);
	}

	public static void reverseStringWithSB() {

		// ЗАДАНИЕ 2.4
		// Используя StringBuilder:
		// - разверни строку "Java"

		StringBuilder sb = new StringBuilder();

		sb.append("Java");
		sb.reverse();

		System.out.println(sb);
	}

	/* =====================================================
	 * 4️⃣ НАСЛЕДОВАНИЕ
	 * =====================================================
	 */

	public static void demonstratePolymorphism() {

		// ЗАДАНИЕ 4.3
        // Создай массив типа Animal
        // Положи туда Animal и Dog
        // Вызови makeSound() в цикле

		Animal[] animals = new Animal[2];
		animals[0] = new Animal();
		animals[1] = new Dog();

		for (Animal animal : animals) {
			animal.makeSound();
		}
	}

	/* =====================================================
	 * 5️⃣ МЕТОДЫ
	 * =====================================================
	 */

	public static int sum(int a, int b) {

		// ЗАДАНИЕ 5.1
		// Создай метод sum(int a, int b)
		// Верни сумму чисел

		return a + b;
	}

	// ЗАДАНИЕ 5.2
	// Перегрузи метод sum:
	// - для double
	// - для трёх int

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void printNumbers(int from, int to) {

		// ЗАДАНИЕ 5.3
		// Создай метод printNumbers(int from, int to)
		// Выведи все числа в диапазоне

		for (int i = from; i <= to; i++) {
			System.out.println(i);
		}
	}

	public static boolean isEven(int number) {

		// ЗАДАНИЕ 5.4
		// Создай метод isEven(int number)
		// Верни true, если число чётное

		return number % 2 == 0;
	}

	/* =====================================================
	 * 6️⃣ ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ (⭐)
	 * ===================================================== */

	public static void averageOfArray() {

		// ЗАДАНИЕ 6.1 ⭐
		// Массив из 5 чисел
		// Найди среднее арифметическое

		int[] numbers = {2, 4, 6, 8, 10};

		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		double average = (double) sum / numbers.length;
		System.out.println("Average: " + average);
	}

	// ЗАДАНИЕ 6.2 ⭐
	public static void checkPalindrome() {

		// ЗАДАНИЕ 6.2 ⭐
		// Возьми любую строку как переменную
		// Определи, является ли она палиндромом

		String text = "level";

		String reversed = new StringBuilder(text).reverse().toString();

		System.out.println(text.equals(reversed));
	}

	// ЗАДАНИЕ 6.3 ⭐ (факториал через цикл)
	public static void factorialWithLoop(int n) {

		// ЗАДАНИЕ 6.3 ⭐
		// Создай метод factorial(int n) - метод выводит в консоль факториал числа n
		// Реализуй через цикл

		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println(result);
	}

	// ЗАДАНИЕ 6.4 ⭐
	// Создай метод factorial(int n) - метод выводит в консоль факториал числа n
	// Реализуй через рекурсию

	public static void factorialWithRecursion(int n) {
		System.out.println(factorial(n));
	}

	private static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}


