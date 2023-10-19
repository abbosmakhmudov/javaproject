package class9;

public class T22DArraysCars {
    public static void main(String[] args) {

        String [][] cars={
                {"GMC","Ford","Chevrolet"},
                {"Audi","BMW","Mercedes"},
                {"Hundai","KIA","Ssangyong"},
                {"Ferrari","Lomborgini","Maseratti"}
        };
        for(String [] row:cars){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("=============================");
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }
    }
}
