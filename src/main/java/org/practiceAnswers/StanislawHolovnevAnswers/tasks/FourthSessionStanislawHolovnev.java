package org.practiceAnswers.StanislawHolovnevAnswers.tasks;

import org.practiceAnswers.StanislawHolovnevAnswers.helpers.FileHelper;
import org.practiceAnswers.StanislawHolovnevAnswers.models.generics.Box;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Person;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Student;
import org.practiceAnswers.StanislawHolovnevAnswers.models.values.Calculator;
import org.practiceAnswers.StanislawHolovnevAnswers.helpers.CollectionHelpers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static org.practiceAnswers.StanislawHolovnevAnswers.helpers.FileHelper.deserialize;
import static org.practiceAnswers.StanislawHolovnevAnswers.helpers.FileHelper.serialize;

public class FourthSessionStanislawHolovnev {

    static String folderPath = "src/main/java/org/practiceAnswers/StanislawHolovnevAnswers/dto/person.dat";
    static String serPath = "src/main/java/org/practiceAnswers/StanislawHolovnevAnswers/dto/numbers.ser";
    static String secondFolderPath = "src/main/java/org/practiceAnswers/StanislawHolovnevAnswers/dto/listOfNumbers.txt";


    /*
     * ПРАКТИЧЕСКИЕ ЗАДАНИЯ ПО JAVA
     * Темы:
     * 12. Исключения
     * 13. Коллекции
     * 14. Сериализация
     * 15. Дженерики
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        divide(10, 0);
        checkAge(18);
        readFile("src/main/java/org/practiceAnswers/StanislawHolovnevAnswers/dto/somefile.txt");
        System.out.println(firstLineReader("src/main/java/org/practiceAnswers/StanislawHolovnevAnswers/dto/" +
                "somefile.txt"));
        useList("Java", "Python", "C#", "JavaScript", "Ruby",
                "Java");
        useSet(1);
        useMap("Stas", "Vlad", "Nicole", 27, 23, 25);
        findStudentWithMaxGrade("Stas", "Vlad", "Nicole", 10, 5, 9);
        useSerialization("Stas", 27, "password");
        useDeserialization();
        useGeneric("Hola", 42);
        printArray(new Integer[]{67, 15, 32});
        useCalculator(10);
        usePrintNumbers(new ArrayList<Integer>(Arrays.asList(12, 22, 13, 53)));
        useMapWithSumOfNumbers(1, 2, 3, 4, 5, 6);
        copy(new ArrayList<Integer>(Arrays.asList(1, 2, 3)), new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        useFileReader();
    }

    // ================================
    // ЗАДАНИЕ 12.1 — try / catch / finally
    // ================================
    /*
     * Создай метод divide(int a, int b), который:
     * - делит a на b
     * - обрабатывает ArithmeticException
     * - в finally выводит сообщение "Операция завершена"
     */

