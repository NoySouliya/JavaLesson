package JGUI;
import java.awt.*;
import javax.swing.*;
public class TJTextArea {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JTextArea t1 = new JTextArea("Hello World!",5,20);
        t1.setBackground(Color.BLUE);
        Container cp = f.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(t1);
        f.pack();
        f.setVisible(true);
    }
}
