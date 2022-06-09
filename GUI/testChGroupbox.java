package GUI;
import java.awt.*;

public class testChGroupbox {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb=new Checkbox("Checkbox",true,cbg);
        Checkbox cb2=new Checkbox("Checkbox2",false,cbg);
        Checkbox cb3=new Checkbox("Checkbox3",false,cbg);
        Checkbox cb4=new Checkbox("Checkbox4",false,cbg);
        f.setLayout(new FlowLayout());
        f.add(cb);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.setSize(500,100);
        f.setVisible(true);
    }
}
