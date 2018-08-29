package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.Card;
import com.schlenz.blackjack.Hand;
import com.schlenz.blackjack.Value;
import java.util.ArrayList;
import java.util.Iterator;


import static com.schlenz.blackjack.Constants.BUST_THRESHOLD;
import static com.schlenz.blackjack.Constants.SOFT_THRESHOLD;

public class HandImpl implements Hand {
    private final ArrayList<Card> cards;

    public HandImpl() {
        this.cards = new ArrayList<>();
    }

    @Override
    public void takeDealtCard(Card card) {
        cards.add(card);
    }

    @Override
    public int getHandValue() {
        int value = 0;

        for (Card card : cards) {
            if ((value + card.getValue().getMaxValue()) <= BUST_THRESHOLD) {
                value += card.getValue().getMaxValue();
            } else {
                value += card.getValue().getMinValue();
            }
        }

        return value;
    }

    @Override
    public boolean isBusted() {
        return (getHandValue() > BUST_THRESHOLD);
    }

    @Override
    public boolean isSoft() {
        return ((cards.stream().filter(card -> card.getValue() == Value.ACE).count() > 0) &&
            (getHandValue() <= SOFT_THRESHOLD));
    }

    @Override
    public String getHandInfo() {
        StringBuilder sb = new StringBuilder();

        Iterator<Card> iter = cards.iterator();
        while (iter.hasNext()) {
            Card card = iter.next();

            sb.append(card.getName());

            if (iter.hasNext()) {
                sb.append(", ");
            } else {
                sb.append(": ");
            }
        }

        sb.append(getHandValue());

        return sb.toString();
    }
}
