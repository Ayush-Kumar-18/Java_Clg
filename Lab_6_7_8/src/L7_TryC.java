import java.util.Scanner;

public class L7_TryC {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int d = in.nextInt();
            System.out.println(20/d);
            int[] a = {1, 2};
            System.out.println(a[90]);
        }
        catch (ArithmeticException e){
            System.out.println("Exception: " + e);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Execption: " + ae);
        }
    }
}
