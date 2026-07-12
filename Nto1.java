
import java.util.*;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i=n;
        printn(i,n);

    }

    public static void printn(int n, int i){
        if (i<1){
            return;

        }
        System.out.println(i);
        printn(n,i-1);
    }
}
