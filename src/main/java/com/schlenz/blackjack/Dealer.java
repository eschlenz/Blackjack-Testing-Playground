package com.schlenz.blackjack;

public interface Dealer extends Player {
    void dealCard(Deck deck, Player player);
}
