package org.practiceAnswers.StanislawHolovnevAnswers.setup;

public class SettingsSingleton {

    private static SettingsSingleton instance;

    private static String language;

    private SettingsSingleton() {}

    public static SettingsSingleton getInstance() {
        if (instance == null) instance = new SettingsSingleton();
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        SettingsSingleton.language = language;
    }
}
