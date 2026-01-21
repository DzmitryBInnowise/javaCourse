package org.practiceAnswers;

import java.util.Arrays;
import java.util.Locale;

public class SecondSessionKravchenkoStas {

    public static void main(String[] args) {
        /* =====================================================
         * 1️⃣ МАССИВЫ
         * =====================================================
         */

        // ЗАДАНИЕ 1.1
        // Создай массив из 5 целых чисел
        // Заполни его любыми значениями
        // Выведи массив в консоль

        // TODO

        int[] mass1 = new int[5];


        for(int i = 0; i< mass1.length;i++){
            mass1[i] = (int)(Math.random() * 10);
        }

        System.out.println("Массив чисел = " + Arrays.toString(mass1));

        // ЗАДАНИЕ 1.2
        // Найди минимальный и максимальный элемент массива

        // TODO

        System.out.println("Максимальное значение = " + Arrays.stream(mass1).max().getAsInt());
        System.out.println("Минимальное значение = " + Arrays.stream(mass1).min().getAsInt());


        // ЗАДАНИЕ 1.3
        // Найди сумму всех элементов массива

        // TODO

        int arraySum = 0;

        for (int i : mass1) arraySum += i;

        System.out.println("Сумма чисел в массиве = " + arraySum);

        // ЗАДАНИЕ 1.4
        // Создай второй массив
        // Скопируй ссылку на первый массив
        // Измени любой элемент второго массива
        // Выведи оба массива и ОБЪЯСНИ результат

        // TODO

        int[] mass2 = new int[5];

        mass2 = mass1;
        mass2[4] = 11;

        System.out.println("Массив чисел = " + Arrays.toString(mass1));
        System.out.println("Массив чисел = " + Arrays.toString(mass2));
        System.out.println("Массив 1 и массив 2 имеют общую ссылку в итоге при изменении в одном - меняются и во втором");

        // ЗАДАНИЕ 1.5
        // Создай НОВЫЙ массив
        // Скопируй в него элементы первого массива (поэлементно)
        // Измени новый массив
        // Убедись, что первый не изменился

        // TODO

        int[] mass3 = {4,11,24,56,33};

        for (int i = 0; i < mass1.length;i++){
            mass3[i] = mass1[i];
        }

        mass3[3] = 99;

        System.out.println("Массив чисел 1 = " + Arrays.toString(mass1));
        System.out.println("Массив чисел 2 = " + Arrays.toString(mass3));

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

        String s1 = "Hello";
        String s2;

        s2 = s1;
        s2 = "World";

        System.out.println("Вывод строки s1 = " + s1);
        System.out.println("Вывод строки s2 = " + s2);
        System.out.println("s1 не поменялся вместе с s2 потому что это новый объект");

        // ЗАДАНИЕ 2.2
        // Сравни две строки с помощью == и equals()
        // Выведи результаты

        // TODO

        System.out.println("Сравнение строк через equals = "+s1.equals(s2));
        System.out.println("Сравнение строк через  '==' = "+(s1==s2));

        // ЗАДАНИЕ 2.3
        // Используя StringBuilder:
        // - собери строку из чисел от 1 до 10 через пробел

        // TODO

        StringBuilder stringWithNumbers = new StringBuilder();

        for(int i = 1; i <= 10; i++){
            stringWithNumbers.append(i);
            if(i<10){
                stringWithNumbers.append(" ");
            }
        }

        System.out.println(stringWithNumbers);
        // ЗАДАНИЕ 2.4
        // Используя StringBuilder:
        // - разверни строку "Java"

        // TODO

        StringBuilder reversedJava = new StringBuilder("Java");

        reversedJava.reverse();

        System.out.println("Reversed word java = " + reversedJava);

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

        Person person = new Person("Стас", 27);

        person.printInfo();

        // ЗАДАНИЕ 3.2
        // Создай класс BankAccount:
        // - owner
        // - balance
        // - методы deposit(), withdraw()
        // Проверь изменение состояния объекта

        // TODO

        BankAccount bankAccount = new BankAccount("Саша", 24.44);

        System.out.println("Изначальный владелец: " + bankAccount.getOwner());
        System.out.println("Изначальный баланс: " + bankAccount.getBalance());

        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.withdraw(1500.0); // Проверка на недостаток средств

        System.out.println("Окончательный владелец: " + bankAccount.getOwner());
        System.out.println("Окончательный баланс: " + bankAccount.getBalance());

        /* =====================================================
         * 4️⃣ НАСЛЕДОВАНИЕ
         * =====================================================
         */

        // ЗАДАНИЕ 4.1
        // Создай класс Animal:
        // - name
        // - метод makeSound()

        // TODO

        Animal cat = new Animal("Cat");

        cat.makeSound();

        // ЗАДАНИЕ 4.2
        // Создай класс Dog, который наследуется от Animal
        // Переопредели метод makeSound()
        // Создай объект Dog и вызови метод

        // TODO

        Dog dog = new Dog("Archi");

        dog.makeSound();

        // ЗАДАНИЕ 4.3
        // Создай массив типа Animal
        // Положи туда Animal и Dog
        // Вызови makeSound() в цикле

        // TODO

        Animal[] animals = new Animal[2];

        animals[0] = new Animal("Cat");
        animals[1] = new Dog("Archie");

        for(Animal animal: animals){
            animal.makeSound();
        }


        /* =====================================================
         * 5️⃣ МЕТОДЫ
         * =====================================================
         */

        // ЗАДАНИЕ 5.1
        // Создай метод sum(int a, int b)
        // Верни сумму чисел

        // TODO

        Calculator calc = new Calculator();

        System.out.println("Сумма двух чисел = " + calc.sum(4,5));

        // ЗАДАНИЕ 5.2
        // Перегрузи метод sum:
        // - для double
        // - для трёх int

        // TODO

        System.out.println("Сумма чисел типа double = " + calc.sum(2.4,3.3));
        System.out.println("Сумма трех чисел = " + calc.sum(5,3,1));

        // ЗАДАНИЕ 5.3
        // Создай метод printNumbers(int from, int to)
        // Выведи все числа в диапазоне

        // TODO

        calc.printNumbers(5,10);

        // ЗАДАНИЕ 5.4
        // Создай метод isEven(int number)
        // Верни true, если число чётное

        // TODO

        System.out.println("Число 5 четное? Ответ:"+(calc.isEven(5)));

        /* =====================================================
         * 6️⃣ ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ (⭐)
         * =====================================================
         */

        // ЗАДАНИЕ 6.1 ⭐
        // Массив из 5 чисел
        // Найди среднее арифметическое

        // TODO

        int[] massNumber = {2,4,6,8,10};

        int sumNumbers=0;

        for (int i = 0; i< massNumber.length;i++){
            sumNumbers += massNumber[i];
        }
        System.out.println("Среднее арифм. равно " + (sumNumbers/(double)massNumber.length));

        // ЗАДАНИЕ 6.2 ⭐
        // Возьми любую строку как переменную
        // Определи, является ли она палиндромом

        // TODO

        String text = "Madam";
        String originalString = text.toLowerCase();
        String reversedString = new StringBuilder(originalString.toLowerCase()).reverse().toString();

        System.out.println("Строка " + originalString + " палиндром? Ответ = " + originalString.equals(reversedString));

        // ЗАДАНИЕ 6.3 ⭐
        // Создай метод factorial(int n) - метод выводит в консоль факториал числа n
        // Реализуй через цикл

        // TODO

        calc.factorial(5);

        // ЗАДАНИЕ 6.4 ⭐
        // Создай метод factorial(int n) - метод выводит в консоль факториал числа n
        // Реализуй через рекурсию

        // TODO

        System.out.println("Факториал через рекурсию равен " + calc.factorialRecursive(5));

    }

}

