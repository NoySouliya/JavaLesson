package JGUI;
import javax.swing.*;
import java.awt.*;
public class TJwindow {
    public static void main(String[] args) {
        JLabel l = new JLabel("Hello World");
        JWindow w = new JWindow();
        Container cp = w.getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(l);
        w.pack();
        w.setVisible(true);
    }
}
