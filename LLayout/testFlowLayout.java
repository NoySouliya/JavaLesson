package LLayout;
import java.awt.*;
public class testFlowLayout {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Label l1=new Label("Label1");
        TextField tf1=new TextField(15);
        Button b1=new Button("Button1");
        Panel p=new Panel();
        p.add(l1);
        p.add(tf1);
        p.add(b1);
        f.add(p);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
