package com.schlenz.blackjack;

import com.schlenz.blackjack.impl.DeckImpl;
import com.schlenz.blackjack.impl.GameImpl;

public class Main {
    public static void main(String[] args) {
        Game game = new GameImpl(new DeckImpl());

        game.start();

        game.dealInitialHands();

        game.dealPlayerUntilFinished();

        game.dealDealerUntilFinished();

        game.determineOutcome();

        System.exit(0);
    }
}
