package review8;

public class E2InstanceVar {
    String name;

    void printName(){
        System.out.println(name);
    }

    static void printInfo(){
        // System.out.println(name);   error
    }

    public static void main(String[] args) {
        E2InstanceVar e1=new E2InstanceVar();
        e1.name="Jam";

        E2InstanceVar e2=new E2InstanceVar();
        e1.name="Scam";

        E2InstanceVar.printInfo();
    }
}
