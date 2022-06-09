package JGUI;
import javax.swing.*;
import java.awt.*;
public class TJbutton {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JButton b1 = new JButton("OK");
        Container cp = f.getContentPane();
        cp.add(b1);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
