package class5;

import java.util.Scanner;

public class T4Number {
    public static void main(String[] args) {

        System.out.println("Please Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num>=1&&num<=10){
            System.out.println("Small");
        } else if (num>=11&&num<=100) {
            System.out.println("Medium");
        } else if (num>=101&&num<=1000) {
            System.out.println("Large");
        }
    }
}
