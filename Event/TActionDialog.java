package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TActionDialog {
    private Button a, b, c;

    public TActionDialog() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("Show Dialog");
        a = new Button("Show");
        b = new Button("Warning");
        c = new Button("Error");
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aActionPerformed(e);
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(a);
        cp.add(b);
        cp.add(c);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void aActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hello World", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void bActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Warning, type string can not be int", "Warning",
                JOptionPane.WARNING_MESSAGE);
    }

    public void cActionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "There are some errors", "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        new TActionDialog();
    }
}
