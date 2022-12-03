class SuperC {
    int side = 5;
    void print(){
        System.out.println("Area(in Super) = " + side*side);
    }
}
class SubC extends SuperC {
    int side = 9;
    void print(){
        System.out.println("Area(in Sub) = " + side*side);
    }
}
public class SubClassMemb {
    public static void main(String[] args) {
        SubC obj = new SubC();
        obj.print();
    }
}
