package class9;

import java.util.Arrays;

public class E82DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {10,20,30,40},
                {15,25,35,45},
                {11,21,31,41}

        };
        for(int[] row:numbers){

            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));
        }

    }

