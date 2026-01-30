package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExсeptionTask {

	public static int divide(int a, int b) {

		try {
			return a/b;
		} catch (ArithmeticException e) {
			throw new IllegalArgumentException("Нельзя делить на ноль", e);
		} finally {
			System.out.println("Операция завершена.");
		}

	}

	public static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Возраст должен быть не меньше 18");
		}
	}

	public static String readFile(String path) throws IOException {
		return Files.readString(Path.of(path));
	}

	public static String readFirstStringFromFile(String path) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			return bufferedReader.readLine();
		} catch (IOException e) {
			System.out.println("Ошибка при чтении файла: " + e.getMessage());
			return null;
		}
	}
}
