class SClass{
    int a, b;
    void calculate(){
        System.out.println("Method of Super-Class");
    }
}
class SuClass extends SClass {
    void calculate(){
        System.out.println("Method of Sub-Class");
    }
}

public class L6_CalcM {
    public static void main(String[] args) {
        SClass f = new SClass();
        SuClass s = new SuClass();

        SClass ref;
        ref = f;
        ref.calculate();
        ref = s;
        ref.calculate();
    }
}
