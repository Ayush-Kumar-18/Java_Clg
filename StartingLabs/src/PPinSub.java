class SCl{
    private int a = 5;
    protected int s = 9;
}

public class PPinSub extends SCl{
    public static void main(String[] args) {
        PPinSub ob = new PPinSub();
//        System.out.println("private:" + ob.a);
        System.out.println("protected: " + ob.s);
    }
}
