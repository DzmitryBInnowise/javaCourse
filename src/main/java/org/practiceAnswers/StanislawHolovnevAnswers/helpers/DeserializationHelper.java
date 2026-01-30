package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

import org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationHelper {
    public static Person deserialize(String folderPath) throws IOException, ClassNotFoundException {
        String filename = folderPath;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
            throw e;
        }
    }
}
