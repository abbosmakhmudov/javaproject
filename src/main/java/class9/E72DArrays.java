package class9;

public class E72DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40},
                {15,25,35,45},
                {11,21,31,41}

        };
        for(int row=0; row<numbers.length; row++){
            for (int col = 0; col <numbers[row].length ; col++) {
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();
        }
        }

    }

