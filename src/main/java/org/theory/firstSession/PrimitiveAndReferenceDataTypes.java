package org.theory.firstSession;

public class PrimitiveAndReferenceDataTypes {
    public static void main(String[] args) {

        /*
         * ==========================================
         * ПРИМИТИВНЫЕ vs ССЫЛОЧНЫЕ ТИПЫ В JAVA
         * ==========================================
         */

        /*
         * ------------------------------------------
         * 1. ПРИМИТИВНЫЕ ТИПЫ
         * ------------------------------------------
         * byte, short, int, long
         * float, double
         * char, boolean
         */

        int a = 10;
        int b = a;   // копируется ЗНАЧЕНИЕ

        b = 20;

        System.out.println("Примитивы:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20

        /*
         * Вывод:
         * изменение b НЕ влияет на a
         */

        /*
         * ------------------------------------------
         * 2. ССЫЛОЧНЫЕ ТИПЫ
         * ------------------------------------------
         * String, массивы, классы, объекты
         */

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // копируется ССЫЛКА

        arr2[0] = 99;

        System.out.println("\nСсылочные типы (массивы):");
        System.out.println("arr1[0] = " + arr1[0]); // 99
        System.out.println("arr2[0] = " + arr2[0]); // 99

        /*
         * Вывод:
         * arr1 и arr2 указывают на ОДИН объект в памяти
         */

        /*
         * ------------------------------------------
         * 3. ССЫЛОЧНЫЙ ТИП String
         * ------------------------------------------
         */

        String s1 = "Java";
        String s2 = s1;

        s2 = "Python";

        System.out.println("\nString:");
        System.out.println("s1 = " + s1); // Java
        System.out.println("s2 = " + s2); // Python

        /*
         * Важно:
         * String — ссылочный тип, но НЕИЗМЕНЯЕМЫЙ (immutable)
         * При изменении создаётся НОВЫЙ объект
         */

        /*
         * ------------------------------------------
         * 4. ПЕРЕДАЧА В МЕТОДЫ
         * ------------------------------------------
         */

        int primitiveValue = 5;
        changePrimitive(primitiveValue);

        System.out.println("\nПосле метода (примитив): " + primitiveValue);

        int[] referenceValue = {5};
        changeReference(referenceValue);

        System.out.println("После метода (ссылка): " + referenceValue[0]);

        /*
         * ------------------------------------------
         * 5. null ДЛЯ ССЫЛОЧНЫХ ТИПОВ
         * ------------------------------------------
         */

        String text = null; // допустимо
        // int number = null; // ошибка компиляции

        System.out.println("\nnull для ссылочного типа: " + text);

        /*
         * ------------------------------------------
         * ИТОГ
         * ------------------------------------------
         *
         * Примитивы:
         *  - хранят значение
         *  - копируется значение
         *  - не могут быть null
         *
         * Ссылочные:
         *  - хранят ссылку на объект
         *  - копируется ссылка
         *  - могут быть null
         */
    }

    // Метод для примитива
    static void changePrimitive(int x) {
        x = 100;
    }

    // Метод для ссылочного типа
    static void changeReference(int[] arr) {
        arr[0] = 100;
    }
}
