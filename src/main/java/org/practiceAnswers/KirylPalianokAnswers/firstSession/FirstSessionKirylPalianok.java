package org.practiceAnswers.KirylPalianokAnswers.firstSession;

import java.util.Arrays;
import java.util.Scanner;

public class FirstSessionKirylPalianok {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * =====================================================
		 * 1️⃣ ПЕРЕМЕННЫЕ, ПРИМИТИВНЫЕ И ССЫЛОЧНЫЕ ТИПЫ, ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
		 * =====================================================
		 */

		showPrimitiveTypes();
		checkConditions();
		workWithArrayReferences();
		showStringBehavior();

		/*
		 * =====================================================
		 * 2️⃣ ОПЕРАТОРЫ ВЕТВЛЕНИЯ (if / else / switch)
		 * =====================================================
		 */

		checkScore();
		showDayOfWeek();
		checkNumberSign();

		/*
		 * =====================================================
		 * 3️⃣ ЦИКЛЫ И ИТЕРАЦИИ
		 * =====================================================
		 */

		printNumbers();
		calculateSum();
		printReverseNumbers();
		readNumbers();
		workWithArray();

	}

	public static void showPrimitiveTypes() {
		System.out.println("=== Задание 1.1 — Простейшие переменные ===");

		// Создай переменные всех примитивных типов
		// Присвой им значения и выведи в консоль

		char flag = 'a';
		byte b = 10;
		short s = 1000;
		int count = 7;
		long longCount = 100000L;
		float pi = 3.14f;
		double temperature = 12.32;
		boolean isVisible = true;

		System.out.println("char: " + flag);
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("integer: " + count);
		System.out.println("long: " + longCount);
		System.out.println("float: " + pi);
		System.out.println("double: " + temperature);
		System.out.println("boolean: " + isVisible);
	}

	public static void checkConditions() {
		System.out.println("\n=== Задание 1.2 — Логические операции ===");

		// Создай две переменные int a и int b
		// Создай boolean result:
		// true, если a > 0 и b < 100
		// Выведи result в консоль

		int a = 22;
		int b = 98;
		boolean result = a > 0 && b < 100;

		System.out.println(result);
	}

	public static void workWithArrayReferences() {
		System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");

		// Создай массив из 5 чисел
		// Скопируй массив в другую переменную
		// Измени первый элемент копии
		// Выведи оба массива и объясни результат

		int[] arr1 = {1, 2, 3, 4, 5};

		int[] arr2 = arr1;

		arr2[0] = 99;

		System.out.println("Первый массив: " + Arrays.toString(arr1));
		System.out.println("Второй массив: " + Arrays.toString(arr2));

		/*
		Массив создаётся в куче, а в переменной хранится ссылка на этот массив.
        При присваивании arr2 = arr1 копируется не сам массив, а ссылка на уже существующий объект.
        Поэтому обе переменные указывают на один и тот же массив в памяти.
        При изменении массива через arr2 изменения будут видны и через arr1.
        Совсем как два пульта, управляющих одним телевизором.
		*/
	}

	public static void showStringBehavior() {
		System.out.println("\n=== Задание 1.4 — String ===");

		// Создай две строки s1 и s2
		// Присвой s2 = s1
		// Измени s2 на другую строку
		// Выведи s1 и s2
		// Объясни, почему s1 не изменился

		String s1 = "Dust in the Wind";
		String s2 = s1;

		s2 = "The Air That I Breathe";

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

	public static void checkScore() {
		System.out.println("\n=== Задание 2.1 — Оценки ===");

		// Создай int score (0-100)
		// Используя if / else if / else, выведи:
		// 90-100 → "Отлично"
		// 70-89 → "Хорошо"
		// 50-69 → "Удовлетворительно"
		// <50 → "Не сдано"

		System.out.println("Введите количество баллов: ");
		int point = SCANNER.nextInt();

		if (point >= 90 && point <= 100) {
			System.out.println("Отлично");
		} else if (point >= 70) {
			System.out.println("Хорошо");
		} else if (point >= 50) {
			System.out.println("Удовлетворительно");
		} else {
			System.out.println("Не сдано");
		}
	}

	public static void showDayOfWeek() {
		System.out.println("\n=== Задание 2.2 — Дни недели ===");

		// Создай int day (1-7)
		// Используя switch, выведи день недели
		// Для всех значений, кроме 1–7, вывести "Некорректный день"

		System.out.println("Введите номер дня недели: ");
		int dayOfWeek = SCANNER.nextInt();

		switch (dayOfWeek) {
			case 1:
				System.out.println("Понедельник");
				break;
			case 2:
				System.out.println("Вторник");
				break;
			case 3:
				System.out.println("Среда");
				break;
			case 4:
				System.out.println("Четверг");
				break;
			case 5:
				System.out.println("Пятница");
				break;
			case 6:
				System.out.println("Суббота");
				break;
			case 7:
				System.out.println("Воскресенье");
				break;
			default:
				System.out.println("Некорректный день");
		}
	}

	public static void checkNumberSign() {
		System.out.println("\n=== Задание 2.3 — Проверка числа ===");

		// Создай int number
		// Если число >0 → "Положительное"
		// Если число <0 → "Отрицательное"
		// Если число ==0 → "Ноль"

		System.out.print("Введите число: ");
		int value = SCANNER.nextInt();

		if (value > 0) {
			System.out.println("Положительное");
		} else if (value < 0) {
			System.out.println("Отрицательное");
		} else {
			System.out.println("Ноль");
		}
	}

	public static void printNumbers() {
		System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");

		// Используя for, выведи числа от 1 до 10

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public static void calculateSum() {
		System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");

		// Используя for, посчитай сумму чисел от 1 до 100 и выведи результат

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			sum += i;

		}

		System.out.println("Сумма: " + sum);
	}

	public static void printReverseNumbers() {
		System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");

		// Используя while, выводи числа от 10 до 1 в обратном порядке

		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

	public static void readNumbers() {
		System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");

		// Используя do-while, спрашивай пользователя вводить число
		// Пока число <=100

		int num;

		do {
			System.out.print("Введите число (нужно больше 100): ");
			num = SCANNER.nextInt();
		} while (num <= 100);

		System.out.println("Спасибо! Вы ввели число больше 100");
	}

	public static void workWithArray() {
		System.out.println("\n=== Задание 3.5 — Массив и итерации ===");

		// Создай массив из 5 чисел
		// Используя for-each, выведи все элементы массива
		// Используя for с индексом, умножь каждый элемент на 2 и выведи новый массив

		int[] numbers = {1, 2, 3, 4, 5};

		System.out.println("Массив: ");
		for (int n : numbers) {
			System.out.print(n + " ");
		}

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}

		System.out.println();
		System.out.println("Массив после умножения на 2:");
		for (int n : numbers) {
			System.out.print(n + " ");
		}
	}
}
