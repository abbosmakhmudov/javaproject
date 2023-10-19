package class11;

public class T2ReverseOrderPrinting {
    public static void main(String[] args) {
        /*
        create a string and print it in reverse order(Sunday ->yadnuS)
         */
        String str="Sunday";
        for (int i=str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
