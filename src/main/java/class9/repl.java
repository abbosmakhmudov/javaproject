package class9;

public class repl {
    public static void main(String[] args){
        int [] input={5,4,8};
        if(input[0]>input[1]){
            if(input[0]>input[2]){
                System.out.println(input[0]);
            }
        }else if(input[1]>input[2]){
            if(input[1]>input[0]){
                System.out.println(input[1]);
            }
        }else if(input[2]>input[0]){
            if(input[2]>input[1]){
                System.out.println(input[2]);
            }
        }



    }

}
