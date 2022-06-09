package Event;

import javax.swing.*;

public class Window1 {
    public static void show() {
        JFrame f = new JFrame("Window2");
        JLabel l = new JLabel("Window2");
        f.add(l);
        f.pack();
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        show();
    }
}
