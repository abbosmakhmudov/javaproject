package class4;

public class T3Donor {
    public static void main(String[] args) {
        int age=20;
        double weight=155;
        if(age>18){
            System.out.println("At eligible AGE to donate");
            if(weight>110){
                System.out.println("Has an eligible WEIGHT");
            }else{
                System.out.println("Not eligible WEIGHT");
            }

        }else{
            System.out.println("Not eligible AGE");
        }
    }
}
