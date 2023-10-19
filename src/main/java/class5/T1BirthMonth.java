package class5;

import java.util.Scanner;

public class T1BirthMonth {
    public static void main(String[] args) {

        System.out.println("Please Enter your birth month");
        Scanner scanner=new Scanner(System.in);

        String month=scanner.next();

        if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println("You were born is season Spring");
        }else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
            System.out.println("You were born is season Summer");
        }else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
            System.out.println("You were born is season Fall");
        } else if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")) {
            System.out.println("You were born is season Winter");

        }


    }
}
