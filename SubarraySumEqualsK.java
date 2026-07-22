import java.util.*;
public class SubarraySumEqualsK {
    public int subarray(int[] nums, int k){
        int count = 0;
        for (int i=0; i<nums.length-1;i++){
            int sum =0;
            for (int j=i;j<nums.length;j++){
                sum = sum + nums[j];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int result = obj.subarray(nums, k);
        System.out.println("The number of subarrays with sum equal to " + k + " is: " + result);
        sc.close();
    }
    
}
