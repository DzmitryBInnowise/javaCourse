package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Patterns;

public class SettingsSingleton {

    private static SettingsSingleton instance;
    private String language;

    public SettingsSingleton() {
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
