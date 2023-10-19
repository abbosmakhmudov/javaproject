package class5;

public class E2NotOperator {
    public static void main(String[] args) {

        /*
        write a program that checks ifthe country is not equal to Iran
        its says you are allowed
         */
        String country="UK";

        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }else{
            System.out.println("You are not allowed");
        }


    }

}
