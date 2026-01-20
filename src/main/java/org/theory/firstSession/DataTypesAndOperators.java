package org.theory.firstSession;

public class DataTypesAndOperators {

    public static void main(String[] args) {

        /*
         * ================================
         * 1. ПЕРЕМЕННЫЕ И ТИПЫ ДАННЫХ
         * ================================
         */

        // --- Переменные ---
        // Переменная — это контейнер для хранения данных в памяти
        int age = 25;
        System.out.println("Возраст: " + age);

        // Значение переменной можно менять
        age = 30;
        System.out.println("Новый возраст: " + age);



        /*
         * ==========================================
         * ВСЕ ПРИМИТИВНЫЕ ТИПЫ ДАННЫХ В JAVA
         * Всего их 8
         * ==========================================
         */

        // 1. byte
        // 1 байт (8 бит)
        // Диапазон: -128 .. 127
        byte byteValue = 100;
        System.out.println("byte: " + byteValue);

        // 2. short
        // 2 байта
        // Диапазон: -32768 .. 32767
        short shortValue = 30000;
        System.out.println("short: " + shortValue);

        // 3. int
        // 4 байта
        // Самый часто используемый целочисленный тип
        int intValue = 1_000_000;
        System.out.println("int: " + intValue);

        // 4. long
        // 8 байт
        // Для очень больших целых чисел
        // Суффикс L обязателен
        long longValue = 10_000_000_000L;
        System.out.println("long: " + longValue);

        /*
         * ------------------------------------------
         * ДРОБНЫЕ ТИПЫ
         * ------------------------------------------
         */

        // 5. float
        // 4 байта
        // Менее точный
        // Суффикс f обязателен
        float floatValue = 3.14f;
        System.out.println("float: " + floatValue);

        // 6. double
        // 8 байт
        // Более точный, используется по умолчанию
        double doubleValue = 3.1415926535;
        System.out.println("double: " + doubleValue);

        /*
         * ------------------------------------------
         * СИМВОЛЬНЫЙ ТИП
         * ------------------------------------------
         */

        // 7. char
        // 2 байта
        // Хранит один символ Unicode
        char charValue = 'A';
        char charFromCode = 65; // ASCII/Unicode код символа 'A'

        System.out.println("char: " + charValue);
        System.out.println("char from code: " + charFromCode);

        /*
         * ------------------------------------------
         * ЛОГИЧЕСКИЙ ТИП
         * ------------------------------------------
         */

        // 8. boolean
        // Хранит true или false
        boolean isJavaFun = true;
        boolean isCold = false;

        System.out.println("boolean isJavaFun: " + isJavaFun);
        System.out.println("boolean isCold: " + isCold);

        /*
         * ------------------------------------------
         * ПОЛЕЗНЫЕ ПРИМЕРЫ
         * ------------------------------------------
         */

        // Арифметика с примитивами
        int a = 10;
        int b = 3;
        int sum = a + b;
        int division = a / b; // целочисленное деление

        System.out.println("sum: " + sum);
        System.out.println("division: " + division);

        // Логические операции
        boolean result = a > b && isJavaFun;
        System.out.println("logical result: " + result);

        /*
         * ------------------------------------------
         * ВАЖНЫЕ МОМЕНТЫ
         * ------------------------------------------
         */

        // Примитивы НЕ имеют методов
        int x = 5;
        // x.toString(); // ошибка компиляции

        // Преобразование типов (casting)
        double bigDouble = 9.99;
        int castedInt = (int) bigDouble; // потеря дробной части
        System.out.println("casted int: " + castedInt);

        System.out.println("Конец программы");


        /*
         * --- Ссылочные типы данных ---
         * Хранят ссылку на объект в памяти
         */

        String text = "Hello, Java";
        System.out.println(text);

        // У ссылочных типов есть методы
        System.out.println("Длина строки: " + text.length());

        // Массив — тоже ссылочный тип
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Первый элемент массива: " + numbers[0]);

        /*
         * --- Логические операторы ---
         */

        int x = 10;
        int y = 5;

        boolean result1 = x > y & x > 0; // И (AND)
        boolean result2 = x < y | y == 5; // ИЛИ (OR)
        boolean result3 = !(x == y); // НЕ (NOT)

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        /*
         * ================================
         * 2. ОПЕРАТОРЫ ВЕТВЛЕНИЯ
         * ================================
         */

        // --- if / else ---
        int score = 72;

        if (score >= 90) {
            System.out.println("Оценка: отлично");
        } else if (score >= 70) {
            System.out.println("Оценка: хорошо");
        } else if (score >= 50) {
            System.out.println("Оценка: удовлетворительно");
        } else {
            System.out.println("Экзамен не сдан");
        }

        /*
         * if выполняется только если условие true
         * else — если условие false
         */

        // --- switch ---
        int day = 4;

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
            default:
                System.out.println("Выходной");
        }

        /*
         * ================================
         * 3. ЦИКЛЫ И ИТЕРАЦИИ
         * ================================
         */

        // --- Цикл for ---
        // Используется, когда известно количество повторений
        for (int i = 0; i < 5; i++) {
            System.out.println("for: i = " + i);
        }

        /*
         * i = 0  — начальное значение
         * i < 5  — условие выполнения
         * i++    — шаг (увеличение на 1)
         */

        // --- Цикл while ---
        int counter = 0;

        while (counter < 3) {
            System.out.println("while: counter = " + counter);
            counter++;
        }

        /*
         * while проверяет условие ПЕРЕД выполнением
         */

        // --- Цикл do-while ---
        int value = 5;

        do {
            System.out.println("do-while: value = " + value);
            value++;
        } while (value < 3);

        /*
         * do-while выполнится ХОТЯ БЫ ОДИН РАЗ,
         * даже если условие изначально false
         */

        // --- Итерация по массиву (for-each) ---
        int[] data = {10, 20, 30};

        for (int item : data) {
            System.out.println("Элемент массива: " + item);
        }

        /*
         * for-each используется, когда:
         * - не нужен индекс
         * - нужно просто пройтись по всем элементам
         */

        System.out.println("Конец программы");
    }
}
