interface A1 {
    interface A2{
        void print();
    }
}
class Printing implements A1.A2 {
    public void print(){
        System.out.println("Nesting Interface");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Printing ob = new Printing();
        ob.print();
    }
}
