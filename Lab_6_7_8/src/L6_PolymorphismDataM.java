class S1{
    int m = 320;
//    void print(){
//        System.out.println("ma");
//    }
}
class S2 extends S1{
    int m = 234;
//    void print(){
//        System.out.println("a");
//    }
}
public class L6_PolymorphismDataM {
    public static void main(String[] args) {
        S1 ob = new S2();
        System.out.println(ob.m);//data member of sub-class can't be accessed
//        ob.print();

    }
}
