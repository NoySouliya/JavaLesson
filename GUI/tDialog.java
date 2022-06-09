package GUI;
import java.awt.*;
public class tDialog {
    public static void main(String[] args){
        Frame f=new Frame("Frame");
        Dialog d=new Dialog(f,"Dialog",true);
        Label l=new Label("Label Show on Dialog");
        d.add(l);
        d.pack();
        f.setSize(500, 500);
        f.setVisible(true);
        d.setVisible(true);
    }
}
