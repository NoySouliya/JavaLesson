package JGUI;
import java.awt.*;
import javax.swing.*;
public class TJCombobox {
    public static void main(String[] args){
        JFrame f=new JFrame("JFrame");
        // JComboBox cb1=new JComboBox();
        JComboBox<String> cb1 = new JComboBox<>();
        cb1.addItem("Item1");
        cb1.addItem("Item2");
        cb1.addItem("Item3");
        cb1.addItem("Item4");
        cb1.addItem("Item5");
        Container cp=f.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(cb1);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
