class First {
    First(){
        System.out.println("This is Super CLass");
    }
}
class Second_sub extends First{
    Second_sub(){
        System.out.println("This is Sub Class ");
    }
}

public class DefaultC {
    public static void main(String[] args) {
        Second_sub obj = new Second_sub();
    }
}
