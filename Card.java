package com.example.jakebradbeer.euchure;

public class Card {

    private String rank;
    private String suit;
    private int id;

    public Card(String rank, String suit, int id) {
        this.rank = rank;
        this.suit = suit;
        this.id = id;
    }

    public static String getRank(Card thisCard) {
        return thisCard.rank;
    }

    public static String getSuit(Card thisCard) {
        return thisCard.suit;
    }

}