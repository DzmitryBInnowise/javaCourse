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



}
