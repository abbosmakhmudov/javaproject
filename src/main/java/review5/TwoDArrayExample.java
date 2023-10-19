package review5;

public class TwoDArrayExample {
    public static void main(String[] args) {

        String [][] contries={
                {"Cananda","USA"},
                {"Ecuador","Brazil","Chile","Argentina"},
                {"Romania","France","Italy"}
        };
        System.out.println(contries.length); //3 - number of 1D arrays
        for(String [] countryArray:contries){  //outer loop iterates over 1D arrays
            for(String country:countryArray){
                System.out.print(country+ " ");
            }
            System.out.println();
        }
    }
}
