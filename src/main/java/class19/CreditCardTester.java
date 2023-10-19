package class19;

public class CreditCardTester {

    public static void main(String[] args) {


        CreditCard s1 = new CreditCard();
        s1.callInterest(100);

        Visa s2=new Visa();
        s2.callInterest(100);
        AX s3=new AX();
        s3.callInterest(100);

    }
}
