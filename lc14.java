import java.util.*;
public class lc14 {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 1; i <= strs.length - 1; i++) {
            while (!strs[i].startsWith(first)) {
                first = first.substring(0, first.length() - 1);
                if (first.length() == 0) return "";
            }
        }

        return first;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        lc14 obj = new lc14();
        String result = obj.longestCommonPrefix(strs);
        System.out.println("The longest common prefix is: " + result);
        sc.close();
    }
}
