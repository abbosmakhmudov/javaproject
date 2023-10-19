package review2;

public class E6IfIfDemo {
    public static void main(String[] args) {

        int age=20;

        if(age>60){
            System.out.println("You get 20% Discount");
        }if(age>50){
            System.out.println("You get 15% discount");
        }if(age>40){
            System.out.println("You get 10% discount");
        }else{
            System.out.println("No Discounts for you. Please try after 10 years");
        }
    }
}
