package class9;

public class E22DArrays {
    public static void main(String[] args) {

        String [][] names={
                {"Hind","Mikhail","Ismael","Ahmed"},
                {"John","Bob","Adam","Tamim"},
                {"Joke","Laugh","John","Mohammed"},
                {"Gui","Backend","Front","API"}

        };
      String[] row=names[2];
       // System.out.println(row[3]);
        //System.out.println(Arrays.toString(row));
        for(String name:row){
            System.out.println(name);
        }
    }
}
