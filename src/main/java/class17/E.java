package class17;

public class E {
    static void printF(){
        System.out.println("printF");
    }
}
class F extends E{
    public static void main(String[] args) {


    E s1=new E();
    s1.printF();
    }
}