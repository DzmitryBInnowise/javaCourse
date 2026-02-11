package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class SettingsSingleton {
    private static SettingsSingleton instance;

    private String language;

    private SettingsSingleton() {
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
}
