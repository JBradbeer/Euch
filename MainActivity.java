package com.example.jakebradbeer.euchure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] suits = {"Spadess", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        List<Card> deck = new ArrayList<Card>();

        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                Card c = new Card(suits[s], ranks[r]);
                deck.add(c);
            }
        }
    }

    public ArrayList<Card> Shuffle (ArrayList<Card> deck){
        ArrayList<Card> hand = new ArrayList<Card>();

        long seed = System.nanoTime();
        Collections.shuffle(deck, new Random(seed));

        return deck;
    }

    // Requires a shuffled deck
    public ArrayList<Card> Deal (ArrayList<Card> deck){
        ArrayList<Card> hand = new ArrayList<Card>();

        for (int x = 0; x < 5; x++)  {
            hand.add(deck.get(0));
            deck.remove(0);
        }

        return hand;
    }

    public void handDisplay (ArrayList<Card> hand){
        String suit; String rank;

        for (int h = 0; h < hand.size(); h++) {
            System.out.println(Card.getSuit(hand.get(h)));
            System.out.println(Card.getRank(hand.get(h)));
        }
    }

}
