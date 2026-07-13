
import java.util.Scanner;

public class fibonachee {
    public static int fib(int n){
        if(n==1 || n==0)
            return n;

        return fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no ");
        int n= sc.nextInt();
        int result = fib(n);
        System.out.println(result);
    }


}
