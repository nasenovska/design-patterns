package com.uni.patterns.stateObserverChain.observer;

public enum ShipmentType {
    PLOVDIV("Plovdiv"),
    BULGARIA("Bulgaria"),
    FOREIGN("Foreign country"),
    FORWARD("Ready to go");

    private final String value;

    ShipmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
