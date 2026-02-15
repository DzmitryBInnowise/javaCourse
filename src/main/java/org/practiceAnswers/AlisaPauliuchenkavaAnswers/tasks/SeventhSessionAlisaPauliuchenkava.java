package org.practiceAnswers.AlisaPauliuchenkavaAnswers.tasks;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Person;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.User;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.poolPattern.Connection;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.poolPattern.ConnectionPool;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.singleton.Logger;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.singleton.SettingsSingleton;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.User.printEmail;

public class SeventhSessionAlisaPauliuchenkava {

    public static void main(String[] args) {
        System.out.println(getOptionalString(null).isPresent());
        Optional<Integer> presentValue = Optional.of(42);
        getOptionalInteger(presentValue);
        User user1 = new User("Алиса", "alice@wonderland.com");
        User user2 = new User("Женя", null);
        printEmail(user1);
        printEmail(user2);
        List<Optional<String>> data = List.of(
                Optional.of("Java"),
                Optional.empty(),
                Optional.of("Python")
        );
        printStrings(data);
        String longString = "hello my name is";
        String shortString = "cat";
        System.out.println(getLength(longString));
        System.out.println(getLength(shortString));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> processedList = getEvenSquares(numbers);
        System.out.println(processedList);

        List<String> langs = List.of("Java", "Python", "PHP", "Dart");
        processStrings(langs);

        List<Person> people = List.of(
                new Person("Алиса", 21),
                new Person("Лера", 25),
                new Person("Катя", 30),
                new Person("Даша", 15)
        );
        printNames(people);

        int sum = calculateSum(numbers);
        int product = calculateProduct(numbers);
        System.out.println(sum);
        System.out.println(product);

        printSorted(numbers);

        Map<String, Integer> items = Map.of(
                "кот", 30,
                "хомяк", 60,
                "собака", 25,
                "попугай", 80
        );
        printFilteredKeys(items);

        runChecks(langs);

        SettingsSingleton settings = SettingsSingleton.getInstance();
        System.out.println("изначальный язык: " + settings.getLanguage());
        settings.setLanguage("русский");
        SettingsSingleton anotherSettings = SettingsSingleton.getInstance();
        System.out.println("второй язык: " + anotherSettings.getLanguage());

        Logger.getInstance().log("тест запущен");

        ConnectionPool pool = new ConnectionPool();
        pool.printStats();
        Connection c1 = pool.getConnection();
        Connection c2 = pool.getConnection();
        Connection c3 = pool.getConnection();
        pool.printStats();
        pool.releaseConnection(c1);
        pool.releaseConnection(c2);
        pool.printStats();
        Connection c4 = pool.getConnection();
        pool.printStats();


    }

    // ================================
    // PART 1: OPTIONAL
    // ================================

    // TODO 1:
    // Создай метод getOptionalString(String s),
    // который возвращает Optional<String>.
    // Если s == null или пустая строка — вернуть Optional.empty().

