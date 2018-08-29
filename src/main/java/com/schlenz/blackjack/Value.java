package com.schlenz.blackjack;

public enum Value {
    ACE("A", 1, 11),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("T", 10),
    JACK("J", 10),
    QUEEN("Q", 10),
    KING("K", 10);

    private final String shorthand;
    private final int minValue;
    private final int maxValue;

    Value(String shorthand, int minValue) {
        this(shorthand, minValue, minValue);
    }

    Value(String shorthand, int minValue, int maxValue) {
        this.shorthand = shorthand;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getShorthand() {
        return shorthand;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
