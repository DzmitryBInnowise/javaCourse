package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

import java.io.*;

public class SerializationHelper {
    public static boolean serialize(Object obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            return true;
        } catch (IOException e) {
            System.err.println("Ошибка записи объекта: " + e.getMessage());
            return false;
        }
    }

    public static Object deserialize(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка чтения объекта: " + e.getMessage());
            return null;
        }
    }
}