public class L7_Unchecked {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2};
            System.out.println(a[90]);
            System.out.println("this will not print");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: " + e);
        }
        System.out.println("printing after the exception");
    }
}
