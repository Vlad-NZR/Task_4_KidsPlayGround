package com.model;

public class EducationalToy extends Toy {
    protected Size size;
    protected String name;

    public EducationalToy(int idNumber, double price, AgeCategory ageCategory,Size size,String name) {
        super(idNumber, price, ageCategory);
        this.size = size;
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
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

    @Override
    String getName() {
        return this.name;
    }
}
