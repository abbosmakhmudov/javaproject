package class5;

import java.util.Scanner;

public class T2PersonHeight {
    public static void main(String[] args) {

        System.out.println("Please Enter your height");
        Scanner scanner=new Scanner(System.in);
        double height=scanner.nextDouble();
        if(height<60){
            System.out.println("short");
        } else if (height>60&&height<72) {
            System.out.println("medium");
        } else if (height>72) {
            System.out.println("tall");
        }


    }
}
