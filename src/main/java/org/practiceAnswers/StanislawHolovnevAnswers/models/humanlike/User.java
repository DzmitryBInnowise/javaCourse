package org.practiceAnswers.StanislawHolovnevAnswers.models.humanlike;

import java.util.Optional;

public class User {

    private String name;
    private final Optional<String> email;

    public User(String name, Optional<String> email) {
        this.name = name;
        this.email = email;
    }

    public void printEmail() {
        email.ifPresentOrElse(System.out::println, () -> System.out.println("Email not provided"));
        email.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
