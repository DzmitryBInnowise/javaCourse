package org.practiceAnswers.StasKravchenkoAnswers.Classes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
         this.age = age;
    }

    public void printInfo() {
        System.out.println("Имя:" + name);
        System.out.println("Возраст:" + age);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return name.equals(other.name) && this.age == other.age;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int hashCode =prime * name.hashCode() + age;
        return hashCode;
    }
}
