package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class SafeSingleton {
    private SafeSingleton() {
        if (Holder.INSTANCE != null) {
            throw new RuntimeException("Используй getInstance(), создание через Reflection запрещено!");
        }
    }

    private static class Holder {
        private static final SafeSingleton INSTANCE = new SafeSingleton();
    }

    public static SafeSingleton getInstance() {
        return Holder.INSTANCE;
    }

    // 2. Запрет клонирования
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Клонирование запрещено");
    }

    // Пример метода
    public void showMessage() {
        System.out.println("Я уникальный Singleton!");
    }
}
