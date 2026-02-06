package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FourthSessionKirylPalianok {

	public static void main(String[] args) throws IOException {

		// ================================
		// ЗАДАНИЕ 12.1 — try / catch / finally
		// ================================
		/*
		 * Создай метод divide(int a, int b), который:
		 * - делит a на b
		 * - обрабатывает ArithmeticException
		 * - в finally выводит сообщение "Операция завершена"
		 */

		ExсeptionTask.divide(4, 0);

		// ================================
		// ЗАДАНИЕ 12.2 — throw
		// ================================
		/*
		 * Создай метод checkAge(int age)
		 * Если age < 18 — выбросить IllegalArgumentException
		 * Иначе ничего не делать
		 */

		ExсeptionTask.checkAge(17);

		// ================================
		// ЗАДАНИЕ 12.3 — throws
		// ================================
		/*
		 * Создай метод readFile(String path), который:
		 * - читает файл
		 * - объявляет throws IOException
		 */

		ExсeptionTask.readFile("file.txt");


		// ================================
		// ЗАДАНИЕ 12.4 — try-with-resources
		// ================================
		/*
		 * Используя try-with-resources:
		 * - открыть файл
		 * - считать одну строку
		 * - закрыть ресурс автоматически
		 */

		String line = ExсeptionTask.readFirstStringFromFile("src/main/resources/files/file.txt");
		System.out.println(line);

		// ================================
		// ЗАДАНИЕ 13.1 — List
		// ================================
		/*
		 * Создай List<String>
		 * Добавь 5 элементов
		 * Удали один элемент
		 * Выведи размер списка
		 * Проверь, содержит ли список строку "Java"
		 */

		List<String> programmingLanguages = new ArrayList<>();

		programmingLanguages.add("Python");
		programmingLanguages.add("Java");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("C#");
		programmingLanguages.add("Ruby");

		programmingLanguages.remove(0);

		System.out.println(programmingLanguages.size());

		if (programmingLanguages.contains("Java")) {
			System.out.println("Содержит Java");
		} else {
			System.out.println("Не содержит Java");
		}

		// ================================
		// ЗАДАНИЕ 13.2 — Set
		// ================================
		/*
		 * Создай Set<Integer>
		 * Добавь несколько одинаковых чисел
		 * Убедись, что дубликаты не добавились
		 */

		Set<Integer> numbers = new HashSet<>();
		int count = 0;

		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		for (Integer number : numbers) {
			if (number == 1) {
				count++;
			}
		}

		if (count > 1) {
			System.out.println("Ошибка. В Set не может быть дубликатов");
		} else {
			System.out.println("Дубликаты не добавлены");
		}

		// ================================
		// ЗАДАНИЕ 13.3 — Map
		// ================================
		/*
		 * Создай Map<String, Integer>
		 * (имя → возраст)
		 * Добавь 3 элемента
		 * Перебери map через entrySet()
		 */

		Map<String, Integer> employee = new HashMap<>();

		employee.put("John", 34);
		employee.put("Nick", 19);
		employee.put("Albert", 28);

		System.out.println(employee.entrySet());

		// ================================
		// ЗАДАНИЕ 13.4 — Коллекция объектов
		// ================================
		/*
		 * Создай класс Student(name, grade)
		 * Создай List<Student>
		 * Найди студента с максимальной оценкой
		 */

		List<Student> students = new ArrayList<>();

		students.add(new Student("Bob", 9));
		students.add(new Student("Harry", 2));
		students.add(new Student("Chuck", 7));

		Student bestStudent = students.get(0);

		for (Student s : students) {
			if (s.getGrade() > bestStudent.getGrade()) {
				bestStudent = s;
			}
		}

		System.out.println("Лучший студент: " + bestStudent);

		// ================================
		// ЗАДАНИЕ 14.1 — Сериализация
		// ================================
		/*
		 * Создай класс Person, реализующий Serializable
		 * Поля: name, age, transient password
		 * Сериализуй объект в файл "person.dat"
		 */
		Person person1 = new Person("Mike", 23, "password");

		ObjectWriter.writeObject(person1);

		// ================================
		// ЗАДАНИЕ 14.2 — Десериализация
		// ================================
		/*
		 * Считай объект Person из файла "person.dat"
		 * Выведи его поля
		 * Объясни, почему password = null
		 */

		ObjectReader.readObject("src/main/resources/person.dat");

		// ================================
		// ЗАДАНИЕ 15.1 — Обобщённый класс
		// ================================
		/*
		 * Создай обобщённый класс Box<T>
		 * Поле value
		 * Методы set() и get()
		 * Создай Box<String> и Box<Integer>
		 */

		Box<String> stringBox = new Box<>("Kiryl");
		Box<Integer> integerBox = new Box<>(1);

		// ================================
		// ЗАДАНИЕ 15.2 — Обобщённый метод
		// ================================
		/*
		 * Создай обобщённый метод printArray(T[] array),
		 * который выводит все элементы массива
		 */

		Box<String> stringBoxArray = new Box<>(new String[]{"Hello", "World"});
		Box<Integer> integerBoxArray = new Box<>(new Integer[]{1, 2, 3});

		Box.printArray(stringBoxArray.getArray());
		Box.printArray(integerBoxArray.getArray());

		// ================================
		// ЗАДАНИЕ 15.3 — Ограничения Generics
		// ================================
		/*
		 * Создай класс Calculator<T extends Number>
		 * Реализуй метод doubleValue(), который возвращает double
		 */

		Calculator<Integer> integerCalc = new Calculator<>(10);
		System.out.println(integerCalc.doubleValue());

		Calculator<Double> doubleCalc = new Calculator<>(20.34);
		System.out.println(doubleCalc.doubleValue());


		// ================================
		// ЗАДАНИЕ 15.4 — Wildcards
		// ================================
		/*
		 * Создай метод printNumbers(List<? extends Number>)
		 * Метод должен вывести все числа
		 */

		List<Integer> integers = List.of(1,3,4,6);
		List<Double> doubles = List.of(1.23, 5.2, 25.78, 12.0);

		Calculator.printNumbers(integers);
		Calculator.printNumbers(doubles);

		// ================================
		// ЗАДАНИЕ 15.5 — Коллекции + Generics
		// ================================
		/*
		 * Создай Map<String, List<Integer>>
		 * Добавь несколько значений
		 * Найди сумму всех чисел во всех списках
		 */

		Map<String, List<Integer>> map = new HashMap<>();

		map.put("group1", List.of(1,3,4,5));
		map.put("group2", List.of(2, 4,6));
		map.put("group3", List.of(22, 56, 1, 24, 39));

		int sum = 0;

		for (List<Integer> list : map.values()) {
			for (Integer integer : list) {
				sum += integer;
			}
		}

		System.out.println("Сумма всех чисел: " + sum);

		List<Integer> source = List.of(1, 2, 3, 4, 5);

		List<Integer> dest1 = new ArrayList<>(List.of(0, 0, 0, 0, 0));
		List<Number> dest2 = new ArrayList<>(List.of(0, 0, 0, 0, 0));
		List<Object> dest3 = new ArrayList<>(List.of(0, 0, 0, 0, 0));


		copy(dest1, source);
		System.out.println(dest1);

		copy(dest2, source);
		System.out.println(dest2);

		copy(dest2, source);
		System.out.println(dest2);
	}


	// ================================
	// ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
	// ================================
	/*
	 * Создай метод:
	 *
	 * public static <T> void copy(List<? super T> dest, List<? extends T> src)
	 *
	 * который копирует элементы из src (source) в dest (destination)
	 *
	 * (аналог Collections.copy)
	 */

	public static <T> void copy(List<? super T> dest, List<? extends T> src) {

		int sourceSize = src.size();
		if (sourceSize > dest.size()) {
			throw new IndexOutOfBoundsException("Невозможно скопировать: размер источника больше размера назначения.");
		}

		for (int i = 0; i < src.size(); i++) {
			dest.set(i, src.get(i));
		}
	}

}
