package class16;

public class Student {
    private String name;
    private String address;

    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        Student s1=new Student("Abbos","Rochester NY");
        s1.displayInfo();
    }
}
