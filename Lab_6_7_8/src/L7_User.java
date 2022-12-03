import javax.crypto.spec.PSource;

public class L7_User {
    public static void main(String[] args) {
        try {
            System.out.println("Creating user defined exception..");
            throw new Exception("user-defined exception");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
