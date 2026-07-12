import java.util.Scanner;

public class Power {
    public static void func(int n,int m ,int product){
        if (m==0){
            System.out.println(product);
            return;
        }
        product=product*n;
        func(n, m-1, product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int product=1;
        func(n, m, product);
    }
}
