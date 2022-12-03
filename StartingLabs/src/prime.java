import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (checkprime(n)){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        System.out.println(checkprime(n));
        //cprime(n);
    }

    private static void cprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }


    static boolean checkprime(int n) {
        for (int i = 2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
