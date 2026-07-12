
import java.util.Scanner;
public class Print1t0n{

    public static void printn(int i, int n){
        if(i>n){
            return;

        }
        System.out.println(i);
        printn(i+1, n);

        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i =1;
        printn(i,n);
    }
}