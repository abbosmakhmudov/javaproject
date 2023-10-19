package class12;

public class E2MethodsTester {
    public static void main(String[] args) {

        E2Methods e2=new E2Methods();
        int sum= e2.add(10,10);
        System.out.println(sum);

        int multiply= e2.multiply10(3);
        System.out.println(multiply);

        int re=e2.numberComparison(21,19);
        System.out.println(re+" is greater number");

    }
}
