package JGUI;
import java.awt.*;
import javax.swing.*;
public class TJRadioBtn {
    public static void main(String[] args){
        JFrame f=new JFrame("JFrame");
        JRadioButton r1=new JRadioButton("Male", true);
        JRadioButton r2=new JRadioButton("Female", false);
        ButtonGroup grp=new ButtonGroup();
        Container cp=f.getContentPane();
        grp.add(r1);
        grp.add(r2);
        cp.setLayout(new FlowLayout());
        cp.add(r1);
        cp.add(r2);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
