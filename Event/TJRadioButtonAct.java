package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TJRadioButtonAct {
    private Button b;
    private ButtonGroup bg;
    private String n;

    public TJRadioButtonAct() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("Gender");
        JRadioButton rMale = new JRadioButton("Male");
        rMale.setActionCommand("Male");
        JRadioButton rFemale = new JRadioButton("Female");
        rFemale.setActionCommand("Female");
        bg = new ButtonGroup();
        bg.add(rMale);
        bg.add(rFemale);
        b = new Button("Show");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(rMale);
        cp.add(rFemale);
        cp.add(b);
        f.setSize(200, 150);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            n = bg.getSelection().getActionCommand();
        }
        JOptionPane.showMessageDialog(null, "You are a " + n, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new TJRadioButtonAct();
    }
}
