package org.practiceAnswers.KirylPalianokAnswers.seventhSession.infrastructure.connection;

import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPool {
	private final BlockingQueue<Connection> pool;
	private final int maxSize;
	private int createdCount = 0;

	public ConnectionPool(int maxSize) {
		this.maxSize = maxSize;
		this.pool = new ArrayBlockingQueue<>(maxSize);

		for (int i = 0; i < maxSize; i++) {
			pool.add(createConnection());
		}
	}

	private Connection createConnection() {
		createdCount++;
		return new Connection(createdCount);
	}

	public Optional<Connection> getConnection() {
		Connection connection = pool.poll();

		if (connection != null) {
			System.out.println("Issued: " + connection);
		} else {
			System.out.println("No available connections");
		}

		return Optional.ofNullable(connection);
	}

	public void releaseConnection(Connection connection) {
		pool.offer(connection);
		System.out.println("Returned: " + connection);
	}

	public void printStatus() {
		System.out.println("\n--- Pool Status ---");
		System.out.println("Total created: " + createdCount);
		System.out.println("Available: " + pool.size());
		System.out.println("In use: " + (maxSize - pool.size()));
		System.out.println("-------------------\n");
	}
}
