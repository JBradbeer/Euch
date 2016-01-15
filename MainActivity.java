package com.example.jakebradbeer.euchure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//d
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGame();

        Button btn[] = new Button[5];


       // for (int i = 0; i < 5; i++) {
        //    btn[i] = new Button(this); // initialize it
        //    btn[i].setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        //    btn[i].setOnClickListener(this);
        //    layout.addView(btn[i]);
     }

    public void startGame(){
        ArrayList<Card> deck = Deck.createDeck();
        deck = Deck.shuffleDeck(deck);

        ArrayList<ArrayList<Card>> hands = new ArrayList<ArrayList<Card>>(4);

        for (int i=0; i<4; i++){
            hands.set(i, Deck.deal(deck));
        }


    }

}
