class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 4; i++) {
            System.out.println("MyThread: " + i);
        }
    }
}

public class L8_4_MyT {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread ob = new Thread(t);
        ob.start();
    }
}
