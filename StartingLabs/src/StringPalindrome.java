import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int i = 0, j = s.length()-1;
        for (int k = 0; k < s.length()-1; k++) {
            if (s.charAt(i) != s.charAt(j)){
                System.out.println("not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }
}
