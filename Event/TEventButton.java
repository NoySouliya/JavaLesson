package Event;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TEventButton {
    private JTextField t1, t2;
    private JButton b;

    public TEventButton() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("name: ");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b = new JButton("Click");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(t1);
        cp.add(b);
        cp.add(t2);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        String a = t1.getText();
        t2.setText(a);
    }

    public static void main(String[] args) {
        new TEventButton();
    }
}
