package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.*;


import static com.schlenz.blackjack.Outcome.*;

public class GameImpl implements Game {
    private final Deck deck;
    private final Dealer dealer;
    private final Player player;

    public GameImpl(Deck deck) {
        this.deck = deck;
        this.dealer = new DealerImpl(new HandImpl(), new DealerStrategyImpl());
        this.player = new PlayerImpl(new HandImpl(), new SimplePlayerStrategyImpl());
    }

    @Override
    public void start() {
        deck.shuffle();
    }

    @Override
    public void dealInitialHands() {
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
        dealer.dealCard(deck, player);
        dealer.dealCard(deck, dealer);
    }

    @Override
    public void dealPlayerUntilFinished() {
        dealUntilFinished(player);
    }

    @Override
    public void dealDealerUntilFinished() {
        dealUntilFinished(player);
    }

    private void dealUntilFinished(Player player) {
        boolean exitLoop = false;

        do {
            switch (player.chooseAction()) {
                case HIT:
                    dealer.dealCard(deck, player);
                    break;
                case STAY:
                    exitLoop = true;
                    break;
            }

            if (exitLoop) {
                break;
            }
        } while(!player.getHand().isBusted());
    }

    @Override
    public Outcome determineOutcome() {
        Outcome outcome;

        if (player.getHand().isBusted()) {
            outcome = DEALER_WINS;
        } else if (dealer.getHand().isBusted()) {
            outcome = PLAYER_WINS;
        } else if (player.getHand().getHandValue() > dealer.getHand().getHandValue()) {
            outcome = PLAYER_WINS;
        } else if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
            outcome = DEALER_WINS;
        } else {
            outcome = PUSH;
        }

        System.out.println(String.format("Dealer Hand: %1$s", dealer.getHand().getHandInfo()));
        System.out.println(String.format("Player Hand: %1$s", player.getHand().getHandInfo()));
        System.out.println(String.format("Outcome    : %1$s", outcome));

        return outcome;
    }
}
