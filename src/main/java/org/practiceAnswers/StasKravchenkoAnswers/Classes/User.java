package org.practiceAnswers.StasKravchenkoAnswers.Classes;

import java.util.Optional;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void getOptionalEmail() {
        Optional<String> opt = getEmail();
        opt.ifPresentOrElse(value ->
                        System.out.println("Email = " + value.toUpperCase())
                , () ->
                        System.out.println("Email not provided")
        );
    }
    
}
