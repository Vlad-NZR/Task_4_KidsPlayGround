package com.model;
import java.util.List;
import java.util.ArrayList;

/**
 * Class PlayRoom simulates Database of toy WareHouse
 */
public class PlayRoom {
    List <Toy> toysWareHouse = new ArrayList<>();
    public void setToysWareHouse(){
        toysWareHouse.add(new ActionFigure(1,40,AgeCategory.NEWBORNS,"Dolly",Size.SMALL,Colour.ORANGE,true));
        toysWareHouse.add(new ActionFigure(2,24,AgeCategory.NEWBORNS,"Barby",Size.MEDIUM,Colour.RED,true));
        toysWareHouse.add(new ActionFigure(3,25,AgeCategory.NEWBORNS,"Katty",Size.SMALL,Colour.BLUE,true));
        toysWareHouse.add(new ActionFigure(4,40,AgeCategory.NEWBORNS,"Can",Size.MEDIUM,Colour.YELLOW,false));
        toysWareHouse.add(new ActionFigure(5,26,AgeCategory.NEWBORNS,"Dog",Size.MEDIUM,Colour.GREEN,true));
        toysWareHouse.add(new ActionFigure(6,45,AgeCategory.NEWBORNS,"Horse",Size.LARGE,Colour.RED,false));
        toysWareHouse.add(new CreativeToy(7,33,AgeCategory.TODDLERS,"Lego",Size.MEDIUM,Colour.MULTICOLOURED,55));
        toysWareHouse.add(new CreativeToy(8,54,AgeCategory.TODDLERS,"Lego",Size.LARGE,Colour.MULTICOLOURED,100));
        toysWareHouse.add(new CreativeToy(9,66,AgeCategory.TODDLERS,"Lego",Size.SMALL,Colour.MULTICOLOURED,30));
        toysWareHouse.add(new CreativeToy(10,33,AgeCategory.TODDLERS,"Stickers",Size.MEDIUM,Colour.MULTICOLOURED,30));
        toysWareHouse.add(new CreativeToy(11,33,AgeCategory.TODDLERS,"ColorForms",Size.MEDIUM,Colour.MULTICOLOURED,55));
        toysWareHouse.add(new Game(12,36,AgeCategory.KIDS,Size.MEDIUM,"Battleship",4));
        toysWareHouse.add(new Game(13,44,AgeCategory.KIDS,Size.MEDIUM,"Mouse Trap",4));
        toysWareHouse.add(new Game(14,76,AgeCategory.TEENS,Size.MEDIUM,"Monopoly",4));
        toysWareHouse.add(new Game(15,80,AgeCategory.TEENS,Size.MEDIUM,"Life",4));
        toysWareHouse.add(new Puzzle(16,20,AgeCategory.TEENS,Size.MEDIUM,"Rubik,s Cube",1));
        toysWareHouse.add(new Puzzle(17,60,AgeCategory.KIDS,Size.MEDIUM,"Jigsaw puzzle",40));
        toysWareHouse.add(new Puzzle(18,30,AgeCategory.TEENS,Size.MEDIUM,"Perplexus",50));
        toysWareHouse.add(new Puzzle(19,60,AgeCategory.KIDS,Size.MEDIUM,"Puzle",4));
        toysWareHouse.add(new ElectronicToy(20,50,AgeCategory.PRESCHOLERS,"Robot",Size.MEDIUM,Colour.MULTICOLOURED,true,2));
        toysWareHouse.add(new ElectronicToy(21,70,AgeCategory.PRESCHOLERS,"Car",Size.MEDIUM,Colour.MULTICOLOURED,true,4));
        toysWareHouse.add(new ElectronicToy(22,80,AgeCategory.PRESCHOLERS,"Electronic Pet",Size.MEDIUM,Colour.RED,false,30));
        toysWareHouse.add(new ElectronicToy(23,33,AgeCategory.TODDLERS,"Digital Doll",Size.MEDIUM,Colour.YELLOW,false,3));
    }

    /**
     * Utility sorting method according AgeCategory
     * @param category @see Model.AgeCategory
     * @return newly created list of toys containing only toys for AgeCategory given as parameter
     */
    public List<Toy> createPlayRoomAccordingAge(AgeCategory category){
        List<Toy> playRoom = new ArrayList<>();
                for(Toy toy:this.toysWareHouse){
                    if(toy.getAgeCategory()==category){
                playRoom.add(toy);
            }
        }
        return playRoom;
    }

    /**
     * Utility  method  creates list of toys according the budget
     * @param budget
     * @param toys list returned from createPlayRoomAccordingAge method
     * @return newly created list of toys
     */
    public  List<Toy> createPlayRoomAccordingBudget(double budget,List<Toy>toys){
        List<Toy> playRoom = new ArrayList<>();
        double sum = 0;
        int index =0;
        while (sum < budget){
            sum += toys.get(index).getPrice();
            if(sum < budget) {
                playRoom.add(toys.get(index));
                index++;
            }

        }
        return playRoom;
    }

}
