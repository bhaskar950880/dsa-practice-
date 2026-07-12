import java.util.Scanner;

public class SumofDigit {
    public static void sum(int n,int a){
        if (n == 0){
            System.out.println(a);
            return;
        }
        a = a+n%10;
        sum(n/10, a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int a= 0;
        sum(n, a);

    }
}
