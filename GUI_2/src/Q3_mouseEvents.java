//Write a java program that handles all mouse events and shows the event name at the center of the window when a mouse event is fired. Use adapter classes.

import java.awt.*;
import java.awt.event.*;

public class Q3_mouseEvents extends Frame implements MouseListener {
    Label l;
    Q3_mouseEvents(){
        setSize(500, 600);
        setVisible(true);
        setTitle("MouseEvents");
        setLayout(null);
        l = new Label();
        l.setBounds(20, 50 , 100, 30 );
        add(l);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.pink);
        g.fillOval(e.getX(), e.getY(), 20, 20);
        System.out.println("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.yellow);
        g.fillRect(e.getX(), e.getY(), 20, 20);
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new Q3_mouseEvents();
    }
}
