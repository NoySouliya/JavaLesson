package JGUI;
import java.awt.*;
import javax.swing.*;
public class TLabelnTextfield {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JLabel l1 = new JLabel("Name and Surname");
        JTextField t1 = new JTextField("",20);
        Container cp = f.getContentPane();
        cp.add(l1, BorderLayout.WEST);
        cp.add(t1, BorderLayout.EAST);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
