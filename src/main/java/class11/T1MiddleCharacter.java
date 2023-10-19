package class11;

public class T1MiddleCharacter {
    public static void main(String[] args) {
        String name="aaabaaa";
        int length=name.length();
        if(name.isEmpty()){
            System.out.println("String is Empty");
        }else{
            if(length>=3&&name.length()%2!=0){
                System.out.println(name.charAt((length/2)));
            }
        }
    }
}
