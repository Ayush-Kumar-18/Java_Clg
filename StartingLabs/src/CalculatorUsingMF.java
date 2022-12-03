import java.util.Scanner;

class Calc{
    void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
    void sub(int a, int b){
        System.out.println("Subtraction: " + (a-b));
    }
    void mul(int a, int b){
        System.out.println("Multiplication: " + (a*b));
    }
    void div(int a, int b){
        System.out.println("Division: " + (a/b));
    }
}

public class CalculatorUsingMF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 nos.: ");
        int m = in.nextInt(), n = in.nextInt();
        Calc c = new Calc();
        c.add(m,n);
        c.sub(m,n);
        c.mul(m,n);
        c.div(m,n);
    }
}
