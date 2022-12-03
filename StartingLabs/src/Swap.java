public class Swap {
    public static void main(String[] args) {
        int a = 3, b= 5;
        System.out.println(a + " " + b);
        swapUsing3rdVar(a, b);
        swapWithout3rdVar(a, b);
    }

    private static void swapWithout3rdVar(int a, int b) {
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After Swapping(without 3rd var)" +  a + " " + b);
    }

    private static void swapUsing3rdVar(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping(using 3rd var)" + a + " " + b);
    }
}
