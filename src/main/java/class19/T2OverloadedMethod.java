package class19;

public class T2OverloadedMethod {

    public static void print(String name){
        System.out.println("Name is: "+name);
    }
    public static void print(String name, String Lastname){
        System.out.println("Name and Lastname is: "+name+" "+Lastname);
    }
    public static void print(String name, String lastName, int age){
        System.out.println("Name, Lastname and age is: "+name+" "+lastName+" "+age);
    }

    public static void main(String[] args) {
        T2OverloadedMethod t1=new T2OverloadedMethod();
        t1.print("Abbos","Makhmudov",28);
    }

}
