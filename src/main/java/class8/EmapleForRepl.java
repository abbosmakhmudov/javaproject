package class8;

import java.util.Scanner;

public class EmapleForRepl {

        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter name of the instructor");
            String instructorname=scanner.nextLine();
            if(instructorname.equalsIgnoreCase("Asghar")){
                System.out.println("Will take care of Java Assignment");
            }else if(instructorname.equalsIgnoreCase("Moazzam")){
                System.out.println("Will take care of SDLC Assignment");
            }else if(instructorname.equalsIgnoreCase("Waqas")){
                System.out.println("Will take care of Selenium Assignment");
            }else if(instructorname.equalsIgnoreCase("Asel")){
                System.out.println("Will take care of every Assignment");
            }else{
                System.out.println("Invalid instructor selected");
            }
        }

    }




