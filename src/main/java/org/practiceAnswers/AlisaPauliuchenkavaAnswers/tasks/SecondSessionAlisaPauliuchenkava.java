package org.practiceAnswers.AlisaPauliuchenkavaAnswers.tasks;

import org.practiceAnswers.AlisaPauliuchenkavaAnswers.animal.Dog;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.bankAccount.BankAccount;
import org.practiceAnswers.AlisaPauliuchenkavaAnswers.person.Person;


public class SecondSessionAlisaPauliuchenkava {

    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        createArray();
        findMinMax();
        findSum();
        copyArray();
        useNewArray();
        changeString();
        useEquals();
        useStringBuilder();
        useStringBuilderJava();
        createPerson("Alisa", 21);
        useBankAccount("John", 38, 2, 10);
        useAnimalSound("Tim");
        //useAnimalArray();
        sum(6, 7);
        sum(34.4, 295.1);
        sum(5,66,17);
        checkIsEven(5);
    }

    /* =====================================================
     * 1️⃣ МАССИВЫ
     * =====================================================
     */

    // ЗАДАНИЕ 1.1
    // Создай массив из 5 целых чисел
    // Заполни его любыми значениями
    // Выведи массив в консоль

    // TODO
    public static void createArray() {
        int[] numbers = {15, 42, 7, 99, 23};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    // ЗАДАНИЕ 1.2
    // Найди минимальный и максимальный элемент массива

    // TODO
    public static void findMinMax() {
        int[] numbers = {9, 2, 14, 76, 0};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nминимальный элемент: " + min);
        System.out.println("максимальный элемент: " + max);
    }
    // ЗАДАНИЕ 1.3
    // Найди сумму всех элементов массива

    // TODO
    public static void findSum() {
        int[] numbers = {9, 2, 14, 76, 0};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("\nсумма: " + sum);
    }
    // ЗАДАНИЕ 1.4
    // Создай второй массив
    // Скопируй ссылку на первый массив
    // Измени любой элемент второго массива
    // Выведи оба массива и ОБЪЯСНИ результат

    // TODO
    public static void copyArray() {
        int[] firstArray = {9, 2, 14, 76, 0};

        System.out.print("\nfirstArray: ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }

        int[] secondArray = firstArray;

        System.out.print("\nsecondArray: ");
        for (int num : secondArray) {
            System.out.print(num + " ");
        }

        secondArray[1] = 88;

        System.out.print("\nfirstArray:  ");
        for (int num : firstArray) {
            System.out.print(num + " ");
        }

        System.out.print("\nsecondArray: ");
        for (int num : secondArray) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
    // ЗАДАНИЕ 1.5
    // Создай НОВЫЙ массив
    // Скопируй в него элементы первого массива (поэлементно)
    // Измени новый массив
    // Убедись, что первый не изменился

    // TODO
    public static void useNewArray() {
        System.out.println();
        int[] array = {43, 11, 8, 0, 3};
        int [] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[1] = 27373;

        System.out.print("\narray:  ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nnewArray: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

        if (array[1] == 11 && newArray[1] == 27373) {
            System.out.println("\nпервый массив не изменился");
        }

        System.out.println();
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

    // TODO
    public static void changeString() {
        String s1 = "Hello";
        String s2 = s1;

        s2 = "Ciao!";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println();

        //String неизменяемый
    }


    // ЗАДАНИЕ 2.2
    // Сравни две строки с помощью == и equals()
    // Выведи результаты

    // TODO
    public static void useEquals() {
        String st1 = "jj";
        String st2 = "jbb";
        boolean isEquals = st1 == st2;
        boolean isEqualContent = st1.equals(st2);
        System.out.println("equals ==: " + isEquals);
        System.out.println("equals equals(): " + isEqualContent);

        System.out.println();
    }


    // ЗАДАНИЕ 2.3
    // Используя StringBuilder:
    // - собери строку из чисел от 1 до 10 через пробел

    // TODO
    public static void useStringBuilder() {
        for (int i = 1; i <= 10; i++) {
            sb.append(i);
            if (i < 10) {
                sb.append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
        System.out.println();
    }


    // ЗАДАНИЕ 2.4
    // Используя StringBuilder:
    // - разверни строку "Java"

    // TODO
    public static void useStringBuilderJava() {
        String st = "Java";
        StringBuilder sb = new StringBuilder(st);
        sb.reverse();
        String stReversed = sb.toString();
        System.out.println(stReversed);
        System.out.println();
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

    // TODO
    public static void createPerson(String name, int age) {
        Person person = new Person(name, age);
        person.printInfo();
        System.out.println();
    }


    // ЗАДАНИЕ 3.2
    // Создай класс BankAccount:
    // - owner
    // - balance
    // - методы deposit(), withdraw()
    // Проверь изменение состояния объекта

    // TODO
    public static void useBankAccount(String owner, double balance, double depositAmount, double withdrawAmount) {
        BankAccount newBankAccount = new BankAccount(owner, balance);
        newBankAccount.deposit(depositAmount);
        newBankAccount.withdraw(withdrawAmount);
        System.out.println();
    }

    /* =====================================================
     * 4️⃣ НАСЛЕДОВАНИЕ
     * =====================================================
     */

    // ЗАДАНИЕ 4.1
    // Создай класс Animal:
    // - name
    // - метод makeSound()

    // TODO



    // ЗАДАНИЕ 4.2
    // Создай класс Dog, который наследуется от Animal
    // Переопредели метод makeSound()
    // Создай объект Dog и вызови метод

    // TODO
    public static void useAnimalSound(String name) {
        Dog dog = new Dog(name);
        dog.makeSound();
    }


    // ЗАДАНИЕ 4.3
    // Создай массив типа Animal
    // Положи туда Animal и Dog
    // Вызови makeSound() в цикле

    // TODO
    //public static void useAnimalArray(String animalName, String name) {}


    /* =====================================================
     * 5️⃣ МЕТОДЫ
     * =====================================================
     */

    // ЗАДАНИЕ 5.1
    // Создай метод sum(int a, int b)
    // Верни сумму чисел

    // TODO
    public static int sum(int a, int b) {
        System.out.println();
        return a + b;
    }


    // ЗАДАНИЕ 5.2
    // Перегрузи метод sum:
    // - для double
    // - для трёх int

    // TODO
    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }


    // ЗАДАНИЕ 5.3
    // Создай метод printNumbers(int from, int to)
    // Выведи все числа в диапазоне

    // TODO
    public static void printNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }


    // ЗАДАНИЕ 5.4
    // Создай метод isEven(int number)
    // Верни true, если число чётное

    // TODO
    public static boolean isEven(int Number) {
        System.out.println("your number is: " + Number);
        return Number % 2 == 0;
    }

    public static void checkIsEven(int number) {
        boolean isEvenReal = isEven(number);
        System.out.println("число четное? " + isEvenReal);
    }
}
