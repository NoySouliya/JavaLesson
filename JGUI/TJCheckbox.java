package JGUI;
import java.awt.*;
import javax.swing.*;
public class TJCheckbox {
    public static void main(String [] args){
        JFrame f=new JFrame("JFrame");
        JCheckBox ch1=new JCheckBox("ch1", true);
        JCheckBox ch2=new JCheckBox("ch2", false);
        JCheckBox ch3=new JCheckBox("ch3", false);
        Container cp=f.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(ch1);
        cp.add(ch2);
        cp.add(ch3);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
