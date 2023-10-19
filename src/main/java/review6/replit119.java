package review6;

public class replit119 {

    public void  censoredLetter(String in,char l){

        StringBuilder input=new StringBuilder();
        for (int i = 0; i <in.length() ; i++) {
            char c=in.charAt(i);
           if(c==l){
               input.append("*");
           }else{
               input.append(c);
           }
        }
        System.out.println(input.toString());

    }

    public static void main(String[] args) {
        // censorLetter("computer science",'e') ==> "comput*r sci*nc*"
        // censorLetter("trick or treat",'t') ==> "*rick or *rea*"
        replit119 s=new replit119();
        s.censoredLetter("computer science",'e');
        s.censoredLetter("trick or treat",'t');
    }
}
