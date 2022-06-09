package LLayout;
import java.awt.*;
public class testGridLayout {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Label l=new Label("name");
        TextField t=new TextField(15);
        Button b=new Button("Login");
        f.setLayout(new GridLayout(2,2));
        f.add(l);
        f.add(t);
        f.add(b);
        f.pack();
        f.setVisible(true);
    }
}
