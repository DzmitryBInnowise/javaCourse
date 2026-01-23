package org.practiceAnswers.AnnaVerkhovaAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class FirstSessionAnnaVerkhova {
    public static void main(String[] args) {

        /*
         * =====================================================
         * 1️⃣ ПЕРЕМЕННЫЕ, ПРИМИТИВНЫЕ И ССЫЛОЧНЫЕ ТИПЫ, ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
         * =====================================================
         */
        System.out.println("=== Задание 1.1 — Простейшие переменные ===");
        // TODO: Создай переменные всех примитивных типов
        // Присвой им значения и выведи в консоль

        byte biteValue = 125;
        System.out.println("bite - " + biteValue);
        short shortValue = 30150;
        System.out.println("short - " + shortValue);
        int intValue = 30150;
        System.out.println("int - " + intValue);
        long longValue = 6000000L;
        System.out.println("long - " + longValue);
        float floatValue = 1.5f;
        System.out.println("float - " + floatValue);
        double doubleValue = 3.58795;
        System.out.println("double - " + doubleValue);
        char charValue = 'V';
        System.out.println("Char - " + charValue);
        boolean nowIsWinter = true;
        boolean nowIsSummer = false;
        System.out.println("boolean nowIsWinter " + nowIsWinter);
        System.out.println("boolean nowIsSummer " + nowIsSummer);

        System.out.println("\n=== Задание 1.2 — Логические операции ===");
        // TODO: Создай две переменные int a и int b
        // Создай boolean result:
        // true, если a > 0 и b < 100
        // Выведи result в консоль

        int a = 3;
        int b = 85;
        boolean result = a > 0 && b < 100;
        System.out.println(result);

        System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");
        // TODO: Создай массив из 5 чисел
        // Скопируй массив в другую переменную
        // Измени первый элемент копии
        // Выведи оба массива и объясни результат

        int[] numbers1 = {1, 4, 7, 2, 5};
        System.out.println(Arrays.toString(numbers1));
        int[] numbers2 = Arrays.copyOf(numbers1, numbers1.length);
        numbers2[0] = 77;
        System.out.println(Arrays.toString(numbers2));

        System.out.println("\n=== Задание 1.4 — String ===");
        // TODO: Создай две строки s1 и s2
        // Присвой s2 = s1
        // Измени s2 на другую строку
        // Выведи s1 и s2
        // Объясни, почему s1 не изменился

        String s1 = "Hello, Dmitry";
        String s2 = s1;
        s2 = "I'm Anna";

        System.out.println("S1 " + s1);
        System.out.println("S2 " + s2);

        System.out.println("\n=== Задание 2.1 — Оценки ===");
        // TODO: Создай int score (0-100)
        // Используя if / else if / else, выведи:
        // 90-100 → "Отлично"
        // 70-89 → "Хорошо"
        // 50-69 → "Удовлетворительно"
        // <50 → "Не сдано"

        int score = 93;
        if (score >= 90 && score <= 100) {
            System.out.println("Оценка - Отлично");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Оценака - Хорошо");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Оценка - Удовлетворительно");
        } else {
            System.out.println("Оценка - Не сдано");
        }

        System.out.println("\n=== Задание 2.2 — Дни недели ===");
        // TODO: Создай int day (1-7)
        // Используя switch, выведи день недели
        // Для всех значений, кроме 1–7, вывести "Некорректный день"

        int day = 3;
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

        System.out.println("\n=== Задание 2.3 — Проверка числа ===");
        // TODO: Создай int number
        // Если число >0 → "Положительное"
        // Если число <0 → "Отрицательное"
        // Если число ==0 → "Ноль"

        int value1 = -34;

        if (value1 > 0) {
            System.out.println("Положительное");
        } else if (value1 < 0) {
            System.out.println("Отрицательное");
        } else if (value1 == 0) {
            System.out.println("Ноль");
        }

        System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");
        // TODO: Используя for, выведи числа от 1 до 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(" For i = " + i);
        }

        System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");
        // TODO: Используя for, посчитай сумму чисел от 1 до 100 и выведи результат

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");
        // TODO: Используя while, выводи числа от 10 до 1 в обратном порядке

        int value2 = 10;
        while (value2 > 0) {
            System.out.println("Число - " + value2);
            value2--;
        }

        System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");
        // TODO: Используя do-while, спрашивай пользователя вводить число
        // Пока число <=100

        Scanner scanner = new Scanner(System.in);
        int number1;
        do {
            System.out.print("Введите число: ");
            number1 = scanner.nextInt();
            System.out.println("do - while: Numder " + number1);
        } while (number1 <= 100);
        System.out.println("Введено число больше 100. Конец программы");

        System.out.println("\n=== Задание 3.5 — Массив и итерации ===");
        // TODO: Создай массив из 5 чисел
        // Используя for-each, выведи все элементы массива
        // Используя for с индексом, умножь каждый элемент на 2 и выведи новый массив

        int[] array = {2, 55, 88, 63, 7};
        for (int item : array) {
            System.out.println("Эллемент массива - " + item);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        System.out.println("Новый массив - " + Arrays.toString(array));
    }
}
