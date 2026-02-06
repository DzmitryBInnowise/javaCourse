package org.theory.seventhSession;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalLambdaStreamsSingletonObjectPool {
    public static void main(String[] args) {

        // ================================
        // 16. OPTIONAL
        // ================================

        /*
         * Optional — это контейнер, который может содержать значение или быть пустым.
         * Используется для избежания NullPointerException.
         */

        Optional<String> optionalName = Optional.of("Alice"); // значение гарантированно не null
        Optional<String> emptyOptional = Optional.empty();    // пустой Optional

        // Проверка наличия значения
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get());
        }

        // Более безопасный вариант
        optionalName.ifPresent(name -> System.out.println("Name: " + name));

        // Значение по умолчанию
        String name1 = emptyOptional.orElse("Default name");
        System.out.println(name1);

        // Значение через Supplier
        String name2 = emptyOptional.orElseGet(() -> "Generated name");

        // Бросить исключение, если пусто
        // emptyOptional.orElseThrow(() -> new RuntimeException("Value not found"));

        // Преобразование значения
        Optional<Integer> length = optionalName.map(String::length);
        System.out.println("Length: " + length.orElse(0));

        // Цепочка вызовов
        Optional<String> upper = optionalName
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase);

        System.out.println(upper.orElse("Not valid"));

        // ================================
        // 17. LAMBDA & STREAM API
        // ================================

        /*
         * Lambda — это краткая форма анонимного метода.
         *
         * (параметры) -> { тело }
         */

        Runnable r = () -> System.out.println("Hello from lambda");
        r.run();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Stream — поток данных для обработки коллекций
        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)        // фильтрация
                .map(n -> n * n)               // преобразование
                .collect(Collectors.toList()); // сбор результата

        System.out.println(evenSquares);

        // forEach
        numbers.forEach(n -> System.out.println(n));

        // reduce
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);

        // sorted
        List<Integer> sortedDesc = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(sortedDesc);

        // anyMatch / allMatch / noneMatch
        boolean anyGreaterThan5 = numbers.stream().anyMatch(n -> n > 5);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);

        System.out.println(anyGreaterThan5);
        System.out.println(allPositive);

        // ================================
        // 18. SINGLETON PATTERN
        // ================================

        /*
         * Singleton — класс, у которого существует только один экземпляр.
         */

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // true

        // ================================
        // OBJECT POOL PATTERN
        // ================================

        ObjectPool pool = new ObjectPool(2);

        PooledObject obj1 = pool.getObject();
        PooledObject obj2 = pool.getObject();

        pool.releaseObject(obj1);
        pool.releaseObject(obj2);
    }
}

// ================================
// SINGLETON IMPLEMENTATION
// ================================

class Singleton {

    private static Singleton instance;

    private Singleton() {
        // приватный конструктор
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/*
 * Потокобезопасный Singleton (Double Checked Locking)
 */
class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}

// ================================
// OBJECT POOL PATTERN
// ================================

class PooledObject {
    public void use() {
        System.out.println("Object in use");
    }
}

class ObjectPool {

    private Queue<PooledObject> availableObjects = new LinkedList<>();

    public ObjectPool(int size) {
        for (int i = 0; i < size; i++) {
            availableObjects.add(new PooledObject());
        }
    }

    public PooledObject getObject() {
        if (availableObjects.isEmpty()) {
            return new PooledObject();
        }
        return availableObjects.poll();
    }

    public void releaseObject(PooledObject obj) {
        availableObjects.offer(obj);
    }
}
