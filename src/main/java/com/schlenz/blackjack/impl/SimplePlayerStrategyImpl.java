package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.Action;
import com.schlenz.blackjack.Hand;
import com.schlenz.blackjack.PlayerStrategy;


import static com.schlenz.blackjack.Action.HIT;
import static com.schlenz.blackjack.Action.STAY;
import static com.schlenz.blackjack.Constants.SOFT_THRESHOLD;

public class SimplePlayerStrategyImpl implements PlayerStrategy {
    @Override
    public Action chooseAction(Hand hand) {
        return (hand.getHandValue() < SOFT_THRESHOLD) ? HIT : STAY;
    }
}
