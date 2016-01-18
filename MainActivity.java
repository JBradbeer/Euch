package com.example.jakebradbeer.euchure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startGame();
       }


    public void startGame() {
        ArrayList<Card> deck = Deck.createDeck();
        ArrayList<Card> handOne = new ArrayList<Card>();   //TODO Make hands into an array list

        Deck.shuffleDeck(deck);

        for (int i = 0; i < 5; i++) {
           handOne.add(deck.get(0));
        }

        displayHand(handOne);
    }

    public void displayHand(ArrayList<Card> hand) {
        Button btn[] = new Button[5];
        for (int i = 0; i < 4; i++) {
            btn[0] = (Button) findViewById(R.id.button); // initialize it
            btn[1] = (Button) findViewById(R.id.button5); // initialize it
            btn[2] = (Button) findViewById(R.id.button2); // initialize it
            btn[3] = (Button) findViewById(R.id.button3); // initialize it
            btn[4] = (Button) findViewById(R.id.button4); // initialize it
            btn[i].setText(Card.getRank(hand.get(i)) + Card.getSuit(hand.get(i)));
        }
    }

        private View.OnClickListener Listener = new View.OnClickListener() {

            public void onClick(View v) {
                Button btn = (Button) findViewById(v.getId());
                btn.setClickable(false);
            }

        };

    }
