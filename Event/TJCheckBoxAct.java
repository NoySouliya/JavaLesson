package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TJCheckBoxAct {
    private JButton b;
    private JCheckBox cb1, cb2, cb3;
    private String n;

    public TJCheckBoxAct() {
        JFrame f = new JFrame("JFrame");
        cb1 = new JCheckBox("Java");
        cb1.setActionCommand("Java");
        cb2 = new JCheckBox("C++");
        cb2.setActionCommand("C++");
        cb3 = new JCheckBox("C#");
        cb3.setActionCommand("C#");
        b = new JButton("Show");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(cb1);
        cp.add(cb2);
        cp.add(cb3);
        cp.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            n = "";
            if (cb1.isSelected()) {
                n = cb1.getActionCommand();
            } else if (cb2.isSelected()) {
                n = cb2.getActionCommand();
            } else if (cb3.isSelected()) {
                n = cb3.getActionCommand();
            } else {
                n = cb1.getActionCommand() + " " + cb2.getActionCommand() + " " + cb3.getActionCommand();
            }
            JOptionPane.showMessageDialog(null, n, "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new TJCheckBoxAct();
    }
}
