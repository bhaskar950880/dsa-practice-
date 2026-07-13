
import java.util.Scanner;

public class checkarraysorted {
    public static void sorted(int []arr, int nlength, int index ){
        if (index == nlength -1){
            System.out.println("end me ho");
            return;
        }
        if (arr[index]>arr[index+1]){
            System.out.println("unsorted ");
            return;
        }
        sorted(arr, nlength, index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kar ");
        int nlength=sc.nextInt();
        int arr[] = new int[nlength];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();

        }
        int i = 0;
        sorted(arr, nlength, i);
    }
}
