package com.example.jakebradbeer.euchure;

public class Card {

    private String rank;
    private String suit;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public static String getRank(Card thisCard) {
        return thisCard.rank;
    }

    public static String getSuit(Card thisCard) {
        return thisCard.suit;
    }

}