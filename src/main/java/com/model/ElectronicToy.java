package com.model;

public class ElectronicToy extends Toy {
    protected String name;
    protected Size size;
    protected Colour colour;
    protected boolean isRadioControlled;
    protected int numberOfBatteries;

    public ElectronicToy(int idNumber,double price,AgeCategory ageCategory,String name,Size size,Colour colour,boolean isRadioControlled,int numberOfBatteries) {
        super(idNumber,price,ageCategory);
        this.name = name;
        this.colour = colour;
        this.size = size;
        this.isRadioControlled = isRadioControlled;
        this.numberOfBatteries = numberOfBatteries;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public boolean isRadioControlled() {
        return isRadioControlled;
    }

    public void setRadioControlled(boolean radioControlled) {
        isRadioControlled = radioControlled;
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
