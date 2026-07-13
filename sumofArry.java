import java.util.*;
public class sumofArry {
    public static void array(int[] arr, int nlength, int i , int sum){

        if (i==nlength){
            System.out.println(sum);
            return;
        }
        
            sum= sum+arr[i];
        array(arr,nlength,i+1, sum);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int nlength = sc.nextInt();
        int arr[] = new int[nlength];
        for (int i = 0; i < nlength; i++) {
            arr[i]  = sc.nextInt();
        }
        int sum = 0;
        array(arr,nlength,0, sum);
    }

}