package Event;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Workshop2 {
    private JButton b;
    private ButtonGroup bg;
    private JComboBox<String> cob;
    private JCheckBox cb1, cb2, cb3;
    private JTextField tf1, tf2;

    public Workshop2() {
        JFrame f = new JFrame("JFrame");
        JLabel l = new JLabel("Name:");
        JLabel l2 = new JLabel("Surname:");
        JLabel l3 = new JLabel("Gender:");
        JLabel l4 = new JLabel("Year born:");
        JLabel l5 = new JLabel("     Degree:");
        cob = new JComboBox<String>();
        cob.addItem("1997");
        cob.addItem("1998");
        cob.addItem("1999");
        cob.addItem("2000");
        cob.addItem("2001");
        cob.addItem("2002");
        cb1 = new JCheckBox("Professor");
        cb1.setActionCommand("Professor");
        cb2 = new JCheckBox("Master");
        cb2.setActionCommand("Master");
        cb3 = new JCheckBox("DR");
        cb3.setActionCommand("DR");
        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        JRadioButton rMale = new JRadioButton("Male");
        rMale.setActionCommand("Male");
        JRadioButton rFemale = new JRadioButton("Female");
        rFemale.setActionCommand("Female");
        bg = new ButtonGroup();
        bg.add(rMale);
        bg.add(rFemale);
        b = new JButton("Show");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bActionPerformed(e);
            }
        });
        Container cp = f.getContentPane();
        f.setLayout(new FlowLayout());
        cp.add(l);
        cp.add(tf1);
        cp.add(l2);
        cp.add(tf2);
        cp.add(l3);
        cp.add(rMale);
        cp.add(rFemale);
        cp.add(l4);
        cp.add(cob);
        cp.add(l5);
        cp.add(cb1);
        cp.add(cb2);
        cp.add(cb3);
        cp.add(b);
        f.setSize(200, 400);
        f.setVisible(true);
    }

    public void bActionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            String n = tf1.getText();
            String s = tf2.getText();
            String g = bg.getSelection().getActionCommand();
            String cg = cob.getSelectedItem().toString();
            String d = "";
            if (cb1.isSelected()) {
                d = d + "Professor ";
            }
            if (cb2.isSelected()) {
                d = d + "Master ";
            }
            if (cb3.isSelected()) {
                d = d + "DR ";
            }
            JOptionPane.showMessageDialog(null,
                    "Name: " + n + "\nSurname: " + s + "\nGender: " + g + "\nYear born: " + cg + "\nDegree: " + d);
        }

    }

    public static void main(String[] args) {
        new Workshop2();
    }
}
