package GUI;
import java.awt.*;
public class tLabel {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Label l=new Label("Label");
        l.setBackground(Color.lightGray);
        f.add(l);
        f.setSize(500,100);
        f.setVisible(true);
    }
}
