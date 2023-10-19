package class15;

public class Students {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;


    void avgGrades(){
        int average=(grade1+grade2+grade3)/3;
        System.out.println(average);
    }
    public Students(String sName, int sGarde1, int sGarde2,int sgrade3){
        name=sName;
        grade1=sGarde1;
        grade2=sGarde2;
        grade3=sgrade3;
        System.out.print("Student "+name+" has a average grade of ");
    }

    public static void main(String[] args) {
        new Students("Abbos",98,90,80).avgGrades();

        new Students("Ali",70,80,90).avgGrades();

    }

}
