package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TJComboBoxAct {
    private JButton b;
    private JComboBox<String> cb;
    private String n;
    JFrame f;

    public TJComboBoxAct() {
        f = new JFrame("JFrame");
        cb = new JComboBox<String>();
        cb.addItem("Java");
        cb.addItem("C++");
        cb.addItem("C#");
        cb.addItem("Python");
        b = new JButton("Show");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(cb);
        cp.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        n = cb.getSelectedItem().toString();
        JOptionPane.showMessageDialog(null, "You are choosing " + n, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new TJComboBoxAct();
    }
}
