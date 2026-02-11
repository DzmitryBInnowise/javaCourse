package org.practiceAnswers.KirylPalianokAnswers.seventhSession;

import org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.config.SettingsSingleton;
import org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.connection.Connection;
import org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.connection.ConnectionPool;
import org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.logging.Logger;
import org.practiceAnswers.KirylPalianokAnswers.seventhSession.model.Person;
import org.practiceAnswers.KirylPalianokAnswers.seventhSession.model.User;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SeventhSessionKirylPalianok {
	public static void main(String[] args) {

		// ================================
		// PART 1: OPTIONAL
		// ================================

		//Task 1

		getOptionalString("Hey");

		// Task 2

		useOptionalInteger(10);

		// Task 3

		demonstrateUserClass();

		// Task 4

		removeEmptyOptional();

		//Task 5

		getLengthIfGreaterThanFive("Go Go Dancer");

		// ================================
		// PART 2: LAMBDA & STREAM API
		// ================================

		//Task 6

		List<Integer> integers = List.of(1, 2, 3, 4, 5);
		System.out.println(getNewIntegers(integers));

		//Task 7

		List<String> strings = List.of("hello", "hi", "bye", "good morning");
		System.out.println(getStringsToUpperCase(strings));

		//Task 8

		getAdults(List.of(new Person("Johny", 12),
						new Person("Grace", 45),
						new Person("Mike", 14),
						new Person("Angela", 37))
		);

		//Task 9

		getSumOfIntegers(List.of(1, 3, 4, 9, 0));
		getProductOfIntegers(List.of(2, 4, 6, 8));

		// Task 10

		sortList();

		//Task 11

		filterMap(Map.of("Clark", 40, "Amy", 10, "Huston", 90));

		//Task 12

		checkListOfStrings(List.of("Hello", "Again", "Friend", "Of", "The", "Friend"));

		// ================================
		// PART 3: SINGLETON PATTERN
		// ================================

		// Task 13:
		// Создай класс SettingsSingleton.
		// Реализуй паттерн Singleton.
		// Добавь поле String language.
		// Добавь методы:
		// getLanguage()
		// setLanguage(String language)

		SettingsSingleton.getInstance().setLanguage("EN");
		System.out.println(SettingsSingleton.getInstance().getLanguage());

		// Task 14:
		// Создай потокобезопасный Singleton для класса Logger.
		// Добавь метод log(String message).

		Logger.getInstance().log("Проверка логгера.");

		// Task 15:

		System.out.println("---------------");
		testLoggerProtection();
		System.out.println("---------------");
		testSettingsProtection();

		// ================================
		// PART 4: OBJECT POOL PATTERN
		// ================================

		// Task 16-20:

		simulatePoolWork();

		// ================================
		// PART 5: SITUATIONAL TASKS
		// ================================

		// Task 21:

		System.out.println(getOptional());

		// Task 22:

		useForEachWithStreamAPI();

		// Task 23:

		demonstrateStreamReadability();
	}


	// ================================
	// PART 1: OPTIONAL
	// ================================

	// Task 1
	// Создай метод getOptionalString(String s),
	// который возвращает Optional<String>.
	// Если s == null или пустая строка — вернуть Optional.empty().

	public static Optional<String> getOptionalString(String s) {

		return Optional.ofNullable(s)
				.filter(str -> !str.isEmpty());
	}

	// Task 2
	// Создай Optional<Integer>.
	// Используя ifPresent и orElse, выведи:
	// - значение, если оно есть
	// - сообщение "No value", если его нет.

	public static void useOptionalInteger(int integer) {

		Optional<Integer> optional = Optional.of(integer);

		optional.ifPresent(value ->
				System.out.println("(isPresent) Value: " + value)
		);

		System.out.println("(orElse) Value: " +
				optional
						.map(String::valueOf)
						.orElse("No value")
		);
	}

	// Task 3
	// Создай класс User с полями:
	// String name
	// Optional<String> email
	//
	// Создай метод, который:
	// - выводит email в верхнем регистре
	// - если email отсутствует, выводит "Email not provided"

	public static void demonstrateUserClass() {
		User user = new User("Albert", Optional.of("albert50@gmail.com"));

		user.printEmail();
	}

	// Task 4
	// Создай List<Optional<String>>.
	// Используя stream:
	// - убери пустые Optional
	// - извлеки значения
	// - выведи их в консоль

	public static void removeEmptyOptional() {
		List<Optional<String>> optionals = List.of(
				Optional.of("Hello"),
				Optional.empty(),
				Optional.of("World"),
				Optional.empty()
		);

		optionals
				.stream()
				.filter(Optional::isPresent)
				.map(Optional::get)
				.forEach(System.out::println);
	}

	//Task 5
	// Используя Optional.map и Optional.filter:
	// преобразуй строку в её длину
	// и верни Optional<Integer>, только если длина > 5

	public static Optional<Integer> getLengthIfGreaterThanFive(String s) {

		return Optional.ofNullable(s)
				.filter(str -> str.length() > 5)
				.map(String::length);
	}

	// ================================
	// PART 2: LAMBDA & STREAM API
	// ================================

	//Task 6
	// Создай List<Integer>.
	// Используя Stream API:
	// - оставь только чётные числа
	// - возведи их в квадрат
	// - сохрани результат в новый список
	public static List<Integer> getNewIntegers(List<Integer> integers) {

		return integers.stream()
				.filter(s -> s % 2 == 0)
				.map(i -> i * i)
				.collect(Collectors.toList());
	}

	//Task 7
	// Создай List<String>.
	// Используя stream:
	// - отфильтруй строки длиной больше 3
	// - переведи их в верхний регистр
	// - выведи результат

	public static List<String> getStringsToUpperCase(List<String> strings) {

		return strings.stream()
				.filter(s -> s.length() > 3)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

	}

	//Task 8
	// Создай класс Person с полями:
	// String name
	// int age
	//
	// Создай список Person.
	// Используя stream:
	// - отфильтруй людей старше 18
	// - выведи их имена

	public static void getAdults(List<Person> persons) {
		persons.stream()
				.filter(p -> p.getAge() > 18)
				.map(Person::getName)
				.forEach(System.out::println);
	}

	// Task 9
	// Используя reduce:
	// - найди сумму чисел в списке
	// - найди произведение чисел в списке

	public static void getSumOfIntegers(List<Integer> integers) {
		int sum = integers.stream().mapToInt(Integer::intValue).sum();

		System.out.println(sum);
	}

	public static void getProductOfIntegers(List<Integer> integers) {
		Optional<Integer> result = integers.stream()
				.reduce((a, b) -> a * b);

		System.out.println(result);
	}

	// Task 10
	// Создай List<Integer>.
	// Используя stream:
	// - отсортируй по убыванию
	// - выведи результат

	public static void sortList () {
		List<Integer> integers = List.of(7, 2, 4, 8, 11);
		integers.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	}

	//Task 11
	// Создай Map<String, Integer>.
	// Используя stream:
	// - отфильтруй элементы, где значение > 50
	// - выведи ключи этих элементов

	public static void filterMap(Map<String, Integer> members) {
		members.entrySet().stream()
				.filter(m -> m.getValue() > 50)
				.map(Map.Entry::getKey)
				.forEach(System.out::println);
	}

	//Task 12
	// Создай List<String>.
	// Используя:
	// anyMatch
	// allMatch
	// noneMatch
	// проверь:
	// - есть ли пустые строки
	// - все ли строки длиннее 2 символов
	// - нет ли строк с цифрами

	public static void checkListOfStrings(List<String> strings) {
		if (strings.stream().anyMatch(String::isEmpty)) {
			System.out.println("В списке есть пустые строки.");
		} else {
			System.out.println("В списке нет пустых строк");
		}

		if (strings.stream().allMatch(s -> s.length() > 2)) {
			System.out.println("Все строки в списке больше 2 символов.");
		} else {
			System.out.println("В списке есть строки, длина которых не больше 2 символов .");
		}

		Pattern pattern = Pattern.compile("\\d");

		if (strings.stream().noneMatch(s -> pattern.matcher(s).find())) {
			System.out.println("В списке нет строк, содержащих цифры.");
		} else {
			System.out.println("В списке есть строки, содержащие цифры.");
		}
	}

	// Task 15:
	// Запрети создание более одного экземпляра Singleton:
	// - приватный конструктор
	// - запрети клонирование
	// - (дополнительно) защита от reflection

	private static void testLoggerProtection() {
		System.out.println("Testing Logger");

		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();

		System.out.println("Same instance: " + (logger1 == logger2));
		logger1.log("Logger is working");

		try {
			Constructor<Logger> constructor = Logger.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Logger logger3 = constructor.newInstance();
		} catch (Exception e) {
			System.out.println("Reflection blocked: " + e.getCause());
		}

		try {
			Logger clone = (Logger) logger1.clone();
		} catch (Exception e) {
			System.out.println("Clone blocked: " + e.getMessage());
		}
	}

	private static void testSettingsProtection() {
		System.out.println("Testing SettingsSingleton");

		SettingsSingleton s1 = SettingsSingleton.getInstance();
		SettingsSingleton s2 = SettingsSingleton.getInstance();

		System.out.println("Same instance: " + (s1 == s2));

		s1.setLanguage("EN");
		System.out.println("Language from s2: " + s2.getLanguage());

		try {
			Constructor<SettingsSingleton> constructor =
					SettingsSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			SettingsSingleton s3 = constructor.newInstance();
		} catch (Exception e) {
			System.out.println("Reflection blocked: " + e.getCause());
		}

		try {
			SettingsSingleton clone =
					(SettingsSingleton) s1.clone();
		} catch (Exception e) {
			System.out.println("Clone blocked: " + e.getMessage());
		}
	}

	// Tasks 16-20:
	// Создай класс Connection (имитация соединения с БД).
	// Создай класс ConnectionPool:
	// - хранит несколько объектов Connection
	// - метод getConnection()
	// - метод releaseConnection(Connection c)
	// Добавь ограничение:
	// если все соединения заняты —
	// вывести сообщение "No available connections"
	// Добавь счётчики:
	// - сколько объектов создано
	// - сколько свободно
	// Сделай ObjectPool потокобезопасным.
	// Смоделируй работу пула:
	// - получить 3 объекта
	// - освободить 2 объекта
	// - снова получить 1 объект
	// - вывести состояние пула

	private static void simulatePoolWork() {

		ConnectionPool pool = new ConnectionPool(3);

		System.out.println("Getting 3 connections...");
		Optional<Connection> c1 = pool.getConnection();
		Optional<Connection> c2 = pool.getConnection();
		Optional<Connection> c3 = pool.getConnection();

		System.out.println("\nTrying to get 4th connection...");
		Optional<Connection> c4 = pool.getConnection();

		System.out.println("\nReleasing 2 connections...");
		c1.ifPresent(pool::releaseConnection);
		c2.ifPresent(pool::releaseConnection);

		System.out.println("\nGetting 1 connection again...");
		Optional<Connection> c5 = pool.getConnection();

		pool.printStatus();
	}

	// ================================
	// PART 5: SITUATIONAL TASKS
	// ================================

	// Task 21:
	// Напиши метод, возвращающий null.
	// Перепиши его так, чтобы он возвращал Optional.

	public static Optional<Integer> getOptional() {
		return Optional.empty();
	}

	// Task 22:
	// Напиши цикл for по коллекции.
	// Перепиши его с использованием Stream API.

	public static void useForEachWithStreamAPI() {
		List<Integer> integers = List.of(1, 4, 7, 3, 9);

		integers.stream()
				.forEach(System.out::println);
	}

	// Task 23:
	// Создай пример, где Stream API делает код
	// более читаемым по сравнению с обычным циклом.

	public static void demonstrateStreamReadability() {

		List<String> names = List.of(
				"Ivan",
				"Alexander",
				"John",
				"Maria",
				"Christopher"
		);

		List<String> resultWithLoop = new ArrayList<>();

		for (String name : names) {
			if (name.length() > 4) {
				resultWithLoop.add(name.toUpperCase());
			}
		}

		Collections.sort(resultWithLoop);

		System.out.println("Result using loop: " + resultWithLoop);

		List<String> resultWithStream = names.stream()
				.filter(name -> name.length() > 4)
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());

		System.out.println("Result using Stream: " + resultWithStream);
	}
}
