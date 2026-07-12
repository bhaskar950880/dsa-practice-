import java.util.Scanner;

public class palindrome {
    public static void reversey(int n, int reverse, int og) {
        if (n == 0){
            if (reverse == og){
                System.out.println("yes it is");
            }
            else {
                System.out.println("no");
            }
            return;
        }
        reverse=reverse*10+(n%10);
        n=n/10;
        reversey(n, reverse,og);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int reverse = 0;
        reversey(n, reverse, n);
    }
}
    

