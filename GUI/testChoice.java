package GUI;
import java.awt.*;
public class testChoice {
    public static void main(String args[]){
        Frame f=new Frame("Frame");
        Choice c=new Choice();
        c.addItem("ch1");
        c.addItem("ch2");
        c.addItem("ch3");
        f.add(c,BorderLayout.NORTH);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
