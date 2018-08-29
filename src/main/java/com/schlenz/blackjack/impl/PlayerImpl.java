package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.Action;
import com.schlenz.blackjack.Hand;
import com.schlenz.blackjack.Player;
import com.schlenz.blackjack.PlayerStrategy;

public class PlayerImpl implements Player {
    private final Hand hand;
    private final PlayerStrategy playerStrategy;

    public PlayerImpl(Hand hand, PlayerStrategy playerStrategy) {
        this.hand = hand;
        this.playerStrategy = playerStrategy;
    }

    @Override
    public Hand getHand() {
        return hand;
    }

    @Override
    public Action chooseAction() {
        return playerStrategy.chooseAction(hand);
    }
}
