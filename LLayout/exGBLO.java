package LLayout;
import java.awt.*;
public class exGBLO {
    GridBagConstraints constraint;
    private void addComponent(Frame f, Component c, int x, int y, int width, int height, int fill, int a){
        constraint.gridx=x;
        constraint.gridy=y;
        constraint.gridwidth=width;
        constraint.gridheight=height;
        constraint.fill=fill;
        constraint.anchor=a;
        f.add(c, constraint);
    }
    public exGBLO(){
        Frame f=new Frame("Hello");
        constraint=new GridBagConstraints();
        f.setLayout(new GridBagLayout());
        Label l=new Label("Name: ");
        addComponent (f, l, 0, 0, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, new TextField("", 20), 1, 0, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, new Label("Surname: "), 0, 1, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, new TextField("", 20), 1, 1, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, new Label("Age: "), 0, 2, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, new TextField("", 20), 1, 2, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, new Label("Address: "), 0, 3, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.NORTH);
        addComponent (f, new TextArea("", 5,20), 1, 3, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, new Button("Save"), 1, 4, 1, 1,
            GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args){
        new exGBLO();
    }
}
