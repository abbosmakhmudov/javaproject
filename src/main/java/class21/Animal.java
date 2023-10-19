package class21;

public class Animal {
    String name;
    String breed;
    String color;

    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Wuff Wuff ...");
    }
    @Override
    void sleep(){
        System.out.println("Sleeping for last 16 hours ....");
    }
    @Override
    void eat(){
        System.out.println("Eating bones ....");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println(" ");
    }
    @Override
    void sleep(){
        System.out.println(" ");
    }
    @Override
    void eat(){
        System.out.println(" ");
    }
}
