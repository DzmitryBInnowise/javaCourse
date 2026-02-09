package org.practiceAnswers.StasKravchenkoAnswers;

import org.practiceAnswers.StasKravchenkoAnswers.Classes.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeventhSessionKravchenkoStas {
    public static void main(String[] args) {
        // ================================
        // PART 1: OPTIONAL
        // ================================

        // TODO 1:
        // Создай метод getOptionalString(String s),
        // который возвращает Optional<String>.
        // Если s == null или пустая строка — вернуть Optional.empty().
        System.out.println(getOptionalString(null));
        System.out.println(getOptionalString(""));
        System.out.println(getOptionalString("Hello"));

        // TODO 2:
        // Создай Optional<Integer>.
        // Используя ifPresent и orElse, выведи:
        // - значение, если оно есть
        // - сообщение "No value", если его нет.
        getOptionalInteger(44);
        getOptionalInteger(null);

        // TODO 3:
        // Создай класс User с полями:
        // String name
        // Optional<String> email
        //
        // Создай метод, который:
        // - выводит email в верхнем регистре
        // - если email отсутствует, выводит "Email not provided"

        User user1 = new User("Stas", "myEmail");
        user1.getOptionalEmail();
        User user2 = new User("Stas", null);
        user2.getOptionalEmail();

        // TODO 4:
        // Создай List<Optional<String>>.
        // Используя stream:
        // - убери пустые Optional
        // - извлеки значения
        // - выведи их в консоль

        List<Optional<String>> list = List.of(
                Optional.of("Hello"),
                Optional.empty(),
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Stream")
        );

        list.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
        list.stream().close();

        // TODO 5:
        // Используя Optional.map и Optional.filter:
        // преобразуй строку в её длину
        // и верни Optional<Integer>, только если длина > 5

        System.out.println(getLength("Hello"));
        System.out.println(getLength("Optional"));
        System.out.println(getLength(null));

        // ================================
        // PART 2: LAMBDA & STREAM API
        // ================================

        // TODO 6:
        // Создай List<Integer>.
        // Используя Stream API:
        // - оставь только чётные числа
        // - возведи их в квадрат
        // - сохрани результат в новый список

        List<Integer> listWithNumbers = new ArrayList<>();

        listWithNumbers.add(25);
        listWithNumbers.add(33);
        listWithNumbers.add(10);
        listWithNumbers.add(20);
        listWithNumbers.add(11);
        listWithNumbers.add(2);

        Stream<Integer> stream = listWithNumbers.stream();

        List<Integer> secondListWithNumbers = stream.filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(secondListWithNumbers);

        // TODO 7:
        // Создай List<String>.
        // Используя stream:
        // - отфильтруй строки длиной больше 3
        // - переведи их в верхний регистр
        // - выведи результат

        List<String> listWithStrings = new ArrayList<>();

        listWithStrings.add("hello");
        listWithStrings.add("bye");
        listWithStrings.add("fantastic");
        listWithStrings.add("do");

        Stream<String> streamWithStrings = listWithStrings.stream();

        listWithStrings.stream()
                .filter(str -> str.length() > 3)
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);

        // TODO 8:
        // Создай класс Person с полями:
        // String name
        // int age
        //
        // Создай список Person.
        // Используя stream:
        // - отфильтруй людей старше 18
        // - выведи их имена

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Stas", 28));
        personList.add(new Person("Oleg", 25));
        personList.add(new Person("Olya", 15));
        personList.add(new Person("Dima", 33));
        personList.add(new Person("Valera", 18));

        personList.stream()
                .filter(x -> x.getAge() > 18)
                .map(Person::getName)
                .forEach(System.out::println);

        // TODO 9:
        // Используя reduce:
        // - найди сумму чисел в списке
        // - найди произведение чисел в списке

        Stream<Integer> streamSumWithReduce1 = Stream.of(1, 2, 3, 4, 5);

        Optional<Integer> reduceSumResult = streamSumWithReduce1.reduce((x, y) -> x + y);
        System.out.println("Сумма чисел = " + reduceSumResult.orElse(0));

        Stream<Integer> streamSumWithReduce2 = Stream.of(1, 2, 3, 4, 5);
        Optional<Integer> reduceMultiplicationResult = streamSumWithReduce2.reduce((x, y) -> x * y);
        System.out.println("Произведение чисел = " + reduceMultiplicationResult.orElse(0));

        // TODO 10:
        // Создай List<Integer>.
        // Используя stream:
        // - отсортируй по убыванию
        // - выведи результат

        List<Integer> sortingList = new ArrayList<>();

        sortingList.add(4);
        sortingList.add(10);
        sortingList.add(3);
        sortingList.add(8);
        sortingList.add(7);

        Stream<Integer> sortingStream = sortingList.stream();
        sortingStream.sorted((x, y) -> y - x).forEach(System.out::println);

        // TODO 11:
        // Создай Map<String, Integer>.
        // Используя stream:
        // - отфильтруй элементы, где значение > 50
        // - выведи ключи этих элементов

        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("Hello", 22);
        stringIntegerMap.put("Bye", 51);
        stringIntegerMap.put("Check", 33);
        stringIntegerMap.put("World", 60);

        stringIntegerMap
                .entrySet()
                .stream()
                .filter(str -> str.getValue() > 50)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        // TODO 12:
        // Создай List<String>.
        // Используя:
        // anyMatch
        // allMatch
        // noneMatch
        // проверь:
        // - есть ли пустые строки
        // - все ли строки длиннее 2 символов
        // - нет ли строк с цифрами

        List<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("World");
        strings.add("");
        strings.add("B1");
        strings.add("Nice");

        boolean hasEmptyString = strings
                .stream()
                .anyMatch(String::isEmpty);
        System.out.println("Есть пустые строки? " + hasEmptyString);

        boolean stringLongerThan2 = strings
                .stream()
                .allMatch(str -> str.length() > 2);
        System.out.println("Все строки длиннее 2 символов? " + stringLongerThan2);

        boolean stringWithoutNumbers = strings
                .stream()
                .noneMatch(s -> s.chars().anyMatch(Character::isDigit));
        System.out.println("Нет строк с цифрами? " + stringWithoutNumbers);

        // ================================
        // PART 3: SINGLETON PATTERN
        // ================================

        // TODO 13:
        // Создай класс SettingsSingleton.
        // Реализуй паттерн Singleton.
        // Добавь поле String language.
        // Добавь методы:
        // getLanguage()
        // setLanguage(String language)

        SettingsSingleton settingsSingleton1 = SettingsSingleton.getInstance();
        SettingsSingleton settingsSingleton2 = SettingsSingleton.getInstance();

        System.out.println(settingsSingleton1.equals(settingsSingleton2));

        // TODO 14:
        // Создай потокобезопасный Singleton для класса Logger.
        // Добавь метод log(String message).

        Logger logger = Logger.getInstance();
        logger.log("Приложение запущено");

        Logger logger2 = Logger.getInstance();
        logger2.log("Второй лог");
        System.out.println(logger.equals(logger2));
        // TODO 15:
        // Запрети создание более одного экземпляра Singleton:
        // - приватный конструктор
        // - запрети клонирование
        // - (дополнительно) защита от reflection
        
        SafeSingleton singleton = SafeSingleton.getInstance();
        singleton.showMessage();

        SafeSingleton another = SafeSingleton.getInstance();
        System.out.println(singleton == another);

        // ================================
        // PART 4: OBJECT POOL PATTERN
        // ================================

        // TODO 16:
        // Создай класс Connection (имитация соединения с БД).
        //
        // Создай класс ConnectionPool:
        // - хранит несколько объектов Connection
        // - метод getConnection()
        // - метод releaseConnection(Connection c)

        ConnectionPool pool = new ConnectionPool(2);

        Connection c1 = pool.getConnection();
        c1.use();

        Connection c2 = pool.getConnection();
        c2.use();

        pool.releaseConnection(c1);

        Connection c3 = pool.getConnection();
        c3.use();

        // TODO 17:
        // Добавь ограничение:
        // если все соединения заняты —
        // вывести сообщение "No available connections"

        Connection connection = pool.getConnection();

        if (connection != null) {
            connection.use();
        }

        // TODO 18:
        // Добавь счётчики:
        // - сколько объектов создано
        // - сколько свободно


        ConnectionPool pool1 = new ConnectionPool(2);

        System.out.println("Created: " + pool1.getTotalCreated());
        System.out.println("Free: " + pool1.getFreeCount());

        Connection con1 = pool1.getConnection();
        System.out.println("Free: " + pool1.getFreeCount());

        Connection con2 = pool1.getConnection();
        System.out.println("Free: " + pool1.getFreeCount());

        pool1.releaseConnection(c1);
        System.out.println("Free: " + pool1.getFreeCount());
        // TODO 19:
        // Сделай ObjectPool потокобезопасным.

        // TODO 20:
        // Смоделируй работу пула:
        // - получить 3 объекта
        // - освободить 2 объекта
        // - снова получить 1 объект
        // - вывести состояние пула


        ConnectionPool connectionPool = new ConnectionPool(3);

        printState(pool);

        Connection connection1 = pool.getConnection();
        Connection connection2 = pool.getConnection();
        Connection connection3 = pool.getConnection();

        printState(pool);

        pool.releaseConnection(c1);
        pool.releaseConnection(c2);

        printState(pool);

        Connection c4 = pool.getConnection();


        printState(pool);

        if (c4 != null) {
            c4.use();
        }

        // ================================
        // PART 5: SITUATIONAL TASKS
        // ================================

        // TODO 21:
        // Напиши метод, возвращающий null.
        // Перепиши его так, чтобы он возвращал Optional.

        // TODO 22:
        // Напиши цикл for по коллекции.
        // Перепиши его с использованием Stream API.

        // TODO 23:
        // Создай пример, где Stream API делает код
        // более читаемым по сравнению с обычным циклом.
    }


    public static Optional<String> getOptionalString(String s) {
        Optional<String> opt = Optional.ofNullable(s);
        if (opt.isEmpty() || opt.get().isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(s);
    }


    public static Optional<Integer> getOptionalInteger(Integer num) {
        Optional<Integer> opt = Optional.ofNullable(num);
        opt.ifPresentOrElse((value) -> {
            System.out.println("\nValue = " + value);
        }, () -> {
            System.out.println("No value");
        });
        return opt;
    }

    public static Optional<Integer> getLength(String s) {
        return Optional.ofNullable(s)
                .map(String::length)
                .filter(len -> len > 5);
    }

    private static void printState(ConnectionPool pool) {
        System.out.println("Total created: " + pool.getTotalCreated());
        System.out.println("Free connections: " + pool.getFreeCount());
    }
}
