import java.awt.*;
class create extends Frame{
    create(){
        setVisible(true);
        setTitle("Frame using SubClass");
        setSize(400, 400);
    }
}

public class Q2_createFrame {
    public static void main(String[] args) {
        create f = new create();
    }
}
