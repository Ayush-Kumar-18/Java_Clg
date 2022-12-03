abstract class AM{
    AM (){
        System.out.println("Constructor in abstract class");
    }
    void print(){
        System.out.println("This is in Super Abstract class");
    }
    abstract void printInSub();
}
class PM extends AM{
    void printInSub(){
        System.out.println("The sub-class");
    }
}

public class AbstractCwithConstructor {
    public static void main(String[] args) {
        AM obj = new PM();
        obj.print();
        obj.printInSub();
    }
}
