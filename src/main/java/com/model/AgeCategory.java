package com.model;

public enum AgeCategory {
    NEWBORNS(0,1),
    TODDLERS(1,3),
    PRESCHOLERS(3,5),
    KIDS(5,10),
    TEENS(10,14);
    private int lowerRange;
    private int upperRange;
    AgeCategory(int lowerRange,int upperRange){
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }
    public int getLowerRange(){
        return lowerRange;
    }
    public int getUpperRange(){
        return upperRange;
    }
}
