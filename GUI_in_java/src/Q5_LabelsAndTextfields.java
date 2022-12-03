import javax.swing.*;

public class Q5_LabelsAndTextfields {
    public static void main(String[] args) {
        JFrame f  = new JFrame();
        f.setTitle("Labels & TextF");
        f.setSize(500, 400);

        JLabel l1 = new JLabel("Name : ");
        JTextField tN = new JTextField();
        JLabel l2 = new JLabel("Password : ");
        JPasswordField tP = new JPasswordField();

        l1.setBounds(20, 80, 60, 20);
        tN.setBounds(80, 80, 80, 20);
        l2.setBounds(20, 130, 80, 20);
        tP.setBounds(100, 130, 80, 20);
        f.add(l2);
        f.add(tP);
        f.add(l1);
        f.add(tN);
        f.setLayout(null);
        f.setVisible(true);
    }
}
