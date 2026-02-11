package org.practiceAnswers.AnnaVerkhovaAnswers.Classes.Patterns;


import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

    private Queue<Connection> availableObjects = new LinkedList<>();
    private int totalCreated = 0;
    private int maxSize;

    public ConnectionPool(int size) {
        this.maxSize = size;
        for (int i = 0; i < size; i++) {
            availableObjects.add(new Connection());
            totalCreated++;
        }
    }

    public synchronized Connection getConnection() {
        if (availableObjects.isEmpty()) {
            System.out.println("No available connections");

            return null;
        }
        return availableObjects.poll();
    }

    public synchronized void releaseConnection(Connection c) {
        if (c != null) {
            availableObjects.offer(c);
        }
    }

    public int getTotalCreated() {
        return totalCreated;
    }

    public synchronized int getAvailableCount() {
        return availableObjects.size();
    }
}
