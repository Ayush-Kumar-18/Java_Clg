class outerC{
    private class innerC {
        void check(){
            System.out.println("Private Inner Class");
        }
    }
    void display() {
        innerC ob = new innerC();
        ob.check();
    }
}

public class Q3_PrivateInner{
    public static void main(String[] args) {
        outerC ob = new outerC();
        ob.display();
    }
}
