package org.practiceAnswers.AlisaPauliuchenkavaAnswers.singleton;

public class Logger {

    private static volatile Logger instance;

    private Logger() {
        if (instance != null) {
            throw new RuntimeException("нужен метод getInstance(), создание через конструктор запрещено");
        }
    }

    public static Logger getInstance() {
        if (instance == null) { // Первая проверка (без блокировки)
            synchronized (Logger.class) {
                if (instance == null) { // Вторая проверка (с блокировкой)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println();
        System.out.println("log : " + message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("клонирование запрещено");
    }
}
