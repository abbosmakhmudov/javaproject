package class16;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private char gender;
    private String nickName;

    public Cat(){

    }
    public Cat(String name,String color, int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public Cat(String name,String color,int age,double weight,char gender,String nickName){
        this(name,color,age);
        this.weight=weight;
        this.gender=gender;
        this.nickName=nickName;
    }

    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight+" "+gender+" "+nickName);
    }

    public static void main(String[] args) {
        Cat c1=new Cat("Luna","Black",3);
        c1.printInfo();

    }
}
