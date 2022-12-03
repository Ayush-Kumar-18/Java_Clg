class AThread implements Runnable{
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.println("First Thread");
            }
        }
        catch (InterruptedException e){
            System.out.println("Exception");
        }
    }
}

class BThread implements Runnable{
    public void run(){
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500);
                System.out.println("Second Thread");
            }
        }
        catch (InterruptedException e){
            System.out.println("Exception");
        }
    }
}

public class L8_2_RI {
    public static void main(String[] args) {
        AThread t1 = new AThread();
        BThread t2 = new BThread();
        Thread One = new Thread(t1);
        Thread Two = new Thread(t2);
        One.start();
        Two.start();
    }
}
