class FThread implements Runnable{
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("First Thread");
        }
    }
}

class SThread implements Runnable{
    public void run(){
        for (int i = 0; i < 2; i++) {
            System.out.println("Second Thread");
        }
    }
}

public class L8_5_isAlive {
    public static void main(String[] args) {
        FThread ob1 = new FThread();
        SThread ob2 = new SThread();
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);
        t1.start();
        t2.start();
        System.out.println("Thread 2 is Alive?? "+ t2.isAlive());
        System.out.println("Thread 1 is Alive?? "+ t1.isAlive());
    }
}
