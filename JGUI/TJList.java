package JGUI;
import java.awt.*;
import javax.swing.*;
public class TJList {
    public static void main(String[] args){
        String [] myList = {"Item1", "Item2", "Item3", "Item4", "Item5"};
        JFrame f=new JFrame("JFrame");
        JList<String> l1=new JList<>(myList);
        l1.setSelectedIndex(0);
        Container cp=f.getContentPane();
        cp.add(l1);
        f.setSize(150, 150);
        f.setVisible(true);
    }
}
