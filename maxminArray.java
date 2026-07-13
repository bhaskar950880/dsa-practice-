
import java.util.Scanner;

public class maxminArray {
    public static void array(int[] arr, int nlength, int i , int max){
        if (i==nlength){
            System.out.println(max);
            return;
        }
        if (arr[i]>max){
            max = arr[i];
        
        }
        array(arr,nlength,i+1, max);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int nlength = sc.nextInt();
        int arr[] = new int[nlength];
        for (int i = 0; i < nlength; i++) {
            arr[i]  = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        array(arr,nlength,0, max);
    }

}
