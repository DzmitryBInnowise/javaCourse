package org.practiceAnswers.AnnaVerkhovaAnswers.Tasks;

import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Patterns.*;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Person;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.User;

import java.util.*;
import java.util.stream.Collectors;

public class SeventhSessionAnnaVerkhova {
    public static void main(String[] args) {
        getOptionalString("Java is ");
        getOptionalInteger(100);
        getUsersEmail(new User("Anna ", Optional.of("a@innowise.com")));
        getListOptional();
        getString("Hello,Java");
        createListIntegerStream();
        createListStringWithStream();
        filterPerson();
        summaValue();
        cortedList();
        sortedMap();
        createList();
        patternSingleton();
        singletonForLogger();
        clonningSingleton();
        workConnectionPool();
        metodNull(1);
        metodNullWithOptional(1);
        animalsWithFor();
        animalsWithStream();
        peopleSortedWithFor();
        peopleSortedWithStream();
    }
    // ================================
    // PART 1: OPTIONAL
    // ================================

    // TODO 1:
    // Создай метод getOptionalString(String s),
    // который возвращает Optional<String>.
    // Если s == null или пустая строка — вернуть Optional.empty().

    public static Optional<String> getOptionalString(String s) {
        Optional<String> optionalS = Optional.ofNullable(s);
        if (s == null || s.isEmpty()) {
            System.out.println("String = " + "Optional.empty");
            return Optional.empty();
        }
        System.out.println("String = " + optionalS.get());
        return Optional.ofNullable(s);
    }
    // TODO 2:
    // Создай Optional<Integer>.
    // Используя ifPresent и orElse, выведи:
    // - значение, если оно есть
    // - сообщение "No value", если его нет.

