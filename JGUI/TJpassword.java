package JGUI;
import java.awt.*;
import javax.swing.*;

public class TJpassword {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JLabel l1 = new JLabel("This is JPassword Field");
        JPasswordField pwd = new JPasswordField("pwd",10);
        Container cp = f.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(l1);
        cp.add(pwd);
        f.setSize(150, 150);
        f.setVisible(true);
    }
}
