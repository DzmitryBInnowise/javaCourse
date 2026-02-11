package org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.logging;

public class Logger {

	private static volatile Logger instance;

	private Logger() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance()");
		}
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
		System.out.println("[LOG] " + message);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Cloning not allowed");
	}
}
