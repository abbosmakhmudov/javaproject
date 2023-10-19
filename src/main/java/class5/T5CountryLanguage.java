package class5;

import java.util.Scanner;

public class T5CountryLanguage {
    public static void main(String[] args) {

        System.out.println("Please Enter your country");
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();

        switch(country){
            case "USA":
                System.out.println("English");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Tajikistan":
                System.out.println("Tajik");
                break;
            default:
                System.out.println("Wrong Country");
        }



    }
}
