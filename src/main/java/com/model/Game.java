package com.model;

public class Game extends EducationalToy {

   private int numberOfPlayers;

    public Game(int idNumber, double price, AgeCategory ageCategory,Size size,String name,int numberOfPlayers) {
        super( idNumber,price,ageCategory,size,name);
        this.numberOfPlayers = numberOfPlayers;

    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

}
