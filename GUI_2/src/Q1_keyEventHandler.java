import java.awt.*;
import java.awt.event.*;

//Write a java program to demonstrate the key event handlers.
class myFr extends Frame {
    myFr(){
        setVisible(true);
        setSize(400, 500);
        setBackground(Color.orange);
        setTitle("KeyEventHandler");
        addKeyListener(new keyboardimpl());
    }
}
class keyboardimpl implements KeyListener {
    public void keyTyped(KeyEvent e)
    {
        System.out.println("key typed "+e.getKeyChar());
    }
    public void keyPressed(KeyEvent e)
    {
        System.out.println("key pressed "+e.getKeyChar());
    }
    public void keyReleased(KeyEvent e)
    {
        System.out.println("key released "+e.getKeyChar());
    }
}

public class Q1_keyEventHandler {
    public static void main(String[] args) {
        myFr f = new myFr();
    }
}
