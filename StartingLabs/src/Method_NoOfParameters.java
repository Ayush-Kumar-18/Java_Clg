public class Method_NoOfParameters {
    public static void main(String[] args) {
        System.out.println("First method: "); display(9);
        System.out.println("Second method: "); display(18,19);
        System.out.println("Third method: "); display(3,13,22);
    }
    static void display(int a, int b){
        System.out.println(a + " " + b);
    }
    static void display(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }
    static void display(int a){
        System.out.println(a);
    }
}
