class Hii {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Hi!");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Exception");
        }
    }
}
class Hello {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Hello!");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread Exception");
        }
    }
}
public class L8_1_HandH {
    public static void main(String[] args) {
        Hii t1 = new Hii();
        Hello t2 = new Hello();
        t1.run();
        t2.run();
    }
}
