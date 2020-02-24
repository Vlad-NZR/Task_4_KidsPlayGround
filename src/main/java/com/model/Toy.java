package com.model;

public abstract class Toy {
    protected int idNumber;
    protected double price;
    protected AgeCategory ageCategory;

    public Toy(int idNumber,double price,AgeCategory ageCategory) {
        this.idNumber = idNumber;
        this.price = price;
        this.ageCategory = ageCategory;
    }

    abstract int getIdNumber();
    abstract double getPrice();
    abstract AgeCategory getAgeCategory();
    abstract String getName();
    
}