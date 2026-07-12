
import java.util.Scanner;

public class ReverseAnumber {
    public static void reversey(int n, int reverse) {
        if (n == 0){
            System.out.println(reverse);
            return;
        }
        reverse=reverse*10+(n%10);
        n=n/10;
        reversey(n, reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int reverse = 0;
        reversey(n, reverse);
    }
}
