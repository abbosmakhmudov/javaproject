package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Marta",1234,1400000,"User1234","Pass123","Cheking")
                ;
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Shawn");
        System.out.println(b.getName());


    }
}