    public static void getOptionalInteger(int n) {
        Optional<Integer> optionalInt = Optional.of(n);
        optionalInt.ifPresent(num -> System.out.println("Value: " + num));
        Integer result = optionalInt.orElse(null);
        if (result == null) {
            System.out.println("Value: " + "No value");
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

    public static void getUsersEmail(User user) {
        Optional<String> upperEmail = user.getEmail()
                .map(String::toUpperCase);

        System.out.println(upperEmail.orElse("Email not provided"));
    }
    // TODO 4:
    // Создай List<Optional<String>>.
    // Используя stream:
    // - убери пустые Optional
    // - извлеки значения
    // - выведи их в консоль

    public static void getListOptional() {
        List<Optional<String>> list = List.of(
                (Optional.of("Java")),
                (Optional.empty()),
                (Optional.of("Java")),
                (Optional.of("Java")),
                (Optional.empty()),
                (Optional.of("Java")));
        list.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }

    // TODO 5:
    // Используя Optional.map и Optional.filter:
    // преобразуй строку в её длину
    // и верни Optional<Integer>, только если длина > 5

    public static void getString(String s) {
        Optional<String> optional = Optional.of(s);
        optional.stream()
                .map(String::length)
                .filter(str -> str.longValue() > 5)
                .forEach(System.out::println);

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

    public static void createListIntegerStream() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = list.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());
        System.out.println(result);
    }
    // TODO 7:
    // Создай List<String>.
    // Используя stream:
    // - отфильтруй строки длиной больше 3
    // - переведи их в верхний регистр
    // - выведи результат

    public static void createListStringWithStream() {
        List<String> list = List.of("World", "Cat", "Dog", "lion", "tiger");
        List<String> result = list.stream()
                .filter(s -> s.length() > 3)
                .map((String::toUpperCase))
                .collect(Collectors.toList());
        System.out.println(result);
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

    public static void filterPerson() {
        List<Person> personList = List.of(
                new Person("Inna", 20),
                new Person("Ivan", 17),
                new Person("Kate", 27)
        );
        personList.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .forEach(System.out::println);
    }
    // TODO 9:
    // Используя reduce:
    // - найди сумму чисел в списке
    // - найди произведение чисел в списке

    public static void summaValue() {
        List<Integer> numbers = Arrays.asList(1, 20, 55, 7, 9, 10);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);

        int result = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Result = " + result);
    }

    // TODO 10:
    // Создай List<Integer>.
    // Используя stream:
    // - отсортируй по убыванию
    // - выведи результат

    public static void cortedList() {
        List<Integer> list = Arrays.asList(1, 20, 55, 7, 9, 10);
        List<Integer> result = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("List isn't sorted : " + list);
        System.out.println("Sorted list : " + result);
    }

    // TODO 11:
    // Создай Map<String, Integer>.
    // Используя stream:
    // - отфильтруй элементы, где значение > 50
    // - выведи ключи этих элементов

    public static void sortedMap() {
        Map<String, Integer> map = Map.of(
                "Dog", 15,
                "Lion", 110,
                "Cat", 5,
                "Tiger", 95);
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 50)
                .map(Map.Entry::getKey)
                .forEach(key -> System.out.println("Keys > 50 : " + key));
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

    public static void createList() {
        List<String> list = Arrays.asList("a", "b", "ab", "abc", "abcd", "abci");
        boolean anyList = list.stream().anyMatch(s -> s.isEmpty());
        boolean allList = list.stream().allMatch(s -> s.length() > 2);
        boolean noneList = list.stream().noneMatch(s -> s.matches(".*\\d.*"));

        System.out.println("String is -" + anyList);
        System.out.println("String length is more 2 char - " + allList);
        System.out.println("String isn't numbers - " + noneList);
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

    public static void patternSingleton() {
        SettingsSingleton settings = SettingsSingleton.getInstance();
        settings.setLanguage("English");
        System.out.println("Langeage is - " + settings.getLanguage());
    }

    // TODO 14:
    // Создай потокобезопасный Singleton для класса Logger.
    // Добавь метод log(String message).

    public static void singletonForLogger() {
        Logger logger = Logger.getInstance();
        logger.log("Hello!");
    }
    // TODO 15:
    // Запрети создание более одного экземпляра Singleton:
    // - приватный конструктор
    // - запрети клонирование
    // - (дополнительно) защита от reflection

    public static void clonningSingleton() {
        Singleton singleton = Singleton.getInstance();
        try {
            Singleton s2 = (Singleton) singleton.clone(); // пытаемся клонировать
            System.out.println("Clone created: " + s2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Singleton not allowed");
        }
    }

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

    public static void workConnectionPool() {
        ConnectionPool pool = new ConnectionPool(3);
        Connection с1 = pool.getConnection();
        Connection с2 = pool.getConnection();
        Connection с3 = pool.getConnection();
        System.out.println("After getting 3 connections:");
        System.out.println("Total created: " + pool.getTotalCreated());
        System.out.println("Available: " + pool.getAvailableCount());
        pool.releaseConnection(с1);
        pool.releaseConnection(с3);
        System.out.println("After releasing 2 connections:");
        System.out.println("Total created: " + pool.getTotalCreated());
        System.out.println("Available: " + pool.getAvailableCount());
        Connection с4 = pool.getConnection();
        System.out.println("After getting 1 connections:");
        System.out.println("Total created: " + pool.getTotalCreated());
        System.out.println("Available: " + pool.getAvailableCount());
    }
    // ================================
    // PART 5: SITUATIONAL TASKS
    // ================================
    // TODO 21:
    // Напиши метод, возвращающий null.
    // Перепиши его так, чтобы он возвращал Optional.

    public static String metodNull(int id) {
        if (id == 1) {
            System.out.println("Return id: " + id);
            return "Java";
        }
        System.out.println("Return: " + null);
        return null;
    }

    public static Optional<String> metodNullWithOptional(int id) {
        if (id == 1) {
            System.out.println("Return : " + Optional.of("Java"));
            return Optional.of("Java");
        }
        System.out.println("Return: " + Optional.empty());
        return Optional.empty();
    }
    // TODO 22:
    // Напиши цикл for по коллекции.
    // Перепиши его с использованием Stream API.

    public static void animalsWithFor() {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mouse");
        for (String animal : animals) {
            System.out.println("There are " + animal + " in list.");
        }
    }

    public static void animalsWithStream() {
        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Horse");
        animals.stream()
                .filter(s -> s.length() > 4)
                .forEach(System.out::println);
    }
    // TODO 23:
    // Создай пример, где Stream API делает код
    // более читаемым по сравнению с обычным циклом.

    public static void peopleSortedWithFor() {
        List<Person> people = List.of(
                new Person("Anna", 20),
                new Person("Ivan", 17),
                new Person("Kate", 25),
                new Person("Pavel", 35)
        );
        List<Person> filtered = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > 18) {
                filtered.add(p);
            }
        }
        Collections.sort(filtered, (a, b) -> a.getAge() - b.getAge());
        for (Person p : filtered) {
            String name = p.getName().toUpperCase();
            System.out.println(name);
        }
    }

    public static void peopleSortedWithStream() {
        List<Person> people = List.of(
                new Person("Anna", 20),
                new Person("Ivan", 17),
                new Person("Kate", 25),
                new Person("Pavel", 35)
        );
        List<String> result = people.stream()
                .filter(person -> person.getAge() > 18)
                .sorted(Comparator.comparing(Person::getAge))
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("New list : " + result);
    }
}