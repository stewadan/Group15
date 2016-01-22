package models;

/**
 * Created by nic on 1/20/16.
 */
public class Card {
    private int value;
    private String rank;
    private String suit;
    private String color;

    public Card(int value, String rank, String suit, String color){
        this.value = value;
        this.rank = rank;
        this.suit = suit;
        this.color = color;
    }

    public int getValue(){
        return this.value;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getColor(){
        return this.color;
    }
}