package com.schlenz.blackjack;

public interface PlayerStrategy {
    Action chooseAction(Hand hand);
}
