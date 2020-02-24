package com.model;

public class CreativeToy extends Toy {

    protected String name;
    protected Size size;
    protected Colour colour;
    protected int numberOfParts;
    public CreativeToy(int idNumber,double price,AgeCategory ageCategory, String name,Size size,Colour colour,int numberOfParts){
        super(idNumber,price,ageCategory);
        this.size = size;
        this.name = name;
        this.colour = colour;
        this.numberOfParts = numberOfParts;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(Size size){

    }
    public Size getSize() {
        return size;
    }
    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
    public int getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(int numberOfParts) {
        this.numberOfParts = numberOfParts;
    }

    @Override
    int getIdNumber() {
        return this.idNumber;
    }

    @Override
    double getPrice() {
        return this.price;
    }

    @Override
    AgeCategory getAgeCategory() {
        return this.ageCategory;
    }
}
