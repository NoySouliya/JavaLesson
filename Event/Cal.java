package Event;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Cal {
    private JTextField t1, t2, t3;
    // private JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, ac, c, plus, minus,
    // mul, div, dot, equal;
    private JTextArea ta;

    GridBagConstraints constraints;

    private void addComponent(Frame f, Component c, int x, int y, int w, int h, int fill, int a) {
        constraints.gridx = x;
        constraints.gridy = y;
        constraints.gridwidth = w;
        constraints.gridheight = h;
        constraints.fill = fill;
        constraints.anchor = a;
        f.add(c, constraints);
    }

    public Cal() {
        JFrame f = new JFrame("Hello");
        JLabel l = new JLabel("Name: ");
        JLabel l2 = new JLabel("Surname: ");
        JLabel l3 = new JLabel("Age: ");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        t3 = new JTextField(15);
        ta = new JTextArea(5, 15);
        t3.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                t3KeyPressed(e);
            }
        });
        constraints = new GridBagConstraints();
        f.setLayout(new GridBagLayout());
        addComponent(f, l, 0, 0, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.WEST);
        addComponent(f, t1, 2, 0, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, l2, 0, 1, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, t2, 2, 1, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, l3, 0, 2, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, t3, 2, 2, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, ta, 2, 3, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        f.setSize(270, 200);
        f.setVisible(true);
    }

    private void t3KeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            ta.append("My name is" + t1.getText() + "\n" + "My family name is" + t2.getText() + "\n" + "I am "
                    + t3.getText() + "\n" + "years old");
        }
    }
}
