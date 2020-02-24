package com.model;

public class Puzzle extends EducationalToy {
   private int numberOfParts;

    public Puzzle(int idNumber, double price, AgeCategory ageCategory,Size size,String name,int numberOfParts) {
        super(idNumber,price,ageCategory,size,name);
        this.numberOfParts = numberOfParts;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(int numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

}
