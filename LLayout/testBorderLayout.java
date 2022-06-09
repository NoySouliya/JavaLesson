package LLayout;
import java.awt.*;
public class testBorderLayout {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Label l1=new Label("Address");
        TextField tf1=new TextField(15);
        Button b1=new Button("Save");
        f.add(l1,BorderLayout.NORTH);
        f.add(tf1, BorderLayout.CENTER);
        f.add(b1, BorderLayout.SOUTH);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
