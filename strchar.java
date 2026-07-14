import java.util.Scanner;

public class strchar {
    static void printChars(String str, int index) {
        if (index == str.length()) {
            return;
        }
        System.out.println(str.charAt(index));

        printChars(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        printChars(str, 0);
    }
}