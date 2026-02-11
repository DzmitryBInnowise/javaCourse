package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

public class Logger {


    private static volatile Logger instance;


    private Logger() {
        System.out.println("Логгер инициализирован.");
    }

    public static Logger getInstance() {

        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.print("===========================================\n");
        System.out.println("[LOG]: " + message);
        System.out.print("===========================================\n");

    }
}