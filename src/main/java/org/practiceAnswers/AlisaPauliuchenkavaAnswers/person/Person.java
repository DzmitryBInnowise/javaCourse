package org.practiceAnswers.AlisaPauliuchenkavaAnswers.person;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private transient String password;



    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.password = null;
    }

    public void printInfo() {
        System.out.println("\nname: " + name + ", age: " + age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}