    public static Optional<String> getOptionalString(String s) {
        if (s == null || s.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(s);
    }

    // TODO 2:
    // Создай Optional<Integer>.
    // Используя ifPresent и orElse, выведи:
    // - значение, если оно есть
    // - сообщение "No value", если его нет.

    public static void getOptionalInteger(Optional<Integer> a) {
        System.out.println();
        a.ifPresent(val -> System.out.println(val));
        if (a.isEmpty()) {
            System.out.println(a.map(Object::toString).orElse("No value"));
        }
    }

    // TODO 3:
    // Создай класс User с полями:
    // String name
    // Optional<String> email
    //
    // Создай метод, который:
    // - выводит email в верхнем регистре
    // - если email отсутствует, выводит "Email not provided"

    // TODO 4:
    // Создай List<Optional<String>>.
    // Используя stream:
    // - убери пустые Optional
    // - извлеки значения
    // - выведи их в консоль

    public static void printStrings(List<Optional<String>> list) {
        System.out.println();
        list.stream()
                .flatMap(Optional::stream)
                .forEach(System.out::println);
    }

    // TODO 5:
    // Используя Optional.map и Optional.filter:
    // преобразуй строку в её длину
    // и верни Optional<Integer>, только если длина > 5

    public static Optional<Integer> getLength(String s) {
        System.out.println();
        return Optional.ofNullable(s)
                .map(String::length)
                .filter(l -> l > 5);
    }


    // ================================
    // PART 2: LAMBDA & STREAM API
    // ================================

    // TODO 6:
    // Создай List<Integer>.
    // Используя Stream API:
    // - оставь только чётные числа
    // - возведи их в квадрат
    // - сохрани результат в новый список

    public static List<Integer> getEvenSquares(List<Integer> input) {
        System.out.println();
        return input.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // TODO 7:
    // Создай List<String>.
    // Используя stream:
    // - отфильтруй строки длиной больше 3
    // - переведи их в верхний регистр
    // - выведи результат

    public static void processStrings(List<String> input) {
        System.out.println();
        input.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    // TODO 8:
    // Создай класс Person с полями:
    // String name
    // int age
    //
    // Создай список Person.
    // Используя stream:
    // - отфильтруй людей старше 18
    // - выведи их имена

    public static void printNames(List<Person> list) {
        System.out.println();
        list.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .forEach(System.out::println);
    }

    // TODO 9:
    // Используя reduce:
    // - найди сумму чисел в списке
    // - найди произведение чисел в списке

    public static int calculateSum(List<Integer> list) {
        System.out.println();
        return list.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static int calculateProduct(List<Integer> list) {
        return list.stream()
                .reduce(1, (a, b) -> a * b);
    }

    // TODO 10:
    // Создай List<Integer>.
    // Используя stream:
    // - отсортируй по убыванию
    // - выведи результат

    public static void printSorted(List<Integer> list) {
        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }

    // TODO 11:
    // Создай Map<String, Integer>.
    // Используя stream:
    // - отфильтруй элементы, где значение > 50
    // - выведи ключи этих элементов

    public static void printFilteredKeys(Map<String, Integer> map) {
        System.out.println();
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 50)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

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

    public static void runChecks(List<String> list) {
        System.out.println();
        boolean hasEmpty = list.stream()
                .anyMatch(String::isEmpty);
        boolean allLongerThan2 = list.stream()
                .allMatch(s -> s.length() > 2);
        boolean noneHaveDigits = list.stream()
                .noneMatch(s -> s.matches(".*[0-9].*"));
        System.out.println("пустые строки " + hasEmpty);
        System.out.println("все длиннее 2 символов " + allLongerThan2);
        System.out.println("нет строк с цифрами " + noneHaveDigits);
    }

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

    // TODO 14:
    // Создай потокобезопасный Singleton для класса Logger.
    // Добавь метод log(String message).

    // TODO 15:
    // Запрети создание более одного экземпляра Singleton:
    // - приватный конструктор
    // - запрети клонирование
    // - (дополнительно) защита от reflection


    // ================================
    // PART 4: OBJECT POOL PATTERN
    // ================================

    // TODO 16:
    // Создай класс Connection (имитация соединения с БД).
    // Создай класс ConnectionPool:
    // - хранит несколько объектов Connection
    // - метод getConnection()
    // - метод releaseConnection(Connection c)

    // TODO 17:
    // Добавь ограничение:
    // если все соединения заняты —
    // вывести сообщение "No available connections"

    // TODO 18:
    // Добавь счётчики:
    // - сколько объектов создано
    // - сколько свободно

    // TODO 19:
    // Сделай ObjectPool потокобезопасным.

    // TODO 20:
    // Смоделируй работу пула:
    // - получить 3 объекта
    // - освободить 2 объекта
    // - снова получить 1 объект
    // - вывести состояние пула
}
