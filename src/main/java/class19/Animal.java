package class19;

public class Animal {

    String name;
    String color;
    int age;

    int num=10;

    public Animal(String name,String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }

    void printInfo(){
        System.out.print(name+" "+color+" "+age+" ");
    }
}

class Dog extends Animal{

    int num=20;
    double weight;
    public Dog(String name,String color,int age,double weight){
        super(name,color,age);
        this.weight=weight;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println(weight);

    }
}
