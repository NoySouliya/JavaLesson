package JGUI;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.*;
public class TJToggleButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("JFrame");
        JToggleButton t = new JToggleButton("JToggleButton");
        Container cp = f.getContentPane();
        cp.add(t);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}
