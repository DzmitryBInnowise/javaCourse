package org.practiceAnswers.StasKravchenkoAnswers;

import java.util.Arrays;
import java.util.Scanner;

public class FirstSessionKravchenkoStas {
    public static void main(String[] args) {

        System.out.println("=== Задание 1.1 — Простейшие переменные ===");
        // TODO: Создай переменные всех примитивных типов
        // Присвой им значения и выведи в консоль

        byte byteVariable = 55;
        short shortVariable = 250;
        int intVariable = 1;
        float floatVariable = 1.25f;
        double doubleVariable = 2.33;
        char charVariable = 'F';
        boolean booleanVariable = true;

        System.out.println("\n Все переменные: " +" " +byteVariable+" " + shortVariable+" " + intVariable+" " + floatVariable+" " +
                doubleVariable+" " + charVariable+" " + booleanVariable);

        System.out.println("\n=== Задание 1.2 — Логические операции ===");
        // TODO: Создай две переменные int a и int b
        // Создай boolean result:
        // true, если a > 0 и b < 100
        // Выведи result в консоль

        int a = 5;
        int b = 95;

        boolean result = a > 0 && b < 100;

        System.out.println("Ответ = " + result);

        System.out.println("\n=== Задание 1.3 — Ссылочные типы ===");
        // TODO: Создай массив из 5 чисел
        // Скопируй массив в другую переменную
        // Измени первый элемент копии
        // Выведи оба массива и объясни результат

        int[] mass1 = {5,6,7,9,10};
        int[] mass2 = Arrays.copyOf(mass1,mass1.length);

        mass2[0] = 44;

        System.out.println("Первый массив = " + Arrays.toString(mass1));
        System.out.println("Второй массив = " + Arrays.toString(mass2));
        System.out.println("mass1 и mass2 — разные массивы, поэтому изменение mass2 не влияет на mass1");

        System.out.println("\n=== Задание 1.4 — String ===");
        // TODO: Создай две строки s1 и s2
        // Присвой s2 = s1
        // Измени s2 на другую строку
        // Выведи s1 и s2
        // Объясни, почему s1 не изменился

        String s1 = "Hello";
        String s2;

        s2 = s1;
        s2 = "World";

        System.out.println("Вывод строки s1 = " + s1);
        System.out.println("Вывод строки s2 = " + s2);
        System.out.println("s1 не поменялся вместе с s2 потому что это новый объект");
        /*
         * =====================================================
         * 2️⃣ ОПЕРАТОРЫ ВЕТВЛЕНИЯ (if / else / switch)
         * =====================================================
         */

        System.out.println("\n=== Задание 2.1 — Оценки ===");
        // TODO: Создай int score (0-100)
        // Используя if / else if / else, выведи:
        // 90-100 → "Отлично"
        // 70-89 → "Хорошо"
        // 50-69 → "Удовлетворительно"
        // <50 → "Не сдано"

        int score = (int)(Math.random() * 101);

        System.out.println("Score равен = " + score);

        if(score>=90) System.out.println("Отлично");
        else if (score>=70 && score <= 89) System.out.println("Хорошо");
        else if (score>=50 && score <= 69) System.out.println("Удовлетворительно");
        else System.out.println("Не сдано");

        System.out.println("\n=== Задание 2.2 — Дни недели ===");
        // TODO: Создай int day (1-7)
        // Используя switch, выведи день недели
        // Для всех значений, кроме 1–7, вывести "Некорректный день"
        int day = (int)(Math.random() * 7)+1;

        switch (day){
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
                System.out.println("Неккоректный день");
        }

        System.out.println("\n=== Задание 2.3 — Проверка числа ===");
        // TODO: Создай int number
        // Если число >0 → "Положительное"
        // Если число <0 → "Отрицательное"
        // Если число ==0 → "Ноль"
        int number = (int)(Math.random() * 20) - 10;

        System.out.println("Число = " + number);

        if (number == 0) {
            System.out.println("Ноль");
        } else if (number < 0) {
            System.out.println(" → Отрицательное");
        } else {
            System.out.println("Положительное");
        }

        System.out.println("\n=== Задание 3.1 — Счётчик (for) ===");
        // TODO: Используя for, выведи числа от 1 до 10

        for (int i = 1; i<=10; i++ ){
            System.out.println(i);
        }

        System.out.println("\n=== Задание 3.2 — Сумма чисел (for) ===");
        // TODO: Используя for, посчитай сумму чисел от 1 до 100 и выведи результат

        int sum= 0;

        for(int i = 0;i <=100; i++){
            sum = sum+i;
        }
        System.out.println("Сумма равна " +sum );

        System.out.println("\n=== Задание 3.3 — Числа в обратном порядке (while) ===");
        // TODO: Используя while, выводи числа от 10 до 1 в обратном порядке

        int i = 10;

        while (i > 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("\n=== Задание 3.4 — Ввод числа до >100 (do-while) ===");
        // TODO: Используя do-while, спрашивай пользователя вводить число
        // Пока число <=100

        Scanner scanner = new Scanner(System.in);

        int numb;

        do {
            System.out.print("Введите число > 100: ");
            numb = scanner.nextInt();
        } while (numb <= 100);

        System.out.println("Вы ввели: " + numb);

        scanner.close();

        System.out.println("\n=== Задание 3.5 — Массив и итерации ===");
        // TODO: Создай массив из 5 чисел
        // Используя for-each, выведи все элементы массива
        // Используя for с индексом, умножь каждый элемент на 2 и выведи новый массив

        int[] arr1 = {1,2,3,4,5};

        for(int num : arr1){
            System.out.println(num);
        }
        int[] doubled = new int[arr1.length];
        for (int j = 0; j < arr1.length; j++) {
            doubled[j] = arr1[j] * 2;
        }

        System.out.print("Элементы, умноженные на 2: ");
        for (int num : doubled) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
