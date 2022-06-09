package GUI;

import java.awt.*;

public class tButton {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        Button b = new Button("Button");
        Panel p = new Panel();
        b.setBackground(Color.red);
        p.setSize(100, 100);
        p.add(b);
        f.add(p);
        f.setSize(500, 100);
        p.setVisible(true);
        f.setVisible(true);
    }
}