/* =====================================================
 * МЕСТО ДЛЯ ТВОИХ КЛАССОВ
 * =====================================================
 */


 class Person {
     private String name;
     private int age;

     public Person(String name, int age){
         this.name = name;
         this.age = age;
     }

     public String getName(){
         return name;
     }

     public int getAge(){
         return age;
     }

    public void printInfo(){
         System.out.println("Имя:" + name);
        System.out.println("Возраст:" + age);
    }

 }

 class BankAccount {
     private String owner;
     private double balance;

     public BankAccount(String owner, double initialBalance){
         this.owner = owner;
         this.balance = initialBalance;
     }

     public void deposit(double amount) {
         if (amount > 0) {
             balance += amount;
             System.out.println("Пополнение счета " + owner + ": + " + amount + ". Новый баланс: " + balance);
         } else {
             System.out.println("Некорректная сумма для пополнения счета.");
         }
     }

     public void withdraw(double amount) {
         if (amount > 0 && balance >= amount) {
             balance -= amount;
             System.out.println("Снятие со счета " + owner + ": - " + amount + ". Новый баланс: " + balance);
         } else if (amount <= 0) {
             System.out.println("Некорректная сумма для снятия.");
         } else {
             System.out.println("Недостаточно средств на счете.");
         }
     }

     public String getOwner() {
         return owner;
     }

     public double getBalance() {
         return balance;
     }
 }

 class Animal {
     private String name;

     public Animal(String name){
         this.name = name;
     }

     public void makeSound(){
         System.out.println("Animal sound");
     }

     public String getName() {
         return name;
     }

 }

 class Dog extends Animal {

     public Dog(String name){
         super(name);
     }

     @Override
     public void makeSound() {
         System.out.println("Dog " + getName() + " barks");
     }

     @Override
     public String getName() {
         return super.getName();
     }
 }

class Calculator{
     int sum(int a, int b){
         return a+b;
     }
     double sum (double a, double b){
         return  a+b;
     }
     int sum (int a ,int b, int c){
         return a+b+c;
     }

     public void printNumbers(int from, int to){
         if(from > to){
             System.out.println("Начальное значение должно быть меньше или равно конечному");
             return;
         }
         for(int i = from; i <= to; i++){
             System.out.println(i);
         }
    }

    public boolean isEven(int number){
         return number % 2 ==0;
    }

    public void factorial(int n){
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен");
            return;
        }
        long factorial = 1;

        for(int i = 1; i<=n;i++){
            factorial *= i;

        }
        System.out.println("Факториал равен " + factorial);
    }

    public long factorialRecursive(int n){

         if(n == 0){
             return 1;
         } else if (n<0) {
             System.out.println("Факториал отрицательного числа не определен");
             return 0;
         } else {
             return n * factorialRecursive(n-1);
         }
    }

}
