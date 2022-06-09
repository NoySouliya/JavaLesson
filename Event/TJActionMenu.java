package Event;

import java.awt.event.*;
import javax.swing.*;

public class TJActionMenu {
    JFrame f = new JFrame("Main JFrame");
    JFrame f2 = new JFrame("Sub JFrame");

    public TJActionMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Open");
        mb.add(m1);
        f.setJMenuBar(mb);
        JMenuItem frame = new JMenuItem("Open Frame");
        m1.add(frame);
        frame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // f2.setVisible(true);
                Window1.show();
                f.dispose();
            }
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);
        f2.setSize(300, 300);
        JLabel l = new JLabel("Frame2");
        f2.add(l);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TJActionMenu();
    }
}
