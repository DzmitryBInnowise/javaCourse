package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.People;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> email;

    public User() {
    }

    public User(String name, Optional<String> email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }
}
