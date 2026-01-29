package org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike;

// class Person { }
// TODO: создать класс Person

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;

@Getter
@Setter
@ToString
public class Person implements Serializable {

    private String name;
    private int age;
    private transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void serialize(Person person, String folderPath) {
        String filename = folderPath + "/person.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Готово! Объект Person сохранен в " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static Person deserialize(String folderPath) throws IOException, ClassNotFoundException {
        String filename = folderPath + "/person.dat";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
            throw e;
        }
    }
}
