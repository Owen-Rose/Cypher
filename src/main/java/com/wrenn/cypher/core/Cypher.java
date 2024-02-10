package com.wrenn.cypher.core;

public class Cypher {
    private static Cypher instance;

    private Cypher() {

    }

    public static Cypher getInstance() {
        if (instance == null) {
            instance = new Cypher();
        }
        return instance;
    }
}
