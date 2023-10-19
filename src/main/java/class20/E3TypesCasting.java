package class20;

public class E3TypesCasting {
    public static void main(String[] args) {
        Student s1=new Student("Aslan","A1234");
        Student s2=new Student("Mikhail","12345");

        Student[] arr={new Student("Aslan","A1234"),new Student("Mikhail","12345")};

       //   arr[1].printInfo();

       //  s2.printInfo();

        for (int i = 0; i <arr.length ; i++) {
            Student s=arr[i];
            s.printInfo();
        }


    }
}
