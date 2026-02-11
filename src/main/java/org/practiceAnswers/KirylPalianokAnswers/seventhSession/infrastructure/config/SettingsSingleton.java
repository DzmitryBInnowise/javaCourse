package org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.config;

public class SettingsSingleton {

	private static volatile SettingsSingleton instance;

	private String language;

	private SettingsSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance()");
		}
	}

	public static SettingsSingleton getInstance() {
		if (instance == null) {
			synchronized (SettingsSingleton.class) {
				if (instance == null) {
					instance = new SettingsSingleton();
				}
			}
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
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning not allowed");
	}
}
