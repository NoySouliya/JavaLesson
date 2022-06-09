package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    private JTextField t1, t2, t3;
    private JButton b1, b2, b3, b4;

    public Calculator() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("x: ");
        JLabel l2 = new JLabel("y: ");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(t1);
        cp.add(l2);
        cp.add(t2);
        cp.add(b1);
        cp.add(b2);
        cp.add(b3);
        cp.add(b4);
        cp.add(t3);
        f.setSize(190, 300);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        String a = t1.getText();
        String b = t2.getText();
        double value = Double.parseDouble(a);
        double value2 = Double.parseDouble(b);
        if (e.getSource() == b1) {
            t3.setText(String.valueOf(value + value2));
        } else if (e.getSource() == b2) {
            t3.setText(String.valueOf(value - value2));
        } else if (e.getSource() == b3) {
            t3.setText(String.valueOf(value * value2));
        } else if (e.getSource() == b4) {
            t3.setText(String.valueOf(value / value2));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
