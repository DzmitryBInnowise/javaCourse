package org.practiceAnswers.StasKravchenkoAnswers;

import org.practiceAnswers.StasKravchenkoAnswers.Classes.Box;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.CalculatorGeneric;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Person;
import org.practiceAnswers.StasKravchenkoAnswers.Classes.Student;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class ForthSessionKravchenkoStas {
    public static void main(String[] args) {
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

        divide(10, 0);

        // ================================
        // ЗАДАНИЕ 12.2 — throw
        // ================================
        /*
         * Создай метод checkAge(int age)
         * Если age < 18 — выбросить IllegalArgumentException
         * Иначе ничего не делать
         */

        // TODO: вызвать метод checkAge()

        checkAge(18);

        // ================================
        // ЗАДАНИЕ 12.3 — throws
        // ================================
        /*
         * Создай метод readFile(String path), который:
         * - читает файл
         * - объявляет throws IOException
         */

        // TODO: вызвать метод readFile() с несуществующим файлом


        readFile("text.txt");
        // ================================
        // ЗАДАНИЕ 12.4 — try-with-resources
        // ================================
        /*
         * Используя try-with-resources:
         * - открыть файл
         * - считать одну строку
         * - закрыть ресурс автоматически
         */

        openAndReadFile("src/main/java/org/practiceAnswers/StasKravchenkoAnswers/Files/Test.txt");

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

        List<String> list1 = new ArrayList<>();
        list1.add("Alex");
        list1.add("Java");
        list1.add("Car");
        list1.add("Cat");
        list1.add("Phone");
        System.out.println("List size before remove = " + list1.toArray().length);
        list1.remove(0);
        System.out.println("List size after remove = " + list1.toArray().length);
        System.out.println("List contains word Java? Answer = " + list1.contains("Java"));


        // ================================
        // ЗАДАНИЕ 13.2 — Set
        // ================================
        /*
         * Создай Set<Integer>
         * Добавь несколько одинаковых чисел
         * Убедись, что дубликаты не добавились
         */

        // TODO

        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers.size());

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

        Map<String, Integer> people = new HashMap<>();

        people.put("Sasha", 25);
        people.put("Oleg", 20);
        people.put("Tanya", 33);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key = " + key + " Value = " + value);
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

        List<Student> students = new ArrayList<>();

        students.add(new Student("Stas", 28));
        students.add(new Student("Artem", 33));
        students.add(new Student("Tanya", 20));
        students.add(new Student("Anton", 40));

        Student bestStudent = students.get(0);

        for (Student s : students) {
            if (s.getGrade() > bestStudent.getGrade()) {
                bestStudent = s;
            }
        }

        System.out.println(bestStudent.getName() + " has max grade: " + bestStudent.getGrade());
        // ================================
        // ЗАДАНИЕ 14.1 — Сериализация
        // ================================
        /*
         * Создай класс Person, реализующий Serializable
         * Поля: name, age, transient password
         * Сериализуй объект в файл "person.dat"
         */

        // TODO

        Person person = new Person("Artem", 25, "12345");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/org/practiceAnswers/StasKravchenkoAnswers/Files/person.dat"))) {

            oos.writeObject(person);
            oos.close();
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
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

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("src/main/java/org/practiceAnswers/StasKravchenkoAnswers/Files/person.dat"))) {

            Person p = (Person) ois.readObject();
            p.printInfo();
            System.out.println("Поле password пустой потому что используем transient и поле не записывается");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

        Box<String> box1 = new Box<>();
        box1.set("Hello");
        System.out.println(box1.get());

        Box<Integer> box2 = new Box<>();
        box2.set(44);
        System.out.println(box2.get());

        // ================================
        // ЗАДАНИЕ 15.2 — Обобщённый метод
        // ================================
        /*
         * Создай обобщённый метод printArray(T[] array),
         * который выводит все элементы массива
         */

        // TODO

        String[] words = {"Java", "Box", "Hello World"};

        printArray(words);

        // ================================
        // ЗАДАНИЕ 15.3 — Ограничения Generics
        // ================================
        /*
         * Создай класс Calculator<T extends Number>
         * Реализуй метод doubleValue(), который возвращает double
         */

        // TODO

        CalculatorGeneric<Integer> num1 = new CalculatorGeneric<>(31);

        System.out.println(num1.doubleValue());
        // ================================
        // ЗАДАНИЕ 15.4 — Wildcards
        // ================================
        /*
         * Создай метод printNumbers(List<? extends Number>)
         * Метод должен вывести все числа
         */

        // TODO

        List<Integer> nums = List.of(1, 2, 3);
        printNumbers(nums);

        // ================================
        // ЗАДАНИЕ 15.5 — Коллекции + Generics
        // ================================
        /*
         * Создай Map<String, List<Integer>>
         * Добавь несколько значений
         * Найди сумму всех чисел во всех списках
         */

        // TODO
        Map<String, List<Integer>> map = new HashMap<>();

        map.put("Anton", Arrays.asList(1, 2, 3));
        map.put("Oleg", Arrays.asList(4, 5));
        map.put("Sasha", Arrays.asList(6, 7, 8));

        int sum = 0;
        for (List<Integer> list : map.values()) {
            for (Integer n : list) {
                sum += n;
            }
        }

        System.out.println("Сумма всех чисел: " + sum);

        List<Number> dest = new java.util.ArrayList<>();
        List<Integer> src = List.of(1, 2, 3);

        copy(dest, src);

        System.out.println(dest);
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

    // TODO
    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (T element : src) {
            dest.add(element);
        }
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

// TODO


    public static void divide(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception message: " + e.getMessage());
        }

    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or higher");
        }
    }

    public static void readFile(String path) {
        try (FileReader fileReader = new FileReader(path)) {
            int c;
            while ((c = fileReader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("Filer error: " + ex.getMessage());
        }
    }

    public static void openAndReadFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }


}



