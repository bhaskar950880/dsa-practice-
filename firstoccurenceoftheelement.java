
import java.util.Scanner;

public class firstoccurenceoftheelement {
    public static void func(int []arr, int nlength, int index, int element){
        if (index == nlength){
            System.out.println("arra ktam");
            return;
        }
        if (arr[index]==element){
            System.out.println(index);
            return;
        }
        func(arr, nlength, index+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kar ");
        int nlength=sc.nextInt();
        int arr[] = new int[nlength];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();

        }
        System.out.print("element");
        int element = sc.nextInt();
        int index = 0;
        
        func(arr, nlength,0, element);
    }
}
