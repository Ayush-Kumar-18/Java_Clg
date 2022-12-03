import javax.swing.*;

public class Q6_checkBoxes {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("CheckBoxes");
        f.setSize(400, 400);
        f.setVisible(true);

        JCheckBox c1 = new JCheckBox("bold");
        JCheckBox c2 = new JCheckBox("italics");
        JCheckBox c3 = new JCheckBox("underline");
        c1.setBounds(100, 100, 100, 50);
        c2.setBounds(100, 150, 100, 50);
        c3.setBounds(100, 200, 100, 50);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setLayout(null);
    }
}
