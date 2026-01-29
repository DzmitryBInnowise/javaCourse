package org.practiceAnswers.AnnaVerkhovaAnswers.Tasks;

import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different.Box;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different.Calculator;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Person;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Student;

import java.io.*;
import java.util.*;


public class FourthSessionAnnaVerkhova {

    private static final String FILE_PATH = "src/main/java/org/practiceAnswers/AnnaVerkhovaAnswers/Tasks/File/Text";
    private static final String FILE_PATH_PERSON_DAT = "src/main/java/org/practiceAnswers/AnnaVerkhovaAnswers/Tasks/File/person.dat";

    public static void main(String[] args) throws IOException {
        divide(2, 0);
        checkAge(19);
        readFile(FILE_PATH);
        readString(FILE_PATH);
        createArrayList();
        createSet();
        createMap();
        findStudentWithMaxCount();
        serializablePerson("Anna", 18, "145230asw");
        deserializablePerson();
        boxStringAndInt();
        printArray(new Integer[]{1, 2, 3});
        doubleValueCalc();
        printNumbers();
        mapAndList();
        // ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
        copy(1, 2, 3);

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

    public static void divide(int c, int b) {
        try {
            int result = c / b;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero!");
        } finally {
            System.out.println("The operation is complete.");
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
        try {
            if (age < 18)
                throw new IllegalArgumentException();
            System.out.println("Age is right");
        } catch (IllegalArgumentException e) {
            System.out.println("Age under 18 years");
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

    public static void readFile(String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        int data;
        System.out.println("All text in file: ");
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        fis.close();
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

    public static void readString(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            System.out.println("\nFirst string is - " + line);
        } catch (IOException e) {
            System.out.println("Bug");
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

    public static void createArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Animal");
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.size();
        System.out.println(list);
        System.out.println("There are " + list.size() + " elements in list");
        list.remove("Animal");
        list.size();
        System.out.println("There are " + list.size() + " elements in list");
        if (list.contains("Java")) {
            System.out.println("There is Java in list");
        } else {
            System.out.println("There is not Java in list");
        }
        System.out.println(list);
    }
// ================================
// ЗАДАНИЕ 13.2 — Set
// ================================
    /*
     * Создай Set<Integer>
     * Добавь несколько одинаковых чисел
     * Убедись, что дубликаты не добавились
     */

    public static void createSet() {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(7);
        set.add(5);
        set.size();
        System.out.println("Set : " + set + " in size " + set.size());
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

    public static void createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivan", 18);
        map.put("Anna", 20);
        map.put("Inna", 21);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя " + entry.getKey() + " = возраст " + entry.getValue());
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

    public static void findStudentWithMaxCount() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pavel", 83));
        students.add(new Student("Roman", 97));
        students.add(new Student("Ilya", 65));
        Student topStudent = students.get(0);
        for (Student s : students) {
            if (s.getGrade() > topStudent.getGrade()) {
                topStudent = s;
            }
        }
        System.out.println("Best student is " + topStudent.getName() + " with grade " + topStudent.getGrade());
    }

// ================================
// ЗАДАНИЕ 14.1 — Сериализация
// ================================
    /*
     * Создай класс Person, реализующий Serializable
     * Поля: name, age, transient password
     * Сериализуй объект в файл "person.dat"
     */

    public static void serializablePerson(String name, int age, String password) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH_PERSON_DAT));
            Person p = new Person(name, age, password);
            oos.writeObject(p);
            System.out.println("Object is serializable");
        } catch (IOException e) {
            e.printStackTrace();
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

    public static void deserializablePerson() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH_PERSON_DAT));
            Person p = (Person) ois.readObject();
            ois.close();
            System.out.println("Object is deserializable name - " + p.getName() + " age " + p.getAge() + " password " + p.getPassword());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

    public static void boxStringAndInt() {
        Box<String> boxStr = new Box<>();
        boxStr.setValue("Java");
        System.out.println("There is " + boxStr.getValue() + " in box.");
        Box<Integer> boxInt = new Box<>();
        boxInt.setValue(1500);
        System.out.println("There is " + boxInt.getValue() + " in box.");
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

    public static void doubleValueCalc() {
        Calculator<Integer> calcInt = new Calculator<>(10);
        calcInt.doubleValue();
        System.out.println("Result : " + calcInt.doubleValue());
        Calculator<Double> calcD = new Calculator<>(25.6);
        calcD.doubleValue();
        System.out.println("Result : " + calcD.doubleValue());
    }

// ================================
// ЗАДАНИЕ 15.4 — Wildcards
// ================================
    /*
     * Создай метод printNumbers(List<? extends Number>)
     * Метод должен вывести все числа
     */

    public static void printNumbers() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(55);
        intList.add(3);
        System.out.println(intList);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.2);
        doubleList.add(81.2);
        doubleList.add(1.92);
        System.out.println(doubleList);
    }

// ================================
// ЗАДАНИЕ 15.5 — Коллекции + Generics
// ================================
    /*
     * Создай Map<String, List<Integer>>
     * Добавь несколько значений
     * Найди сумму всех чисел во всех списках
     */

    public static void mapAndList() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("Cat", new ArrayList<>(Arrays.asList(1, 2, 3)));
        map.put("Dog", new ArrayList<>(Arrays.asList(5, 10, 3)));
        System.out.println(map);
        int totalSum = 0;
        for (List<Integer> numbers : map.values()) {
            for (int num : numbers) {
                totalSum += num;
            }
        }

        System.out.println("Summ =  " + totalSum);
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

    public static <T> void copyList(List<? super T> dest, List<? extends T> src) {
        for (T element : src) {
            dest.add(element);
        }
    }

    public static void copy(int i, int i1, int i2) {
        List<Integer> src = new ArrayList<>();
        src.add(i);
        src.add(i1);
        src.add(i2);
        List<Number> dest = new ArrayList<>();
        copyList(dest, src);
        System.out.println(dest);
    }
}