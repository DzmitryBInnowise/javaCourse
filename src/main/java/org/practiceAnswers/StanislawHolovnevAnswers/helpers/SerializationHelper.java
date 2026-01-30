package org.practiceAnswers.StanislawHolovnevAnswers.helpers;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationHelper {
    public static void serializeObject(Object obj, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(obj);
            System.out.println("Объект успешно сохранен в: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка сериализации: " + e.getMessage());
        }
    }
}
