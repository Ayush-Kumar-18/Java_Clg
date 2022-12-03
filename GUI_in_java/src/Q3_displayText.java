import java.awt.*;

public class Q3_displayText extends Frame{
    public static void main(String[] args) {
        Q3_displayText ft = new Q3_displayText();
        ft.setVisible(true);
        ft.setSize(400, 400);
        ft.setTitle("Frame for Text");
        ft.setBackground(Color.blue);
    }
    public void paint(Graphics g){
        g.drawString("Hii! welcome to my Frame", 100, 100);
    }
}
