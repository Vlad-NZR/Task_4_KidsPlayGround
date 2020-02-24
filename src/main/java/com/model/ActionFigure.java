package com.model;

public class ActionFigure extends Toy {
    protected String name;
    protected Size size;
    protected Colour colour;
    protected boolean canMakeSound;

    public ActionFigure(int idNumber,double price,AgeCategory ageCategory,String name,Size size,Colour colour,boolean canMakeSound) {
        super(idNumber,price,ageCategory);
        this.name = name;
        this.size = size;
        this.colour = colour;
        this.canMakeSound = canMakeSound;
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

    public boolean isCanMakeSound() {
        return canMakeSound;
    }

    public void setCanMakeSound(boolean canMakeSound) {
        this.canMakeSound = canMakeSound;
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