package GUI;
import java.awt.*;
public class testList {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        List l=new List(5);
        l.add("list1");
        l.add("list2");
        l.add("list3");
        l.add("list4");
        l.add("list5");
        l.setBackground(Color.ORANGE);
        f.setLayout(new FlowLayout());
        f.add(l);
        f.pack();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
