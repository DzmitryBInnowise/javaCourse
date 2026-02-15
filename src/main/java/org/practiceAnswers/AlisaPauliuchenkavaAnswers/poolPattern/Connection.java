package org.practiceAnswers.AlisaPauliuchenkavaAnswers.poolPattern;

public class Connection {

    private final String id;

    public Connection(String id) {
        this.id = id;
    }

    public void query(String sql) {
        System.out.println("запрос [" + sql + "] через " + id);
    }

    @Override
    public String toString() {
        return "Connection{id='" + id + "'}";
    }
}
