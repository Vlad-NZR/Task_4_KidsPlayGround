package com.model;
import java.util.List;
import java.util.ArrayList;

/**
 *  Class Model represent business logic of the application
 */
public class Model {
    private AgeCategory category;
    private double budget;
    private PlayRoom playRoom;
    private List<Toy> toysAccordingAge;
    private List<Toy> toysAccordingAgeAndBudget;
    public Model(){
        this.playRoom = new PlayRoom();
        playRoom.setToysWareHouse();
    }
    public AgeCategory getCategory(){
        return this.category;
    }
    public double getBudget(){
        return this.budget;
    }

    /**
     * @param number int 0,1,2,3,4 @see Control.Controller.inputAgeCategory(sc)
     */
    public void setAgeCategory(int number) {
        this.category = AgeCategory.values()[number];
    }

    /**
     * @param budget double from 100.0 to 199.0 @see Control.Controller.inputBudget(sc)
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }


    public void setToysAccordingAge(){
        this.toysAccordingAge = this.playRoom.createPlayRoomAccordingAge(this.category);
    }
    public void setToysAccordingAgeAndBudget(){
        this.toysAccordingAgeAndBudget = this.playRoom.createPlayRoomAccordingBudget(this.budget,this.toysAccordingAge);
    }

    /**
     * @return Final list of the Toy names
     */
    public List<String> getToyNames(){
        List<String> toyNames = new ArrayList<String>();
        for(Toy toy:this.toysAccordingAgeAndBudget){
            toyNames.add(toy.getName());
        }
        return toyNames;
    }


}
