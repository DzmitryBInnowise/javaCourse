package org.practiceAnswers.AlisaPauliuchenkavaAnswers.poolPattern;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private static int createdCount = 0;
    private final List<Connection> pool = new ArrayList<>();
    private final int MAX_SIZE = 3;

    public ConnectionPool() {
        for (int i = 1; i <= MAX_SIZE; i++) {
            pool.add(new Connection("id-" + i));
            createdCount++;
        }
    }

    public synchronized Connection getConnection() {
        if (pool.isEmpty()) {
            System.out.println("No available connections");
            printStats();
            return null;
        }
        Connection c = pool.remove(0);
        System.out.println("выдано: " + c);
        return c;
    }

    public synchronized void releaseConnection(Connection c) {
        if (c != null) {
            pool.add(c);
            System.out.println("возвращено в пул: " + c);
        }
    }

    public void printStats() {
        System.out.println();
        System.out.println("статистика пула:");
        System.out.println("всего объектов создано: " + createdCount);
        System.out.println("свободно объектов сейчас: " + pool.size());
        System.out.println("объектов занято: " + (createdCount - pool.size()));
        System.out.println();
    }
}
