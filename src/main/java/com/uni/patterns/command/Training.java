package com.uni.patterns.command;

public enum Training {
    STAND_UP("stand up"),
    LIE_DOWN("lie down");

    private final String value;

    Training(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
