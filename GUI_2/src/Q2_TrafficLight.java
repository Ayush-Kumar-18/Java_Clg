/*Write a java program that simulates a traffic light.
 The program lets the user select one of three lights: Red, Yellow or Green with radio buttons.
 On selecting a button an appropriate message with “STOP” or “READY” or ”GO”
 should appear above the buttons in selected color. Initially, there is no message shown.
 */

import java.awt.*;
import java.awt.event.*;

public class Q2_TrafficLight extends Frame implements ItemListener {
    Label l1, l2, l3;
    CheckboxGroup cGroup;
    Checkbox c1, c2, c3;
    Q2_TrafficLight(){
        setSize(400, 500);
        setVisible(true);
        setLayout(null);
        cGroup = new CheckboxGroup();
        setTitle("TrafficLight");
        c1 = new Checkbox("Red", cGroup, false); c1.setBounds(30, 100, 100, 30);
        c2 = new Checkbox("Yellow", cGroup, false); c2.setBounds(30, 200, 100, 30);
        c3 = new Checkbox("Green", cGroup, false); c3.setBounds(30, 300, 100, 30);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(c1);
        add(c2);
        add(c3);

        l1 = new Label(); l1.setBounds(60, 60, 100, 40); add(l1);
        l2 = new Label(); l2.setBounds(60, 160, 100, 40); add(l2);
        l3 = new Label(); l3.setBounds(60,260, 100, 40); add(l3);
    }

    public void itemStateChanged(ItemEvent e) {
        if (c1.getState()){
            l1.setForeground(Color.red);
            l1.setText("Stop");
            l3.setText(null);
            l2.setText(null);
        }
        if (c2.getState()){
            l2.setForeground(Color.yellow);
            l2.setText("Ready");
            l3.setText(null);
            l1.setText(null);
        }
        if (c3.getState()){
            l3.setForeground(Color.green);
            l3.setText("Go");
            l1.setText(null);
            l2.setText(null);
        }
    }

    public static void main(String[] args) {
        new Q2_TrafficLight();
    }
}
