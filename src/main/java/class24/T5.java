package class24;

import java.util.ArrayList;

public class T5 {
    public static void main(String[] args) {
        /*
        create an arrayList of fruit then remove all the fruit which contains
        the letter a or ends with the letter e
        */

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruits);

            }
}
