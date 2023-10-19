package class14;


public class T1 {
    public static void main(String[] args) {
        T1 t2=new T1();
        int [] array={10,25,15};
        System.out.println(t2.getArrSum(array));
    }
    int getArrSum(int [] arr){
        int sum=0;
        for(int n:arr){
            sum=sum+n;
        }
        return sum;
    }
}
