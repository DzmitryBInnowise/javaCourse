package org.practiceAnswers.StanislawHolovnevAnswers.tasks;

import java.util.Scanner;

public class FirstSessionStanislawHolovnev {

    public static void main(String[] args) {

        usePrimitiveTypes();
        createTwoVariables(10, 50);
        createArray();
        createStrings();
        createIntScore();
        createIntDay();
        checkNumber();
        useLoops();
        sumNumbers();
        reverseNumbers();
        inputUntilOver100();
        createArrayAndIterate();
        /*
         * =====================================================
         * 1️⃣ ПЕРЕМЕННЫЕ, ПРИМИТИВНЫЕ И ССЫЛОЧНЫЕ ТИПЫ, ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
         * =====================================================
         */
    }

    public static void usePrimitiveTypes() {
        System.out.println("=== Задание 1.1 — Простейшие переменные ===");
        // TODO: Создай переменные всех примитивных типов
        byte a = 10;
        short b = 240;
        int c = 120;
        long d = 12345698L;
        float e = 14.2f;
        double f = 12.22;
        boolean g = false;
        char h = 'S';
        String i = "Yo";
        System.out.println("byte:" + a +
                "\nshort: " + b +
                "\nint: " + c +
                "\nlong: " + d +
                "\nfloat: " + e +
                "\ndouble: " + f +
                "\nboolean: " + g +
                "\nchar: " + h +
                "\nString: " + i);
    }

    public static void createTwoVariables(int a1, int b1) {
        System.out.println("\n=== Задание 1.2 — Логические операции ===");
        // TODO: Создай две переменные int a и int b
        boolean result = a1 > 0 && b1 < 100;
        System.out.println("Result: " + result);
    }


    public static void createArray() {
        System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");
        // TODO: Создай массив из 5 чисел
        int num[] = {1, 2, 3, 4, 69};
        int copyNum[] = num;
        System.out.println("Original num from array is: " + num[4]);
        copyNum[4] = 67;
        System.out.println("Copy and changed num in array is: " + copyNum[4]);
    }

    public static void createStrings() {
        System.out.println("\n=== Задание 1.4 — String ===");
        // TODO: Создай две строки s1 и s2
        String s1 = "Yo!";
        String s2 = "Hello!";
        System.out.println("Original first is: " + s1);
        System.out.println("Original second is: " + s2);
        s2 = s1;
        s2 = "Now its little different";
        System.out.println("Changed first is: " + s1);
        System.out.println("Changed second is: " + s2);
    }
    /*
     * =====================================================
     * 2️⃣ ОПЕРАТОРЫ ВЕТВЛЕНИЯ (if / else / switch)
     * =====================================================
     */
    public static void createIntScore() {
        System.out.println("\n=== Задание 2.1 — Оценки ===");
        // TODO: Создай int score (0-100)
        Scanner score = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score1 = score.nextInt();
        if (score1 >= 90 && score1 <= 100) {
            System.out.println("Excellent");
        } else if (score1 >= 70 && score1 < 90) {
            System.out.println("Good");
        } else if (score1 >= 50 && score1 < 70) {
            System.out.println("Satisfactory");
        } else if (score1 < 50) {
            System.out.println("Not passed");
        }
    }

    public static void createIntDay() {
        System.out.println("\n=== Задание 2.2 — Дни недели ===");
        // TODO: Создай int day (1-7)
        Scanner day = new Scanner(System.in);
        System.out.println("Enter day number (1-7): ");
        int dayNum = day.nextInt();
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect day");
        }
    }

    public static void checkNumber() {
        System.out.println("\n=== Задание 2.3 — Проверка числа ===");
        // TODO: Создай int number
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numCheck = number.nextInt();
        if (numCheck > 0) {
            System.out.println("Положительное");
        } else if (numCheck < 0) {
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
    public static void useLoops() {
        System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");
        // TODO: Используя for, выведи числа от 1 до 10
        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.println(i1);
        }
    }

    public static void sumNumbers() {
        System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");
        // TODO: Используя for, посчитай сумму чисел от 1 до 100 и выведи результат
        int sum = 0;
        for (int i2 = 1; i2 <= 100; i2++) {
            sum += i2;
            System.out.println("Sum is: " + sum);
        }
    }

    public static void reverseNumbers() {
        System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");
        // TODO: Используя while, выводи числа от 10 до 1 в обратном порядке
        int i3 = 10;
        while (i3 >= 1) {
            System.out.println(i3);
            i3--;
        }
    }

    public static void inputUntilOver100() {
        System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");
        // TODO: Используя do-while, спрашивай пользователя вводить число
        Scanner input = new Scanner(System.in);
        int numberInput;
        do {
            System.out.println("Please enter a number greater than 100: ");
            numberInput = input.nextInt();
        } while (numberInput <= 100);
    }

    public static void createArrayAndIterate() {
        System.out.println("\n=== Задание 3.5 — Массив и итерации ===");
        // TODO: Создай массив из 5 чисел
        int[] numbers = {2, 4, 6, 8, 10};
        for (int num1 : numbers) {
            System.out.println(num1);
        }
        for (int i4 = 0; i4 < numbers.length; i4++) {
            numbers[i4] *= 2;
            System.out.println(numbers[i4]);
        }
    }
}



