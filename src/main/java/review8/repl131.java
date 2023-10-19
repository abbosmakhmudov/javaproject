package review8;

public class repl131 {
    public static String thirdLetter(String s){
        String newS="";
        for(int i=0; i<s.length(); i+=3){
            newS=newS+s.charAt(i);
        }
        return newS;
    }



    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

