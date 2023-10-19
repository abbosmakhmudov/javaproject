package class4;

public class T2Mortgage {
    public static void main(String[] args) {
        double mortgageRate=5.5;
        double mortgagePrice=45000;
        if(mortgageRate>4.5){
            System.out.println("Can buy a house");
            if(mortgagePrice>50000){
                System.out.println("Take a loan");
            }else{
                System.out.println("Pay in Cash");
            }
        }else{
            System.out.println("Can not afford a House");
        }
    }
}
