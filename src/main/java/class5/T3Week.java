package class5;

import java.util.Scanner;

public class T3Week {
    public static void main(String[] args) {

        System.out.println("Please enter day number");
        Scanner scanner=new Scanner(System.in);
        int dayNumber=scanner.nextInt();
        if(dayNumber>=1&&dayNumber<=5){
            System.out.println("Its weekday");
        } else if (dayNumber>=6&&dayNumber<=7) {
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }


    }
}
