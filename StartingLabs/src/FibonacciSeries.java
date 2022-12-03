import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit for the series: ");
        n = in.nextInt();
        System.out.println("Non-Recursive: ");
        fiboNonRecursive(n);
        System.out.println("\nRecursive: ");
        for (int i = 0; i < n; i++) {
            System.out.print( fiboRecursive(i) + " " );
        }
    }

    static int fiboRecursive(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fiboRecursive(n-1) + fiboRecursive(n - 2);
    }

    static void fiboNonRecursive(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.print(" " + c);
        }
    }
}
