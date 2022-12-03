
public class UseStaticMethod {
    public static void main(String[] args) {
        int ans = add(4,5);
        System.out.println("Addition: "+ ans);
    }
    static int add(int a, int b){
        return a+b;
    }
}
