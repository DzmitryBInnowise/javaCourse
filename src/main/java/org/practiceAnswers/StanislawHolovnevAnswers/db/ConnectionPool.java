package org.practiceAnswers.StanislawHolovnevAnswers.db;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectionPool {

    private final Queue<Connection> availableConnections = new LinkedList<>();
    private final int maxSize;
    private int createdCount = 0;

    public ConnectionPool(int size) {

        this.maxSize = size;

        for (int i = 0; i < size; i++) {
            availableConnections.add(new Connection(++createdCount));
        }
    }

    public synchronized Connection getConnection() {
        if (availableConnections.isEmpty()) {

            System.out.println(">>> No available connections");
            return null;
        }
        Connection c = availableConnections.poll();
        System.out.println("Выдано: " + c);
        return c;
    }

    public synchronized void releaseConnection(Connection c) {
        if (c != null) {
            availableConnections.offer(c);
            System.out.println("Возвращено: " + c);
        }
    }

    public synchronized void printStatus() {
        System.out.println("\n--- Статус Пула ---");
        System.out.println("Создано всего: " + createdCount);
        System.out.println("Свободно сейчас: " + availableConnections.size());
        System.out.println("Занято сейчас: " + (createdCount - availableConnections.size()));
        System.out.println("-------------------\n");
    }
}
