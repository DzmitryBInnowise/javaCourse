package org.practiceAnswers.StanislawHolovnevAnswers.tasks;

import org.practiceAnswers.StanislawHolovnevAnswers.db.Connection;
import org.practiceAnswers.StanislawHolovnevAnswers.db.ConnectionPool;
import org.practiceAnswers.StanislawHolovnevAnswers.helpers.Logger;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Person;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.User;
import org.practiceAnswers.StanislawHolovnevAnswers.setup.SettingsSingleton;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SevenSessionStanislawHolovnev {


    public static void main(String[] args) {
        getOptionalString("Heyo");
        useOptionalInteger();
        useUser();
        useOptionalList();
        convertStringToLength("Hey");
        getEvenSquares(Arrays.asList(1, 2, 3, 4, 5));
        getUpperCaseStrings(Arrays.asList("Heyo", "Stas", "Here"));
        getAdultsNames(Arrays.asList(new Person("John", 25, "password123"),
                new Person("Stas", 17, "password123")));
        System.out.println(getSum(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(getProduct(Arrays.asList(1, 2, 3, 4, 5)));
        getFiltered(Arrays.asList(1, 2, 3, 4, 5));
        sortMap(Map.of("A", 10, "B", 60, "C", 30));
        checkStrings(Arrays.asList("Hey", "Stas", "123", "Short", ""));
        changeLanguage("French");
        log("Hello from logger");
        simulatePoolUsage();
        System.out.println(getOptionalNull().orElse("No value"));
        printCollection(Arrays.asList("Yo", "It's me", "Again"));
        showStreamExample(Arrays.asList(1, 2, 3, 4, 5));

    }

        // ================================
        // PART 1: OPTIONAL
        // ================================

        // TODO 1:
        // Создай метод getOptionalString(String s),
        // который возвращает Optional<String>.
        // Если s == null или пустая строка — вернуть Optional.empty().

        public static Optional<String> getOptionalString(String s) {
        log("TODO 1");
        if (s == null || s.isEmpty()) return Optional.empty();
        return Optional.of(s);
        }

        // TODO 2:
        // Создай Optional<Integer>.
        // Используя ifPresent и orElse, выведи:
        // - значение, если оно есть
        // - сообщение "No value", если его нет.

        public static void useOptionalInteger() {
        log("TODO 2");
        Optional<Integer> optionalInt = Optional.of(5);
        optionalInt.ifPresent(System.out::println);
        System.out.println(optionalInt.map(String::valueOf).orElse("No value"));
    }

        // TODO 3:
        // Создай класс User с полями:
        // String name
        // Optional<String> email
        // Создай метод, который:
        // - выводит email в верхнем регистре
        // - если email отсутствует, выводит "Email not provided"

        public static void useUser() {
        log("TODO 3");
        User user = new User("John", Optional.of("john@gmail.com"));
        user.printEmail();
        }

        // TODO 4:
        // Создай List<Optional<String>>.
        // Используя stream:
        // - убери пустые Optional
        // - извлеки значения
        // - выведи их в консоль

        public static void useOptionalList() {
            log("TODO 4");
            List<Optional<String>> optionalStrings = Arrays.asList(Optional.of("Hello"),
                    Optional.empty(), Optional.of("World"));
            optionalStrings.stream()
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .forEach(System.out::println);
        }

        // TODO 5:
        // Используя Optional.map и Optional.filter:
        // преобразуй строку в её длину
        // и верни Optional<Integer>, только если длина > 5

        public static Optional<Integer> convertStringToLength(String s) {
            log("TODO 5");

            System.out.println("String length: " + Optional.ofNullable(s).map(String::length).filter(l -> 5 < l));
            return Optional.ofNullable(s).map(String::length).filter(l -> 5 < l);
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

        public static List<Integer> getEvenSquares(List<Integer> values) {
            log("TODO 6");

            return values.stream()
                    .filter(i -> i % 2 == 0)
                    .map(i -> i * i)
                    .collect(Collectors.toList());
        }

        // TODO 7:
        // Создай List<String>.
        // Используя stream:
        // - отфильтруй строки длиной больше 3
        // - переведи их в верхний регистр
        // - выведи результат

        public static void getUpperCaseStrings(List<String> strings) {
            log("TODO 7");

            strings.stream()
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

        public static void getAdultsNames(List<Person> persons) {
            log("TODO 8");
            persons.stream()
                    .filter(p -> p.getAge() > 18)
                    .map(Person::getName)
                    .forEach(System.out::println);
        }

        // TODO 9:
        // Используя reduce:
        // - найди сумму чисел в списке
        // - найди произведение чисел в списке

        public static Optional<Integer> getSum(List<Integer> nums) {
            log("TODO 9");
            return nums.stream().reduce(Integer::sum);
        }

        public static Optional<Integer> getProduct(List<Integer> nums) {
            return nums.stream().reduce((a, b) -> a * b);
        }

        // TODO 10:
        // Создай List<Integer>.
        // Используя stream:
        // - отсортируй по убыванию
        // - выведи результат

        public static void getFiltered(List<Integer> list) {
            log("TODO 10");
            list.stream()
                    .sorted((a, b ) -> b - a)
                    .forEach(System.out::println);

        }

        // TODO 11:
        // Создай Map<String, Integer>.
        // Используя stream:
        // - отфильтруй элементы, где значение > 50
        // - выведи ключи этих элементов

        public static void sortMap(Map<String, Integer> map) {
            log("TODO 11");
            map.entrySet().stream()
                    .filter(e -> e.getValue() > 50)
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

        public static void checkStrings(List<String> strings) {
            log("TODO 12");
            boolean empty = strings.stream().anyMatch(String::isEmpty);
            boolean shortStrings = !strings.stream().allMatch(s -> s.length() > 2);
            boolean numbers = !strings.stream().noneMatch(s -> s.matches(".*\\d+.*"));
            if (empty) System.out.println("Empty strings found");
            if (shortStrings) System.out.println("Some strings are too short");
            if (numbers) System.out.println("Some strings contain numbers");
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

        public static void changeLanguage(String language) {
            log("TODO 13");
            SettingsSingleton.getInstance().setLanguage(language);
            System.out.println("Language changed to " + language);
        }


        // TODO 14:
        // Создай потокобезопасный Singleton для класса Logger.
        // Добавь метод log(String message).

        public static void log(String message) {
            Logger.getInstance().log(message);
        }


        // TODO 15:
        // Запрети создание более одного экземпляра Singleton:
        // - приватный конструктор
        // - запрети клонирование
        // - (дополнительно) защита от reflection

        private SevenSessionStanislawHolovnev() {
            log("TODO 15");
            throw new IllegalStateException("Singleton class");
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException("Singleton class");
        }


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

        public static void simulatePoolUsage() {
            log("TODO 16-20");
            ConnectionPool pool = new ConnectionPool(3);
            Connection c1 = pool.getConnection();
            Connection c2 = pool.getConnection();
            Connection c3 = pool.getConnection();
            pool.releaseConnection(c1);
            pool.releaseConnection(c2);
            Connection c4 = pool.getConnection();
            pool.printStatus();
        }


        // ================================
        // PART 5: SITUATIONAL TASKS
        // ================================

        // TODO 21:
        // Напиши метод, возвращающий null.
        // Перепиши его так, чтобы он возвращал Optional.

        public static Optional<String> getOptionalNull() {
            log("TODO 21");
            return Optional.empty();
        }

        // TODO 22:
        // Напиши цикл for по коллекции.
        // Перепиши его с использованием Stream API.

        public static void printCollection(List<String> strings) {
            log("TODO 22");
            strings.stream()
                    .forEach(System.out::println);
        }

        // TODO 23:
        // Создай пример, где Stream API делает код
        // более читаемым по сравнению с обычным циклом.

        public static void showStreamExample(List<Integer> numbers) {
            log("TODO 23");
            for (Integer n : numbers) {
                if (n % 2 == 0) {
                    System.out.println(n * n);
                }
            }
            numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .forEach(System.out::println);
        }
}
