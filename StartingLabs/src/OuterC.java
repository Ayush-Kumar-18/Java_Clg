class OC{
    private class IC{
        void print() {
            System.out.println("This is inner private class");
        }
    }
    void display(){
        IC ob = new IC();
        ob.print();
    }
}

public class OuterC {
    public static void main(String[] args) {
        OC obj = new OC();
        obj.display();
    }
}
