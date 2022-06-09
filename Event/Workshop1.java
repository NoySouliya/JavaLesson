package Event;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Workshop1 {
    private Button b;
    private ButtonGroup bg;
    private JTextField tf1, tf2, tf3;
    private String n;

    public Workshop1() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("x:");
        JLabel l2 = new JLabel("    y:");
        JLabel l3 = new JLabel("Operator");
        JLabel l4 = new JLabel("Display");
        JLabel l5 = new JLabel("==========================");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        tf3 = new JTextField(15);
        JRadioButton plus = new JRadioButton("+");
        plus.setActionCommand("+");
        JRadioButton minus = new JRadioButton("-");
        minus.setActionCommand("-");
        JRadioButton multiply = new JRadioButton("*");
        multiply.setActionCommand("*");
        JRadioButton divide = new JRadioButton("/");
        divide.setActionCommand("/");
        bg = new ButtonGroup();
        bg.add(plus);
        bg.add(minus);
        bg.add(multiply);
        bg.add(divide);
        b = new Button("Show");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(tf1);
        cp.add(l2);
        cp.add(tf2);
        cp.add(l3);
        cp.add(plus);
        cp.add(minus);
        cp.add(multiply);
        cp.add(divide);
        cp.add(l5);
        cp.add(l4);
        cp.add(tf3);
        cp.add(b);
        f.setSize(200, 400);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            n = bg.getSelection().getActionCommand();
        }
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        double c = 0;
        if (n.equals("+")) {
            c = a + b;
        } else if (n.equals("-")) {
            c = a - b;
        } else if (n.equals("*")) {
            c = a * b;
        } else if (n.equals("/")) {
            c = a / b;
        }
        tf3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new Workshop1();
    }
}
