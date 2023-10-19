package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 35, 56, 45, 20};
        int largestEven = nums[0];

        for (int n : nums) {

            if ((n > largestEven)&&(n % 2 == 0)) {

             largestEven=n;

            }
        }
        System.out.println(largestEven);
    }

}