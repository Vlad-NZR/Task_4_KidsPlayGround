package com.control;
import com.model.Model;
import com.view.View;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Class Controller validate parameters entered by the user
 * and pass them to Model
 */

public class Controller {
    private Model model;
    private View view;
    private Locale locale;
    private ResourceBundle rb;

    public Controller(){
        this.model = new Model();
        this.view = new View();
    }

    /**
     * Set locale according to the user choice
     * @param n int 0 or 1   @see inputLanguage(sc)
     */
    public void changeResourseBandle(int n){
        if (n == 1){
            locale = new Locale("ru");
            rb = ResourceBundle.getBundle("text",locale);
        }
        else{
            locale = new Locale("en");
            rb = ResourceBundle.getBundle("text",locale);
        }
    }


    /**Utilities methods
     *
     * @param sc
     * @return int 0 or 1
     */
    public int inputLanguage(Scanner sc) {
        view.printMessage(view.INPUT_LANGUAGE_EN);
        view.printMessage(view.INPUT_LANGUAGE_RUS);
        String input = sc.next();
        while( !(input.matches(View.LANGUAGE_REGEX))) {
            view.printMessage(view.INPUT_LANGUAGE_EN);
            view.printMessage(view.INPUT_LANGUAGE_RUS);
            input = sc.next();
        }
        return Integer.parseInt(input);
    }

    /**
     *
     * @param sc
     * @return int 0,1,2,3,4
     */
    public int inputAgeCategory(Scanner sc) {
        view.printMessage(rb.getString("Str1"));
        String input = sc.next();
        while( !(input.matches(View.AGE_CATEGORY_REGEX))) {
            view.printMessage(rb.getString("Str2"));
            view.printMessage(rb.getString("Str1"));
            input = sc.next();
        }
        return Integer.parseInt(input);
    }

    /**
     *
     * @param sc
     * @return double in the range from 100.0 to 200.0 exclusive
     */
    public double inputBudget(Scanner sc){
        view.printMessage(rb.getString("Str3"));
        String input = sc.next();
        while( !(input.matches(View.BUDGET_REGEX))) {
            view.printMessage(rb.getString("Str2"));
            view.printMessage(rb.getString("Str3"));
            input = sc.next();
        }
        return Double.parseDouble(input);
    }

    /**running method
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        this.changeResourseBandle(inputLanguage(sc));
        model.setAgeCategory(inputAgeCategory(sc));
        model.setBudget(inputBudget(sc));
        model.setToysAccordingAge();
        model.setToysAccordingAgeAndBudget();
        view.printToyList(model.getToyNames());

    }
}
