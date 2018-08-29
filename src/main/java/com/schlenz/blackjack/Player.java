package com.schlenz.blackjack;

public interface Player {
    Hand getHand();
    Action chooseAction();
}
