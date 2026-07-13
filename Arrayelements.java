import java.util.Scanner;

public class Arrayelements {
    public static void array(int[] arr, int nlength, int i){
        if (i==nlength){
            return;
        }
        System.out.print(arr[i]+" ");
        array(arr, nlength, i+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int nlength = sc.nextInt();
        int arr[] = new int[nlength];
        for (int i = 0; i < nlength; i++) {
            arr[i]  = sc.nextInt();
        }
        array(arr, nlength, 0);
    }
}