    public static void divide(int a, int b) {
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Операция завершена");
        }
    }

    // ================================
    // ЗАДАНИЕ 12.2 — throw
    // ================================
    /*
     * Создай метод checkAge(int age)
     * Если age < 18 — выбросить IllegalArgumentException
     * Иначе ничего не делать
     */

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Возраст должен быть больше 18");
        } else {
            System.out.println("Возраст больше 18");
        }
    }

    // ================================
    // ЗАДАНИЕ 12.3 — throws
    // ================================
    /*
     * Создай метод readFile(String path), который:
     * - читает файл
     * - объявляет throws IOException
     */

    public static String readFile(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.readLine();
        }
    }

    // ================================
    // ЗАДАНИЕ 12.4 — try-with-resources
    // ================================
    /*
     * Используя try-with-resources:
     * - открыть файл
     * - считать одну строку
     * - закрыть ресурс автоматически
     */

    public static String firstLineReader(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.readLine();
        }
    }

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

    public static void useList(String e1, String e2, String e3, String e4, String e5, String toRemove) {
        List<String> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        if (list.remove(toRemove)) {
            System.out.println("Удалено: " + toRemove);
        } else {
            System.out.println("Не удалось удалить (не найден): " + toRemove);
        }

        if (list.contains("Java")) {
            System.out.println("Результат: Java есть в списке");
        } else {
            System.out.println("Результат: Java в списке нет");
        }
    }

    // ================================
    // ЗАДАНИЕ 13.2 — Set
    // ================================
    /*
     * Создай Set<Integer>
     * Добавь несколько одинаковых чисел
     * Убедись, что дубликаты не добавились
     */

    public static void useSet(int num) {
        Set<Integer> setOfNumbers = new HashSet<>(5);
        setOfNumbers.add(num);
        setOfNumbers.add(num);
        setOfNumbers.add(num);
        setOfNumbers.add(num);
        setOfNumbers.add(num);

        if (setOfNumbers.size() == 1) {
            System.out.println("Дубликаты не созданы. В сете только один элемент: " + setOfNumbers);
        } else {
            System.out.println("Что-то пошло не так, элементов больше одного: " + setOfNumbers.size());
        }
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

    public static void useMap(String nameOne, String nameTwo, String nameThree,
                              int ageOne, int ageTwo, int ageThree) {
        Map<String, Integer> mapOfNamesAndAges = new HashMap<>(3);
        mapOfNamesAndAges.put(nameOne, ageOne);
        mapOfNamesAndAges.put(nameTwo, ageTwo);
        mapOfNamesAndAges.put(nameThree, ageThree);
        mapOfNamesAndAges.entrySet().forEach(System.out::println);

    }

    // ================================
    // ЗАДАНИЕ 13.4 — Коллекция объектов
    // ================================
    /*
     * Создай класс Student(name, grade)
     * Создай List<Student>
     * Найди студента с максимальной оценкой
     */

    public static void findStudentWithMaxGrade(String nameOne, String nameTwo, String nameThree,
                                               int gradeOne, int gradeTwo, int gradeThree) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(nameOne, gradeOne));
        students.add(new Student(nameTwo, gradeTwo));
        students.add(new Student(nameThree, gradeThree));

        Student maxGradeStudent = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > maxGradeStudent.getGrade()) {
                maxGradeStudent = s;
            }
        }
        System.out.println("Студент с макс. баллом: " + maxGradeStudent);
    }

    // ================================
    // ЗАДАНИЕ 14.1 — Сериализация
    // ================================
    /*
     * Создай класс Person, реализующий Serializable
     * Поля: name, age, transient password
     * Сериализуй объект в файл "person.dat"
     */

    public static void useSerialization(String name, int age, String password) {
        Person person = new Person(name, age, password);
        serialize(person, folderPath);
    }

    // ================================
    // ЗАДАНИЕ 14.2 — Десериализация
    // ================================
    /*
     * Считай объект Person из файла "person.dat"
     * Выведи его поля
     * Объясни, почему password = null
     */

    public static void useDeserialization() {
        serialize(new Person("Stas", 27, "password"), folderPath);
        Person person = (Person) deserialize(folderPath);
        System.out.println(person);
        System.out.println("Ключевое слово transient игнорирует поле password, так как при записи объекта" +
                "в байты transient игнорирует поле password");
    }

    // ================================
    // ЗАДАНИЕ 15.1 — Обобщённый класс
    // ================================
    /*
     * Создай обобщённый класс Box<T>
     * Поле value
     * Методы set() и get()
     * Создай Box<String> и Box<Integer>
     */

    public static void useGeneric(String valueOne, Integer valueTwo) {
        Box<String> stringBox = new Box<>(valueOne);
        Box<Integer> integerBox = new Box<>(valueTwo);
        System.out.println(stringBox.getValue());
        System.out.println(integerBox.getValue());
    }

    // ================================
    // ЗАДАНИЕ 15.2 — Обобщённый метод
    // ================================
    /*
     * Создай обобщённый метод printArray(T[] array),
     * который выводит все элементы массива
     */

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // ================================
    // ЗАДАНИЕ 15.3 — Ограничения Generics
    // ================================
    /*
     * Создай класс Calculator<T extends Number>
     * Реализуй метод doubleValue(), который возвращает double
     */

    public static void useCalculator(int value) {
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println(calculator.doubleValue(value));
    }

    // ================================
    // ЗАДАНИЕ 15.4 — Wildcards
    // ================================
    /*
     * Создай метод printNumbers(List<? extends Number>)
     * Метод должен вывести все числа
     */

    public static void usePrintNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.printf("Numbers is: " + number + ", ");
        }
    }

    // ================================
    // ЗАДАНИЕ 15.5 — Коллекции + Generics
    // ================================
    /*
     * Создай Map<String, List<Integer>>
     * Добавь несколько значений
     * Найди сумму всех чисел во всех списках
     */

    public static void useMapWithSumOfNumbers(int numOne, int numTwo, int numThree, int numFour, int numFive, int numSix) {
        CollectionHelpers.useMapWithSumOfNumbers(new HashMap<String, List<Integer>>() {{
            put("Numbers", Arrays.asList(numOne, numTwo, numThree));
            put("More numbers", Arrays.asList(numFour, numFive, numSix));
        }});
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
        FileHelper.copy(dest, src);
    }

    // ================================
    // БОНУС ЗАДАНИЕ
    // ================================
    /*
     * Создай программу, которая:
     * - читает список чисел из файла
     * - сохраняет его в коллекцию
     * - сериализует коллекцию
     * - затем десериализует
     * - и находит максимальное число
     */

    public static void useFileReader() throws IOException {
        List<Integer> numbers = FileHelper.readFile(secondFolderPath);

        serialize(numbers, serPath);

        Object restoredData = deserialize(serPath);

        if (restoredData instanceof List) {
            List<Integer> restoredNumbers = (List<Integer>) restoredData;

            if (!restoredNumbers.isEmpty()) {
                int max = restoredNumbers.get(0);
                for (int n : restoredNumbers) {
                    if (n > max) max = n;
                }
                System.out.println("Максимальное число после десериализации: " + max);
            }
        } else {
            System.err.println("Ошибка: десериализованный объект не является списком!");
        }
    }
}

