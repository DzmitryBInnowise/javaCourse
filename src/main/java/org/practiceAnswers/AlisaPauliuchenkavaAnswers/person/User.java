package org.practiceAnswers.AlisaPauliuchenkavaAnswers.person;

import lombok.Getter;

import java.util.Optional;

@Getter
public class User {

    private String name;
    private Optional<String> email;

    public User(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    public static void printEmail(User user) {
        String result = user.email
                .map(String::toUpperCase)
                .orElse("Email not provided");
        System.out.println("User: " + user.getName() + " Email: " + result);
    }
}
