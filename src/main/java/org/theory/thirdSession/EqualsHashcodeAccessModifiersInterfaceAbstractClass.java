package org.theory.thirdSession;

public class EqualsHashcodeAccessModifiersInterfaceAbstractClass {

    // =====================================================
    // 8. КОНТРАКТ equals() И hashCode()
    // =====================================================

    /*
     * В Java каждый класс наследуется от Object, который содержит методы:
     * - equals()
     * - hashCode()
     * - toString()
     *
     * Метод equals() сравнивает объекты "по смыслу", а не по ссылке.
     * По умолчанию equals() работает как ==, если не переопределён.
     */

    public static void equalsHashCodeExample() {
        // Пример без переопределения equals()
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        // a == b → false (разные объекты)
        // a.equals(b) → true (значения равны)

        // Контракт equals():
        // 1) Рефлексивность: x.equals(x) == true
        // 2) Симметричность: x.equals(y) == y.equals(x)
        // 3) Транзитивность: если x.equals(y) && y.equals(z) → x.equals(z)
        // 4) Консистентность: повторные вызовы возвращают одинаковый результат
        // 5) x.equals(null) == false

        // Контракт hashCode():
        // Если equals() == true → hashCode() должен быть одинаковым.
        // Обратное неверно: одинаковый hashCode не гарантирует equals == true.

        // Пример правильной реализации:
        /*
        class Person {
            String name;
            int age;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return age == person.age && name.equals(person.name);
            }

            @Override
            public int hashCode() {
                return java.util.Objects.hash(name, age);
            }
        }
        */
    }

    // =====================================================
    // 9. МОДИФИКАТОРЫ ДОСТУПА И ОБЛАСТИ ВИДИМОСТИ
    // =====================================================

    /*
     * В Java есть 4 уровня доступа:
     * private   — только внутри класса
     * default   — внутри пакета (package-private)
     * protected — внутри пакета + наследники
     * public    — везде
     *
     * Области видимости переменных:
     * - Поля класса (fields)
     * - Локальные переменные (методы, блоки)
     * - Параметры методов
     *
     * private: защищает инкапсуляцию
     * default: доступ в пределах пакета
     * protected: доступ в пакете + наследники
     * public: доступ везде
     */

    // Пример:
    /*
    class Example {
        private int privateVar;     // доступ только внутри класса
        int defaultVar;             // доступ в пакете
        protected int protectedVar; // доступ в пакете + наследники
        public int publicVar;       // доступ везде
    }
    */

    // =====================================================
    // 10. STATIC И FINAL
    // =====================================================

    /*
     * static:
     * - принадлежит классу, а не объекту
     * - статические методы вызываются без создания объекта
     * - не могут использовать this и нестатические поля напрямую
     *
     * final:
     * - final переменная → нельзя изменить ссылку или значение
     * - final метод → нельзя переопределить
     * - final класс → нельзя наследовать
     *
     * Пример:
     */
    static class Counter {
        static int count = 0;

        Counter() {
            count++;
        }
    }

    static void staticMethodExample() {
        // static метод можно вызвать без объекта
        // Counter.count;
    }

    // final переменная:
    /*
    final int x = 10;
    x = 20; // ошибка компиляции
    */

    // final класс:
    /*
    final class Constants {}
    // class ExtendedConstants extends Constants {} // ошибка
    */

    // =====================================================
    // 11. АБСТРАКТНЫЙ КЛАСС VS ИНТЕРФЕЙС
    // =====================================================

    /*
     * Абстрактный класс:
     * - может содержать поля и методы с реализацией
     * - может иметь конструктор
     * - поддерживает одиночное наследование
     *
     * Пример:
     */
    abstract static class Animal {
        String name;

        abstract void makeSound(); // абстрактный метод без реализации

        void sleep() {             // метод с реализацией
            System.out.println("Sleeping");
        }
    }

    /*
     * Интерфейс:
     * - описывает контракт (что умеет делать объект)
     * - методы по умолчанию public abstract
     * - поля public static final
     * - можно реализовать несколько интерфейсов
     *
     * Пример:
     */
    interface Flyable {
        void fly();
    }

    /*
     * Default методы в интерфейсе:
     */
    interface Printer {
        default void print() {
            System.out.println("Print");
        }
    }

    /*
     * Отличия:
     * Абстрактный класс → состояние, общая логика, один родитель
     * Интерфейс → контракт, множественная реализация, без состояния
     *
     * Используем:
     * - Абстрактный класс: общая логика, поля, тесная связь
     * - Интерфейс: контракт, множественная реализация, API
     */

}
