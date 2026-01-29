package org.practiceAnswers.StasKravchenkoAnswers.Classes;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private transient String password;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пароль: " + password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return name.equals(other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hashCode = prime * name.hashCode() + age;
        return hashCode;
    }
}
