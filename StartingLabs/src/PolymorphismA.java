class Sh{
    int m;
    int n;
    double r;
    void area(){
        System.out.println("Super Class");
    }
}
class RecA extends Sh{
    RecA(int length, int width){
        m = length;
        n = width;
    }
    void area(){
        System.out.println("Area (Rectangle): " + m*n);
    }
}
class Circle extends Sh{
    Circle(double radius){
        r= radius;
    }
    void area(){
        System.out.println("Area (Circle): "+ 3.14*r*r);
    }
}
class Tri extends Sh{
    Tri(int base, int height){
        m = base;
        n = height;
    }
    void area(){
        System.out.println("Area (Triangle): "+ 0.5*m*n);
    }
}

public class PolymorphismA {
    public static void main(String[] args) {
        RecA ob1 = new RecA(3, 7);
        Circle ob2 = new Circle(5);
        Tri ob3 = new Tri(2, 8);
        ob1.area();
        ob2.area();
        ob3.area();
    }
}
