package class14;

public class T2 {
    static String reverseStr(String inputStr){

       String reversed="";
        for (int i = inputStr.length(); i >=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
      return reversed;
    }
}
