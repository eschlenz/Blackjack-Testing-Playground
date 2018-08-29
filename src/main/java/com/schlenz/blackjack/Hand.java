package com.schlenz.blackjack;

public interface Hand {
    void takeDealtCard(Card card);
    int getHandValue();
    boolean isBusted();
    boolean isSoft();
    String getHandInfo();
}
