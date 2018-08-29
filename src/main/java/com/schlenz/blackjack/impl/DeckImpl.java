package com.schlenz.blackjack.impl;

import com.schlenz.blackjack.Card;
import com.schlenz.blackjack.Deck;
import com.schlenz.blackjack.Suit;
import com.schlenz.blackjack.Value;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class DeckImpl implements Deck {
    private final Random random;
    private final LinkedList<Card> cards;

    public DeckImpl() {
        this.random = new Random();
        this.cards = new LinkedList<>();

        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new CardImpl(suit, value));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards, random);
    }

    @Override
    public Card drawCard() {
        return cards.pop();
    }
}
