package class17;

public class X {
    String name;

    void printName(){
        System.out.println(name);
    }
}
class Y extends X{
    int age;

    void printAge(){
        System.out.println(age);
    }
}
class Z extends Y{
    public static void main(String[] args) {
        X s1=new X();
        s1.name="Abbos";
        s1.printName();
        Y s2=new Y();
        s2.age=28;
        s2.printAge();

    }
}

