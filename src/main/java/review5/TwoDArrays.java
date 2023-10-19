package review5;

public class TwoDArrays {
    public static void main(String[] args) {
        int [][] array= new int[2][4];
        //1st row
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        //2nd row
        array[0][0]=12;
        array[1][1]=13;
        array[2][2]=14;
        array[3][3]=15;

        System.out.println(array[0][3]);
        //how to get all elements from 2d array?
        //array.length in 2d array returns number of rows

        for (int row = 0; row < array.length ; row++) {
            for (int col = 0; col <array[row].length ; col++) {
                System.out.println(array[row][col]);

            }
        }


    }
}
