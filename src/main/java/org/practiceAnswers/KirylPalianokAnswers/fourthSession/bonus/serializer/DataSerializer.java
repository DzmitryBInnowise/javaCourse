package org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.serializer;

import org.practiceAnswers.KirylPalianokAnswers.fourthSession.bonus.model.NumberData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataSerializer {

	public void serialize(NumberData data, String path) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
			oos.writeObject(data);
		}
	}

	public NumberData deserialize(String path) throws IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			return (NumberData) ois.readObject();
		}
	}
}
