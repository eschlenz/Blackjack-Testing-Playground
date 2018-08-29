package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.*;

public class DealerImpl extends PlayerImpl implements Dealer {
    public DealerImpl(Hand hand, PlayerStrategy playerStrategy) {
        super(hand, playerStrategy);
    }

    @Override
    public void dealCard(Deck deck, Player player) {
        player.getHand().takeDealtCard(deck.drawCard());
    }
}
