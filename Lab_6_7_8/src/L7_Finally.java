public class L7_Finally {
    public static void main(String[] args) {
        try {
            int s = 5+6;
            System.out.println("Sum: "+ s);
            String name = "Hey! How are U";
            System.out.println(name);
        }
        catch (ArithmeticException e){
            System.out.println("Exception: "+ e);
        }
        finally {
            System.out.println("No Exception");
        }
    }
}
