package review8;

public class E3StaticVar {
    public static String country="USA";

    void printName(){
        System.out.println(country);
    }

    static void printContry(){
        System.out.println(country);
    }
}

class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3StaticVar.country);
    }
}
