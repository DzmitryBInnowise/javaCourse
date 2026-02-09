package org.practiceAnswers.AlisaPauliuchenkavaAnswers.tasks;

import java.util.Scanner;

public class FirstSessionAlisaPauliuchenkava {

    public static void main(String[] args) {
        createPrimitiveTypes();
        useLogicalOperations();
        useReferenceTypes();
        checkString();
        checkMarks();
        checkDays();
        checkNumber();
        useCounter();
        checkSum();
        useReverseOrder();
        useDoWhile();
        useArrays();
    }

    /*
     * =====================================================
     * 1️⃣ ПЕРЕМЕННЫЕ, ПРИМИТИВНЫЕ И ССЫЛОЧНЫЕ ТИПЫ, ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
     * =====================================================
     */

    public static void createPrimitiveTypes() {
        System.out.println("=== Задание 1.1 — Простейшие переменные ===");
        // TODO: Создай переменные всех примитивных типов
        // Присвой им значения и выведи в консоль

        byte byteValue = 100;
        short shortValue = 1000;
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 3.14f;
        double doubleValue = 3.1415926535;
        char charValue = 'A';
        boolean booleanValue = false;

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    }

    public static void useLogicalOperations() {
        System.out.println("\n=== Задание 1.2 — Логические операции ===");
        // TODO: Создай две переменные int a и int b
        // Создай boolean result:
        // true, если a > 0 и b < 100
        // Выведи result в консоль

        int a = 50;
        int b = 75;

        boolean result = a > 0 && b < 100;
        System.out.println("result (a > 0 && b < 100) = " + result);
    }

    public static void useReferenceTypes() {
        System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");
        // TODO: Создай массив из 5 чисел
        // Скопируй массив в другую переменную
        // Измени первый элемент копии
        // Выведи оба массива и объясни результат

        int[] original = {10, 20, 30, 40, 50};
        int[] copy = original;

        copy[0] = 100;

        System.out.println("original[0] = " + original[0]);
        System.out.println("copy[0] = " + copy[0]);

        //в джава массивы являются объектами, при таком присваивании копируется только ссылка на массив, а не сам массив
    }

    public static void checkString() {
        System.out.println("\n=== Задание 1.4 — String ===");
        // TODO: Создай две строки s1 и s2
        // Присвой s2 = s1
        // Измени s2 на другую строку
        // Выведи s1 и s2
        // Объясни, почему s1 не изменился

        String s1 = "I love Java";
        String s2 = s1;

        s2 = "I don't really like Python";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        //cтроки в джава неизменяемы, поэтому при изменении создается новый объект
    }

    /*
     * =====================================================
     * 2️⃣ ОПЕРАТОРЫ ВЕТВЛЕНИЯ (if / else / switch)
     * =====================================================
     */

    public static void checkMarks() {
        System.out.println("\n=== Задание 2.1 — Оценки ===");
        // TODO: Создай int score (0-100)
        // Используя if / else if / else, выведи:
        // 90-100 → "Отлично"
        // 70-89 → "Хорошо"
        // 50-69 → "Удовлетворительно"
        // <50 → "Не сдано"

        int score = 95;

        if (score >= 90 && score <= 100) {
            System.out.println("Отлично");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Хорошо");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Удовлетворительно");
        } else if (score >= 0 && score < 50) {
            System.out.println("Не сдано");
        } else {
            System.out.println("Ошибка, число должно быть в диапазоне от 0 до 100 включительно");
        }
    }

    public static void checkDays() {
        System.out.println("\n=== Задание 2.2 — Дни недели ===");
        // TODO: Создай int day (1-7)
        // Используя switch, выведи день недели
        // Для всех значений, кроме 1–7, вывести "Некорректный день"

        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректный день");
        }
    }

    public static void checkNumber() {
        System.out.println("\n=== Задание 2.3 — Проверка числа ===");
        // TODO: Создай int number
        // Если число >0 → "Положительное"
        // Если число <0 → "Отрицательное"
        // Если число ==0 → "Ноль"

        int number = 15;

        System.out.println("число: " + number);

        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }

    /*
     * =====================================================
     * 3️⃣ ЦИКЛЫ И ИТЕРАЦИИ
     * =====================================================
     */

    public static void useCounter() {
        System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");
        // TODO: Используя for, выведи числа от 1 до 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void checkSum() {
        System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");
        // TODO: Используя for, посчитай сумму чисел от 1 до 100 и выведи результат

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void useReverseOrder() {
        System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");
        // TODO: Используя while, выводи числа от 10 до 1 в обратном порядке

        int number = 10;

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }

    public static void useDoWhile() {
        System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");
        // TODO: Используя do-while, спрашивай пользователя вводить число
        // Пока число <=100

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("введите число. введите число больше 100, чтобы остановиться");

        do {
            System.out.print("введите число: ");
            number = scanner.nextInt();
            if (number <= 100) {
                System.out.println("вы ввели: " + number);
            } else {
                System.out.println("число " + number + " больше 100");
            }
        } while (number <= 100);

        scanner.close();
    }

    public static void useArrays() {
        System.out.println("\n=== Задание 3.5 — Массив и итерации ===");
        // TODO: Создай массив из 5 чисел
        // Используя for-each, выведи все элементы массива
        // Используя for с индексом, умножь каждый элемент на 2 и выведи новый массив

        int[] numbers = {5, 4, 17, 20, 6};

        for (int num : numbers) {
            System.out.println(num);
        }

        int[] doubledNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = numbers[i] * 2;
        }

        for (int i = 0; i < doubledNumbers.length; i++) {
            System.out.println("индекс " + i + ": " + numbers[i] + " × 2 = " + doubledNumbers[i]);
        }
    }
}
