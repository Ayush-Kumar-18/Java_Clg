class MyClass {
    void calculate(int side){
        System.out.println("Area with side "+ side+ " is: "+ side*side);
    }
}
public class L6_ObjCalc {
    public static void main(String[] args) {
        MyClass ob1 = new MyClass();
        MyClass ob2 = new MyClass();
        MyClass ob3 = new MyClass();
        ob1.calculate(3);
        ob2.calculate(9);
        ob3.calculate(11);
    }
}
