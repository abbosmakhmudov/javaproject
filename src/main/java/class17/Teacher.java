package class17;

public class Teacher {
    String name;
    int age;
    String specialization;
    public void reads (){
        System.out.println("Can read");
    }
    public void writes(){
        System.out.println("Cab write");
    }
    public void sleeps(){
        System.out.println("Can sleep");
    }
    public void eat(){
        System.out.println("Can eat");
    }

}
class MathTeacher extends Teacher{
    Teacher s1=new Teacher();

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}