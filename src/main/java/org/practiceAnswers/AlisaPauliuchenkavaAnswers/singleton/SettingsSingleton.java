package org.practiceAnswers.AlisaPauliuchenkavaAnswers.singleton;

public class SettingsSingleton {

    private static SettingsSingleton instance;

    private String language = "английский";

    private SettingsSingleton() {
        if (instance != null) {
            throw new RuntimeException("нужен метод getInstance(), создание через конструктор запрещено");
        }
    }

    public static SettingsSingleton getInstance() {
        if (instance == null) {
            instance = new SettingsSingleton();
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("клонирование запрещено");
    }
}
