package class19;

public class Programming {
    private String programmingLanguage;

    public   Programming(){

        System.out.println("I love programming languages");


    }
    public   Programming(String programmingLanguage){

            System.out.println("I love "+programmingLanguage);


    }

    public static void main(String[] args) {
        new Programming("C");
        new Programming();


    }
}
