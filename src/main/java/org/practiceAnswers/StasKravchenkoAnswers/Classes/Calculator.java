package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void printNumbers(int from, int to) {
        if (from > to) {
            System.out.println("Начальное значение должно быть меньше или равно конечному");
            return;
        }
        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public void factorial(int n) {
        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен");
            return;
        }
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }
        System.out.println("Факториал равен " + factorial);
    }

    public long factorialRecursive(int n) {

        if (n == 0) {
            return 1;
        } else if (n < 0) {
            System.out.println("Факториал отрицательного числа не определен");
            return 0;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

}
