package org.practiceAnswers.AnnaVerkhovaAnswers.Tasks;

import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals.Animal;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Animals.Dog;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Different.BankAccount;
import org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People.Person;

import java.util.Arrays;

public class SecondSessionAnnaVerkhova {
    public static void main(String[] args) {
        arrays();
        findMinArrays();
        findMaxArrays();
        findSumArrays();
        createTwoArrays();
        createNewArrays();
        createString();
        equalsString();
        createStringBuilder();
        reverseStringBuilder();
        createPerson("Иван", 27);
        useAccount("Иванов", 57000);
        createDog("Rottweiler", "Woof");
        createArraysAnimals("Animal", "Rottweiler", "Woof");
        sum(5, 8);
        sum(2.5, 5.0);
        sum(5, 10, 30);
        printNumbers(0, 4);
        isEven(10);
        averageArrays(1, 2, 3, 4, 5);
        isPalindrome("А роза упала на лапу азора");
    }

    // ЗАДАНИЕ 1.1
    // Создай массив из 5 целых чисел
    // Заполни его любыми значениями
    // Выведи массив в консоль

    public static void arrays() {
        int[] arrays = {3, 54, 88, 70, 101};
        {
            System.out.println(Arrays.toString(arrays));
        }
    }

    // ЗАДАНИЕ 1.2
    // Найди минимальный и максимальный элемент массива
    public static void findMinArrays() {
        int[] arrays = {3, 54, 88, 70, 101};
        int arraysMin = Arrays.stream(arrays).min().getAsInt();

        {
            System.out.println("Min value in arrays - " + arraysMin);
        }
    }

    public static void findMaxArrays() {
        int[] arrays = {3, 54, 88, 70, 101};
        int arraysMax = Arrays.stream(arrays).max().getAsInt();
        {
            System.out.println("Max value in arrays - " + arraysMax);
        }
    }


    // ЗАДАНИЕ 1.3
    // Найди сумму всех элементов массива
    public static void findSumArrays() {
        int[] arrays = {3, 54, 88, 70, 101};
        int sumArrays = Arrays.stream(arrays).sum();
        {
            System.out.println("Сумма всех элементов массива = " + sumArrays);
        }
    }

    // Создай второй массив
    // Скопируй ссылку на первый массив
    // Измени любой элемент второго массива
    // Выведи оба массива и ОБЪЯСНИ результат

    public static void createTwoArrays() {
        int[] arrays = {3, 54, 88, 70, 101};
        int[] arrays2 = arrays;
        {
            System.out.println(Arrays.toString(arrays2)); // здесь мы получаем ссылку на первый массив
        }
        arrays2[2] = 215;

        {
            System.out.println(Arrays.toString(arrays2));  // здесь мы видим новый массив тк мы обновили в нем значение по индексу [2]
        }

    }

    // ЗАДАНИЕ 1.5
    // Создай НОВЫЙ массив
    // Скопируй в него элементы первого массива (поэлементно)
    // Измени новый массив
    // Убедись, что первый не изменился
    public static void createNewArrays() {
        int[] arraysOriginal = {2, 66, 14, 23, 97};
        int[] arraysCopy = new int[arraysOriginal.length];
        for (int i = 0; i < arraysOriginal.length; i++) {
            arraysCopy[i] = arraysOriginal[i];
        }
        arraysCopy[1] = 31;
        arraysCopy[3] = 11;
        {
            System.out.println("Arrays Original  - " + Arrays.toString(arraysOriginal));
            System.out.println("New arrays  - " + Arrays.toString(arraysCopy));
        }
    }

    // ЗАДАНИЕ 2.1
    // Создай строку
    // Присвой её другой переменной
    // "Измени" вторую строку
    // Выведи обе строки
    // Объясни, почему первая не изменилась
    public static void createString() {
        String s1 = "Java ";
        String s2 = s1;
        s2 = s1 + "is interesting";
        {
            System.out.println(s1); // первая строка не изменилась,тк мы присвоили ей значение и не меняли его.
            System.out.println(s2); // ,вторую строку мы изменили, добавив к ней еще значения
        }
    }

    // ЗАДАНИЕ 2.2
    // Сравни две строки с помощью == и equals()
    // Выведи результаты

