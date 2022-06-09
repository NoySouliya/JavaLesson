package GUI;
import java.awt.*;
public class tPanel {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Panel p=new Panel();
        p.setBackground(Color.MAGENTA);
        p.setSize(100,50);
        f.setBackground(Color.BLACK);
        f.setSize(400, 100);
        f.setLayout(null);
        f.add(p);
        f.setVisible(true);
    }
}
