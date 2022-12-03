class ThisKey{
    int a, b;
    ThisKey(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Using_ThisK {
    public static void main(String[] args) {
        ThisKey obj = new ThisKey(4,5);
        System.out.println("Using this keyword, a is " + obj.a + " & b is " + obj.b);
    }
}
