package org.practiceAnswers.AlisaPauliuchenkavaAnswers.tasks;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.generics.Box;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.generics.Calculator;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Person;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Student;
import org.practiceAnswers.StanislawHolovnevAnswers.helpers.CollectionHelpers;

import java.io.*;
import java.util.*;

public class FourthSessionAlisaPauliuchenkava {

    static String path = "src/main/java/org/practiceAnswers/AlisaPauliuchenkavaAnswers/Files/test.txt";

    public static void main(String[] args) throws IOException {
        List<Integer> intList = List.of(1, 2, 3);

        divide(20, 0);
        checkAge(18);
        //readFile("src/main/java/org/practiceAnswers/AlisaPauliuchenkavaAnswers/Files/tt.txt");
        readFirstLine("src/main/java/org/practiceAnswers/AlisaPauliuchenkavaAnswers/Files/test.txt");
        testList();
        checkSet();
        checkMap();
        findBestStudent();
        serializePerson();
        deserializePerson();
        useGeneric("hello", 11);
        printArray(new Integer[]{1, 22, 876, 4});
        checkCalculator(new Calculator<>(42));
        printNumbers(intList);
        //calculateTotalSum(5, 4,3);
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

    // TODO: вызвать метод divide() с b = 0

    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("нельзя делить на 0");
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

    // TODO: вызвать метод checkAge()

    public static void checkAge(int age) {
        System.out.println();
        if (age < 18) {
            throw new IllegalArgumentException("возраст должен быть 18 или больше");
        } else {
            System.out.println("возраст >= 18 ");
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

    // TODO: вызвать метод readFile() с несуществующим файлом

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

    public static void readFirstLine(String path) {
        System.out.println();
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            String line = br.readLine();
            if (line != null) {
                System.out.println("строка: " + line);
            } else {
                System.out.println("файл пустой");
            }
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
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

    // TODO
    public static void testList() {
        System.out.println();
        List<String> langs = new ArrayList<>();
        langs.add("Java");
        langs.add("Python");
        langs.add("C");
        langs.add("JavaScript");
        langs.add("Kotlin");
        langs.remove("C");
        System.out.println("размер списка после удаления: " + langs.size());
        boolean containsJava = langs.contains("Java");
        System.out.println("список содержит Java: " + containsJava);
    }




    // ================================
    // ЗАДАНИЕ 13.2 — Set
    // ================================
    /*
     * Создай Set<Integer>
     * Добавь несколько одинаковых чисел
     * Убедись, что дубликаты не добавились
     */

    // TODO

    public static void checkSet() {
        System.out.println();
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        System.out.println("Set: " + nums);
        if (nums.size() == 3) {
            System.out.println("дубликатов нет");
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

    // TODO

    public static void checkMap() {
        System.out.println();
        Map<String, Integer> people = new HashMap<>();
        people.put("Леша", 25);
        people.put("Катя", 30);
        people.put("Настя", 18);
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println(name + ", " + age);
        }
    }


    // ================================
    // ЗАДАНИЕ 13.4 — Коллекция объектов
    // ================================
    /*
     * Создай класс Student(name, grade)
     * Создай List<Student>
     * Найди студента с максимальной оценкой
     */

    // TODO

    public static void findBestStudent() {
        System.out.println();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Алиса", 10));
        students.add(new Student("Стас", 2));
        students.add(new Student("Рома", 7));
        students.add(new Student("Катя", 9));
        students.add(new Student("Влад", 8));
        if (students.isEmpty()) return;
        Student bestStudent = students.get(0);
        for (Student e : students) {
            if (e.getGrade() > bestStudent.getGrade()) {
                bestStudent = e;
            }
        }
        System.out.println("лучший студент: " + bestStudent);
    }


    // ================================
    // ЗАДАНИЕ 14.1 — Сериализация
    // ================================
    /*
     * Создай класс Person, реализующий Serializable
     * Поля: name, age, transient password
     * Сериализуй объект в файл "person.dat"
     */

    // TODO

    public static void serializePerson() {
        System.out.println();
        Person person = new Person("Дима", 22, "Secret123");
        try (FileOutputStream fileOut = new FileOutputStream("person.dat");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("объект сериализован в person.dat");
        } catch (IOException e) {
            System.out.println("ошибка сериализации: " + e.getMessage());
        }
    }


    // ================================
    // ЗАДАНИЕ 14.2 — Десериализация
    // ================================
    /*
     * Считай объект Person из файла "person.dat"
     * Выведи его поля
     * Объясни, почему password = null
     */

    // TODO

    public static void deserializePerson() {
        System.out.println();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person restoredPerson = (Person) in.readObject();
            System.out.println("объект восстановлен");
            System.out.println(restoredPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
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

    // TODO

    public static void useGeneric(String valOne, Integer valTwo){
        System.out.println();
        Box<String> stringBox = new Box<>(valOne);
        Box<Integer> integerBox = new Box<>(valTwo);
        System.out.println(stringBox.get());
        System.out.println(integerBox.get());
    }


    // ================================
    // ЗАДАНИЕ 15.2 — Обобщённый метод
    // ================================
    /*
     * Создай обобщённый метод printArray(T[] array),
     * который выводит все элементы массива
     */

    // TODO

    public static <T> void printArray(T[] array) {
        System.out.println();
        System.out.print("массив: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    // ================================
    // ЗАДАНИЕ 15.3 — Ограничения Generics
    // ================================
    /*
     * Создай класс Calculator<T extends Number>
     * Реализуй метод doubleValue(), который возвращает double
     */

    // TODO

    public static void checkCalculator(Calculator<? extends Number> calc) {
        System.out.println();
        double val = calc.getDoubleValue();
        System.out.println(val);
    }


    // ================================
    // ЗАДАНИЕ 15.4 — Wildcards
    // ================================
    /*
     * Создай метод printNumbers(List<? extends Number>)
     * Метод должен вывести все числа
     */

    // TODO

    public static void printNumbers(List<? extends Number> list) {
        System.out.println();
        for (Number n : list) {
            System.out.println(n);
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

    // TODO

    //public static void calculateTotalSum(int one, int two, int three) {}
}
