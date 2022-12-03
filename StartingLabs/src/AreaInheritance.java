class Shape {
    int sideL;
    int sideB;

}
class Square extends Shape {
    int AreaS(int side){
        return side*side;
    }
}
class Rectangle extends Shape {
    int areaRectangle(int len, int wi){
        return len*wi;
    }
}

public class AreaInheritance {
    public static void main(String[] args) {
        Square ob = new Square();
        ob.sideL = 10;
        System.out.println("Square Area: " + ob.AreaS(ob.sideL));

        Rectangle obj = new Rectangle();
        obj.sideB = 12;
        obj.sideL = 9;
        System.out.println("Rectangle Area: " + obj.areaRectangle(obj.sideB, obj.sideL));
    }
}
