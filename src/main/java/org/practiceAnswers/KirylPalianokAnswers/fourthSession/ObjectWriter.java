package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void writeObject(Person person) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/person.dat"))) {

			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
