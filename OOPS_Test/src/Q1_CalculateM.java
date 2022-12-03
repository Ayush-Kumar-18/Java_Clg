class SupC{
    void calculate(int a, int b){
        System.out.println("Super class Addition: " + (a+b));
    }
}
class SubC extends SupC{
    void calculate(int a, int b){
        System.out.println("Sub class addition: " + (a+b));
    }
}

public class Q1_CalculateM {
    public static void main(String[] args) {
        SupC ob = new SupC();
        SubC ob1 = new SubC();

        SupC ref;
        ref = ob;
        ref.calculate(9, 10);
        ref = ob1;
        ref.calculate(9, 9);
    }
}
