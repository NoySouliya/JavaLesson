package JGUI;
import javax.swing.*;
import java.awt.*;
public class Tjdialog {
    public static void main(String[] args) {
        JDialog d = new JDialog();
        d.setTitle("JDialog");
        d.setSize(500, 200);
        d.setLocation(300, 200);
        JPanel p = new JPanel();
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        d.getContentPane().add(p);
        d.setVisible(true);
    }
}
