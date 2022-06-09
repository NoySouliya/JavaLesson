package GUI;
import java.awt.*;
public class testCheckbox {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Checkbox cb=new Checkbox("Checkbox",true);
        Checkbox cb2=new Checkbox("Checkbox2",false);
        Checkbox cb3=new Checkbox("Checkbox3",false);
        f.setLayout(new FlowLayout());
        f.add(cb);
        f.add(cb2);
        f.add(cb3);
        f.setSize(500,100);
        f.setVisible(true);
    }
}
