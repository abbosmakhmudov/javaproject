package class7;

public class E12Arrays {
    public static void main(String[] args) {

        int[] numbers={25,30,45,50,65};
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]%2!=0)
            System.out.println(numbers[i]);
            sum=sum+numbers[i];

        }
        System.out.println(sum);

    }
}
