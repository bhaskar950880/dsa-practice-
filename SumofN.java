
import java.util.Scanner;

public class SumofN {

    public static void add1(int i,int add){
        if (i == 0){
            System.out.println(add);
            return;
        }
        add = add+i;
        add1(i-1, add);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int add = 0;
        add1(n, add);
    }
}
