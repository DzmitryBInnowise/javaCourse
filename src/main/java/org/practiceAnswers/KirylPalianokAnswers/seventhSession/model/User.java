package org.practiceAnswers.KirylPalianokAnswers.seventhSession.model;

import java.util.Optional;

public class User {

	private String name;
	private Optional<String> email;

	public User(String name, Optional<String> email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}


	public Optional<String> getEmail() {
		return email;
	}



	public void printEmail() {

		String result = getEmail()
				.map(String::toUpperCase)
				.orElse("Email not provided");

		System.out.println(result);
	}
}
