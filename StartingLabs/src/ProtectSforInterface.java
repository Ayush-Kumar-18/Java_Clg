class A {
    protected interface M{
        void print();
    }
}
class B implements A.M{
    public void print(){
        System.out.println("This is Nested Interface");
    }
}

public class ProtectSforInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
    }
}
