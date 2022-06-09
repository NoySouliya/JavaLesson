package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login implements MouseListener {
    private TextField t;
    private Label l;

    public Login() {
        JFrame f = new JFrame();
        Panel p = new Panel();
        l = new Label("name");
        t = new TextField(15);
        Button b = new Button("login");
        b.addMouseListener(this);
        p.add(l);
        p.add(t);
        p.add(b);
        f.add(p);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        String name = t.getText();
        // System.out.println("hello "+name);
        l.setText(name);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Hello

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Hello

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Hello

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Hello

    }
}
