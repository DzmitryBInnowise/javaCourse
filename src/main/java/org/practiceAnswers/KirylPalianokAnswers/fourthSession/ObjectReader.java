package org.practiceAnswers.KirylPalianokAnswers.fourthSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void readObject(String s) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s))) {

			Person person = (Person) ois.readObject();
			System.out.println(person);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
