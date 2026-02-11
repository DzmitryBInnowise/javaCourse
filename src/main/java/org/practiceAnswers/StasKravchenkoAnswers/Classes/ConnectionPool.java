package org.practiceAnswers.StasKravchenkoAnswers.Classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private final BlockingQueue<Connection> availableConnections;
    private final int totalCreated;

    public ConnectionPool(int poolSize) {
        this.availableConnections = new LinkedBlockingQueue<>(poolSize);

        for (int i = 1; i <= poolSize; i++) {
            availableConnections.add(new Connection(i));
        }

        this.totalCreated = poolSize;
    }

    public Connection getConnection() {
        Connection connection = availableConnections.poll();

        if (connection == null) {
            System.out.println("No available connections");
        }

        return connection;
    }

    public void releaseConnection(Connection connection) {
        if (connection == null) {
            return;
        }

        availableConnections.offer(connection);
    }

    public int getTotalCreated() {
        return totalCreated;
    }

    public int getFreeCount() {
        return availableConnections.size();
    }
}

