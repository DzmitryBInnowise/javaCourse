package org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.connection;

public class Connection {
	private final int id;

	public Connection(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Connection #" + id;
	}
}
