package review8;

public class E1LocalVariables {
    public static void main(String[] args) {
        // System.out.println(country); error
        String country="Uganda";

        {
            int age=10;
            System.out.println(country);
        }

        if(10>5){
            String name="Wanda";
        }
        //  System.out.println(name);  error

        //  System.out.println(age);   error
    }
}
