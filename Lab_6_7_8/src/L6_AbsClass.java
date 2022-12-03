abstract class Mycls{
    abstract void M(int side);
}
class One extends Mycls{
    public void M(int side){
        System.out.println("Area(Square): "+ side*side);
    }
}

class Two extends Mycls{
    public void M(int rad){
        System.out.println("Area(Circle): "+ 3.14*rad*rad);
    }
}

public class L6_AbsClass {
    public static void main(String[] args) {
        One ob1 = new One();
        Two ob2 = new Two();

        ob1.M(5);
        ob2.M(9);
    }
}
