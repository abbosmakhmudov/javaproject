package review6;

public class replit118 {


        public void spaceOut(String in){

            for (int i = 0; i <in.length() ; i++) {

                System.out.print(in.charAt(i)+" ");

            }
            System.out.println();
        }
        public static void main(String[] args) {
            replit118 s=new replit118();
            s.spaceOut("hello");
            s.spaceOut("technology");
        }
    }

