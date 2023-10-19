package class24;

import java.util.ArrayList;

public class T2ArrayListDrinks {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("cola");
        drinks.add("sprite");
        drinks.add("Milk");

        for (int i = 0; i <drinks.size() ; i++) {

            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);


/*
        String drk="";
        for (int i = 0; i <drinks.size() ; i++) {
            drk=drk+drinks.get(i).replace('a','e');
            System.out.println( drk+" ");

        }
*/


    }
}
