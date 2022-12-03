import javax.swing.*;
import java.awt.*;
public class Q4_imageInsert extends JFrame {
    JFrame f;
    ImageIcon imgIcon;
    JLabel display;
    Q4_imageInsert(){
        f = new JFrame("Display Image");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imgIcon = new ImageIcon(getClass().getResource("img.png"));
        display = new JLabel(imgIcon);
        f.add(display);
        display.setSize(400, 400);
        f.setSize(600, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
         new Q4_imageInsert();
    }
}
