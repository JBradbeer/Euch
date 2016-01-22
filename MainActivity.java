package com.example.jakebradbeer.euchure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGame();
       }

    public void startGame() {
        ArrayList<Card> deck = Deck.createDeck();
        boolean handOver = false;
        Deck.shuffleDeck(deck);

        ArrayList<Card> handOne = Deck.dealHand(deck);   //TODO Make hands into an array list
        ArrayList<Card> handTwo = Deck.dealHand(deck);   //TODO Make hands into an array list
        ArrayList<Card> handThree = Deck.dealHand(deck);   //TODO Make hands into an array list
        ArrayList<Card> handFour = Deck.dealHand(deck);   //TODO Make hands into an array list

        while (!handOver)
            displayHand(handOne);
    }

    private int randDealer(){
        Random rng = new Random();

        return rng.nextInt(4);
    }

    private void displayHand(ArrayList<Card> hand) {
        int btnID[] = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5};
        Button btn[] = new Button[5];

        for (int i = 0; i<5; i++)
            btn[i] = (Button) findViewById(btnID[i]);

        for (int i = 0; i < 5; i++) {
            if (btn[i].isClickable())
                btn[i].setText(String.format("%d of %d",
                        Card.getSuit(hand.get(i)), Card.getRank(hand.get(i))));
        }
    }

        private View.OnClickListener Listener = new View.OnClickListener() {

            public void onClick(View v) {
                Button btn = (Button) findViewById(v.getId());
                btn.setText(" ");
                btn.setClickable(false);
            }

        };

    }
