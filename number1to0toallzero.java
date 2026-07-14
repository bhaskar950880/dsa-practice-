import java.util.*;
public class number1to0toallzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int count = 0;
            for (int j = i; j < n; j += k) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
    
}
