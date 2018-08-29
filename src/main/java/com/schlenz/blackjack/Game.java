package com.schlenz.blackjack;

public interface Game {
    void start();
    void dealInitialHands();
    void dealPlayerUntilFinished();
    void dealDealerUntilFinished();
    Outcome determineOutcome();
}
