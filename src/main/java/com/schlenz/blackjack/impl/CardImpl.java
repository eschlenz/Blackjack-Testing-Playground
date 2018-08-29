package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.Card;
import com.schlenz.blackjack.Suit;
import com.schlenz.blackjack.Value;

public class CardImpl implements Card {
    private final Suit suit;
    private final Value value;

    public CardImpl(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public Value getValue() {
        return value;
    }

    @Override
    public String getName() {
        return String.format("%1$s%2$s", value.getShorthand(), suit.getShorthand());
    }
}
