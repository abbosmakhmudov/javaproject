package class9;

public class T12DArrays {
    public static void main(String[] args) {
        String [][] student={
                {"Aysha","Giulia","John","Deepali",},
                {"A","A+","C","B",}


        };
        for(int i=0; i<student[0].length; i++){
            if(student[1][i].equals("A")||student[1][i].equals("B")) {
                System.out.print(student[0][i] + " ");
            }
        }

    }
}