    public static void equalsString() {
        String str1 = "Java";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Statement  is true");
        } else {
            System.out.println("Statement  is false"); //строки разные, строки находятся в пуле и ссылаютс на разные объекты
        }
        if (str1.equals(str2)) {
            System.out.println("Statement  is true");
        } else {
            System.out.println("Statement  is false");
        }
    }

    // ЗАДАНИЕ 2.3
    // Используя StringBuilder:
    // - собери строку из чисел от 1 до 10 через пробел

    public static void createStringBuilder() {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            s.append(i);
            if (i < 10) {
                s.append(" ");
            }
        }
        String result = s.toString();
        System.out.println(result);
    }

    // ЗАДАНИЕ 2.4
    // Используя StringBuilder:
    // - разверни строку "Java"

    public static void reverseStringBuilder() {
        StringBuilder word = new StringBuilder("Java");

        {
            System.out.println(word.reverse().toString());
        }
    }

    //ЗАДАНИЕ 3.1
    // Создай класс Person (ниже):
    // - имя
    // - возраст
    // - метод printInfo()
    // Создай объект и вызови метод

    public static void createPerson(String name, int age) {
        Person person = new Person(name, age);
        person.printInfo();
    }


    // ЗАДАНИЕ 3.2
    // Создай класс BankAccount:
    // - owner
    // - balance
    // - методы deposit(), withdraw()
    // Проверь изменение состояния объекта

    public static void useAccount(String owner, int balance) {
        BankAccount bankAccount = new BankAccount(owner, balance);
        bankAccount.deposit(2500);
        bankAccount.withdraw(13500);
        bankAccount.getBalance();
    }

    //ЗАДАНИЕ 4.1
    // Создай класс Animal:
    // - name
    // - метод makeSound()

    // ЗАДАНИЕ 4.2
    // Создай класс Dog, который наследуется от Animal
    // Переопредели метод makeSound()
    // Создай объект Dog и вызови метод
    public static void createDog(String name, String voice) {
        Dog dog = new Dog(name, voice) {
            @Override
            public void makeSoundAbstract() {

            }
        };
        dog.makeSound();
    }

    // ЗАДАНИЕ 4.3
    // Создай массив типа Animal
    // Положи туда Animal и Dog
    // Вызови makeSound() в цикле

    public static void createArraysAnimals(String nameAnimals, String nameDog, String voice) {
        Animal[] animals = new Animal[2];
        animals[0] = new Animal(nameAnimals) {
            @Override
            public void makeSoundAbstract() {

            }
        };
        animals[1] = new Dog(nameDog, voice) {
            @Override
            public void makeSoundAbstract() {

            }
        };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    // ЗАДАНИЕ 5.1
    // Создай метод sum(int a, int b)
    // Верни сумму чисел

    public static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Result of sum is: = " + result);
        return result;
    }

    // ЗАДАНИЕ 5.2
    // Перегрузи метод sum:
    // - для double
    // - для трёх int

    public static double sum(double a, double b) {
        double result = a + b;
        System.out.println("Result of sum is = " + result);
        return result;
    }

    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("Result of sum is: = " + result);
        return result;
    }

    // ЗАДАНИЕ 5.3
    // Создай метод printNumbers(int from, int to)
    // Выведи все числа в диапазоне
    public static void printNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    // ЗАДАНИЕ 5.4
    // Создай метод isEven(int number)
    // Верни true, если число чётное

    public static boolean isEven(int number) {
        System.out.println("Number is " + number);
        return number % 2 == 0;
    }

    /* =====================================================
     * 6️⃣ ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ (⭐)
     * =====================================================
     */

    // ЗАДАНИЕ 6.1 ⭐
    // Массив из 5 чисел
    // Найди среднее арифметическое
    public static void averageArrays(int n1, int n2, int n3, int n4, int n5) {
        int[] value = {n1, n2, n3, n4, n5};
        int summ = 0;
        for (int i : value) {
            summ += i;
        }
        System.out.println("Average " + (double) summ / value.length);
    }

    // ЗАДАНИЕ 6.2 ⭐
    // Возьми любую строку как переменную
    // Определи, является ли она палиндромом
    public static void isPalindrome(String str) {
        String str1 = str.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        String reverseStr1 = new StringBuilder(str1).reverse().toString();
        if (str1.equals(reverseStr1)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("This string is not palindrom");
        }
    }
}