package org.practiceAnswers.StanislawHolovnevAnswers.tasks;

import org.practiceAnswers.StanislawHolovnevAnswers.models.animal.Animal;
import org.practiceAnswers.StanislawHolovnevAnswers.models.values.BankAccount;
import org.practiceAnswers.StanislawHolovnevAnswers.models.animal.Dog;
import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Person;

import java.util.Scanner;

public class SecondSessionStanislawHolovnev {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        useArray(1, 2, 3, 4, 5);
        findMinMaxArrayNum(23, 11, 22, 16, 5);
        findSumArrayNum(44, 12, 38, 6, 10);
        createAndModifyArrays();
        copyAndModifyArray();
        changeString("Hey, my name Stanislaw", "Hey, my name Wladyslaw");
        compareStrings("Yo, how are u?", "Yo, how are u?");
        useStringBuilder();
        useReverse("Innowise");
        useBankAccount("Stanislaw", 1000.0, 250.0, 150.0);
        usePersonInformation("Leo", 30);
        useDogSound("Reggy");
        useArrayOfAnimals("Robert the Tiger", "Reggy the Dog");
        useSum(2,2);
        printNumbers(1,72);
        useIsEven(28);
        findAverageOfArray(10,12,22,33,45);
    }
    /* =====================================================
     * 1️⃣ МАССИВЫ
     * =====================================================
     */

    // ЗАДАНИЕ 1.1
    public static void useArray(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        // TODO: Создай массив из 5 целых чисел, выведи его в консоль
        int[] numbers = {numOne, numTwo, numThree, numFour, numFive};
        System.out.println("Arrays numbers is: " + java.util.Arrays.toString(numbers));
    }

    // ЗАДАНИЕ 1.2
    // Найди минимальный и максимальный элемент массива
    public static void findMinMaxArrayNum(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        // TODO: Найди минимальный и максимальный элемент массива
        int[] numbers = {numOne, numTwo, numThree, numFour, numFive};
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Min number is: " + min);
        System.out.println("Max number is: " + max);
    }

    // ЗАДАНИЕ 1.3
    // Найди сумму всех элементов массива
    public static void findSumArrayNum(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        // TODO: Найди сумму всех элементов массива
        int[] numbers = {numOne, numTwo, numThree, numFour, numFive};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array numbers is: " + sum);
    }

    // ЗАДАНИЕ 1.4
    // Создай второй массив
    // Скопируй ссылку на первый массив
    // Измени любой элемент второго массива
    // Выведи оба массива и ОБЪЯСНИ результат
    public static void createAndModifyArrays() {
        // TODO: создай и измени массивы
        int [] firstArray = {12,16,46,23,8};
        int [] secondArray = firstArray;
        secondArray[2] = 67;
        System.out.println("First array: " + java.util.Arrays.toString(firstArray));
        System.out.println("Second array: " + java.util.Arrays.toString(secondArray));
        System.out.println("Объяснение: при присвоении второго массива первому," +
                " оба массива ссылаются на один и тот же объект в памяти. " +
                "Поэтому изменение элемента во втором массиве также влияет на первый массив.");
    }

    // ЗАДАНИЕ 1.5
    // Создай НОВЫЙ массив
    // Скопируй в него элементы первого массива (поэлементно)
    // Измени новый массив
    // Убедись, что первый не изменился
    public static void copyAndModifyArray() {
        //TODO: создай и измени массивы
        int [] firstArray = {5,9,14,27,33};
        int [] newArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        System.out.println("New array before modification: " + java.util.Arrays.toString(newArray));
        newArray[1] = 99;
        System.out.println("New array after modification: " + java.util.Arrays.toString(newArray));
        System.out.println("First array remains unchanged: " + java.util.Arrays.toString(firstArray));
        System.out.println("Объяснение: при создании нового массива и копировании элементов " +
                "поэлементно, новый массив становится независимым от первого. " +
                "Поэтому изменения в новом массиве не влияют на первый массив.");
    }
    /* =====================================================
     * 2️⃣ STRING / STRINGBUILDER
     * =====================================================
     */
    // ЗАДАНИЕ 2.1
    // Создай строку
    // Присвой её другой переменной
    // "Измени" вторую строку
    // Выведи обе строки
    // Объясни, почему первая не изменилась
    public static void changeString(String firstString, String secondString) {
        //TODO: создай и измени строки
        firstString = firstString;
        secondString = firstString;
        secondString = secondString;
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);
        System.out.println("Объяснение: строки в Java являются неизменяемыми (immutable)");
    }

    // ЗАДАНИЕ 2.2
    // Сравни две строки с помощью == и equals()
    // Выведи результаты
    public static void compareStrings(String str1, String str2) {
        //TODO: сравни строки
        boolean isEquals = str1 == str2;
        boolean isEqualContent = str1.equals(str2);
        System.out.println("Equals with '==': " + isEquals);
        System.out.println("Equals with 'equals()': " + isEqualContent);
    }

    // ЗАДАНИЕ 2.3
    // Используя StringBuilder:
    // - собери строку из чисел от 1 до 10 через пробел
    public static void useStringBuilder() {
        //TODO: собери строку из чисел от 1 до 10 через пробел
        stringBuilder.setLength(0);
        for (int i = 1; i <= 10; i++) {
            stringBuilder.append(i);
            if (i < 10) {
                stringBuilder.append(" ");
            }
        }
        System.out.println("String from 1 to 10: " + stringBuilder.toString());
    }

    // ЗАДАНИЕ 2.4
    // Используя StringBuilder:
    // - разверни строку "Java"
    public static void useReverse(String originalWord) {
        stringBuilder.setLength(0);
        stringBuilder.append(originalWord);
        stringBuilder.reverse();
        System.out.println("Original word is:" + originalWord);
        System.out.println("Reversed word is:" + stringBuilder.toString());
    }

    public static void useBankAccount(String owner, double balance, double depositAmount, double withdrawAmount) {
        BankAccount bankAccount = new BankAccount(owner, balance);
        bankAccount.deposit(depositAmount);
        bankAccount.withdraw(withdrawAmount);
    }

    public static void usePersonInformation(String name, int age) {
        Person person = new Person(name, age);
        person.printInfo();
    }

    public static void useDogSound(String dogName) {
        Dog dog = new Dog(dogName) {
            @Override
            public void makeSoundAbstract() {

            }
        };
        dog.makeSound();
    }

    public static void useSum(int a, int b) {
        int result = sum(a, b);
        int resultDouble = (int) sum(5.5, 4.5);
        int resultThreeInt = sum(1, 2, 3);
        System.out.println(result);
        System.out.println(resultDouble);
        System.out.println(resultThreeInt);
    }

    public static void useIsEven(int number) {
        boolean isEvenResult = isEven(number);
        System.out.println("Is the number even? " + isEvenResult);
    }

    /* =====================================================
     * 3️⃣ КЛАСС И ОБЪЕКТ
     * =====================================================
     */

    // ЗАДАНИЕ 3.1
    // Создай класс Person (ниже):
    // - имя
    // - возраст
    // - метод printInfo()
    // Создай объект и вызови метод


    // ЗАДАНИЕ 3.2
    // Создай класс BankAccount:
    // - owner
    // - balance
    // - методы deposit(), withdraw()
    // Проверь изменение состояния объекта

    /* =====================================================
     * 4️⃣ НАСЛЕДОВАНИЕ
     * =====================================================
     */

    // ЗАДАНИЕ 4.1
    // Создай класс Animal:
    // - name
    // - метод makeSound()

    // ЗАДАНИЕ 4.2
    // Создай класс Dog, который наследуется от Animal
    // Переопредели метод makeSound()
    // Создай объект Dog и вызови метод

    // ЗАДАНИЕ 4.3
    // Создай массив типа Animal
    // Положи туда Animal и Dog
    // Вызови makeSound() в цикле
    public static void useArrayOfAnimals(String animalName, String dogName) {
        // TODO: создай массив типа Animal
        Animal[] animals = new Animal[2];
        animals[0] = new Animal(animalName) {
            @Override
            public void makeSoundAbstract() {

            }
        };
        animals[1] = new Dog(dogName) {
            @Override
            public void makeSoundAbstract() {

            }
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    /* =====================================================
     * 5️⃣ МЕТОДЫ
     * =====================================================
     */

    // ЗАДАНИЕ 5.1
    // Создай метод sum(int a, int b)
    // Верни сумму чисел
    // TODO: создай метод sum
    public static int sum(int a, int b) {
        System.out.println("Result of sum is: ");
        return a + b;
    }

    // ЗАДАНИЕ 5.2
    // Перегрузи метод sum:
    // - для double
    // - для трёх int
    // TODO: перегрузи метод sum для double
    public static double sum(double a, double b) {
        return a + b;
    }

    // TODO: перегрузи метод sum для трёх int
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // ЗАДАНИЕ 5.3
    // Создай метод printNumbers(int from, int to)
    // Выведи все числа в диапазоне
    // TODO: создай метод printNumbers
    public static void printNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    // ЗАДАНИЕ 5.4
    // Создай метод isEven(int number)
    // Верни true, если число чётное
    public static boolean isEven(int Number) {
        // TODO: создай метод isEven
        System.out.println("Number is: " + Number);
        return Number % 2 == 0;
    }

    /* =====================================================
     * 6️⃣ ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ (⭐)
     * =====================================================
     */

    // ЗАДАНИЕ 6.1 ⭐
    // Массив из 5 чисел
    // Найди среднее арифметическое
    public static void findAverageOfArray(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        //TODO: найди среднее арифметическое
        int[] numbers = {numOne, numTwo, numThree, numFour, numFive};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average of array numbers is: " + average);
    }

    // ЗАДАНИЕ 6.2 ⭐
    // Возьми любую строку как переменную
    // Определи, является ли она палиндромом

    // TODO


    // ЗАДАНИЕ 6.3 ⭐
    // Создай метод factorial(int n) - метод выводит в консоль факториал числа n
    // Реализуй через цикл

    // TODO


    // ЗАДАНИЕ 6.4 ⭐
    // Создай метод factorial(int n) - метод выводит в консоль факториал числа n
    // Реализуй через рекурсию

    // TODO

}

