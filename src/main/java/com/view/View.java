package com.view;

import com.model.Toy;
import com.model.Model;
import java.util.List;

public class View {
    public static final String LANGUAGE_REGEX = "[0,1]";
    public static final String AGE_CATEGORY_REGEX = "[0-4]";
    public static final String BUDGET_REGEX = "[1][0-9][0-9]";
    public static final String INPUT_LANGUAGE_EN = "Enter 0 for English or 1 for Russian ";
    public static final String INPUT_LANGUAGE_RUS = "Введите 0 для Английского или 1 для Русского";


    public void printMessage(String message){
        System.out.println(message);
    }

    public void printToyList(List<String>list){
        for(String str:list){
            System.out.println(str);
        }
    }
}
