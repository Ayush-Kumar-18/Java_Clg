class Sample {
    void area(int s){
        System.out.println("Area(Square): "+ s*s);
    }
    void area(float a){
        System.out.println("Area(Square with float): "+ a*a);
    }
}
public class L6_SampleC {
    public static void main(String[] args) {
        Sample ob = new Sample();
        ob.area(3);
        ob.area(5.3f);
    }
}
