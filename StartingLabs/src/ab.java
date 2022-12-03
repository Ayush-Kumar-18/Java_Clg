//wap a polymorphism program to find the area of rectangle ,circle,and a triangle by driving them from shape ,shape is
// a super class for rectangle ,circle and triangle and override the area method.
import java.util.Scanner;
class polymorphism {

    static void rectangle(int x, int y) {
        int area = x * y;
        System.out.println("rectangle area\n" + area);

    }
    static void triangle(int x, int y){
        double area = (1/2)*(x+y);
        System.out.println("Triangle area " +area);

    }
    static void circle(int r){
        double area = 3.14*r*r;
        System.out.println("Circle area \n" +area);
    }
}
public class ab extends polymorphism {
    public static void main(String args[]) {
        polymorphism st = new polymorphism();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length");
        int x = s.nextInt();
        System.out.println("Enter the 2nd length");
        int y = s.nextInt();
        System.out.println("Enter the radius for circle");
        int r = s.nextInt();

        System.out.println("choose \n 1.Rectangle\n 2.triangle\n 3.Circle\n");
        int key = s.nextInt();
        switch (key) {
            case 1:
                rectangle(x, y);
                break;
            case 2:
                triangle(x, y);
                break;
            case 3:
                circle(r);
                break;

            default:
                break;
        }
        s.close();
    }
}
