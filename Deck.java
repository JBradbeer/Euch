package com.example.jakebradbeer.euchure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public static ArrayList<Card> createDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        ArrayList<Card> deck = new ArrayList<Card>();

        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                Card c = new Card(suits[s], ranks[r], r);
                deck.add(c);
            }
        }
        return deck;
    }

    public static ArrayList<Card> shuffleDeck(ArrayList<Card> deck) {
        ArrayList<Card> hand = new ArrayList<Card>();

        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));

        return deck;
    }

    // Requires a shuffled deck
    public static ArrayList<Card> deal(ArrayList<Card> deck) {
        ArrayList<Card> hand = new ArrayList<Card>();

        for (int x = 0; x < 5; x++) {
            hand.add(deck.get(0));
            deck.remove(0);
        }

        return hand;
    }

    public static ArrayList<Card> dealHand(ArrayList<Card> deck) {
        ArrayList<Card> hand = new ArrayList<Card>();

        for (int i = 0; i < 5; i++) {
            hand.add(deck.get(0));
            deck.remove(0);
        }
        return hand;
    }
}