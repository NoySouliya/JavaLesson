package LLayout;
import java.awt.*;
public class testGridBagLayout {
    GridBagConstraints constraint;
    private void addComponent(Frame f, Component c, int x, int y, int width, int height, int fill, int a){
        constraint.gridx=x;
        constraint.gridy=y;
        constraint.gridwidth=width;
        constraint.gridheight=height;
        constraint.fill=fill;
        constraint.anchor=a;
        f.add(c,constraint);
    }
    public testGridBagLayout(){
        Frame f=new Frame("GridBagLayout");
        constraint=new GridBagConstraints();
        f.setLayout(new GridBagLayout());
        addComponent (f, new Button("1"), 0, 0, 3, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("2"), 0, 1, 2, 1, 
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("3"), 2, 1, 1, 1, 
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("4"), 0, 2, 1, 2, 
            GridBagConstraints.VERTICAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("5"), 1, 2, 1, 2, 
            GridBagConstraints.VERTICAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("6"), 2, 2, 1, 1, 
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("7"), 2, 3, 1, 1, 
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent(f, new Button("8"), 0, 4, 3, 2, 
            GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args){
        new testGridBagLayout();
    }
}
