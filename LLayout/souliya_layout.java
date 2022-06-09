package LLayout;
import java.awt.*;
public class souliya_layout {
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
    public souliya_layout(){
        Frame f=new Frame("Hello");
        constraint=new GridBagConstraints();
        f.setLayout(new GridBagLayout());
        Label n=new Label("Name: ");
        // Label ss=new Label("");
        Label s=new Label("Surname: ");
        Label gen=new Label("Gender: ");
        Label age=new Label("Age: ");
        Label adr=new Label("Address: ");
        Label na=new Label("Nation: ");
        Label re=new Label("Religion:");
        n.setForeground(Color.RED);
        s.setForeground(Color.RED);
        gen.setForeground(Color.RED);
        age.setForeground(Color.RED);
        adr.setForeground(Color.RED);
        na.setForeground(Color.RED);
        re.setForeground(Color.RED);
        TextField txt=new TextField("", 20);
        TextField txt2=new TextField("", 20);
        TextField txt3=new TextField("", 20);
        TextArea txt4=new TextArea("", 5,20);
        Checkbox cb=new Checkbox("Male",true);
        Checkbox cb2=new Checkbox("Female",false);
        Choice c=new Choice();
        c.addItem("Laos");
        c.addItem("Thailand");
        c.addItem("Vietnam");
        List list=new List(3);
        list.add("Buddhism");
        list.add("Christianity");
        list.add("Islam");
        Button b=new Button("Save");
        b.setBackground(Color.RED);
        b.setForeground(Color.GREEN);

        // addComponent (f, ss, 3, 0, 1, 1,
        // GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, n, 0, 0, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, txt, 1, 0, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, s, 0, 1, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, txt2, 1, 1, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        
        addComponent (f, gen, 0, 2, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, cb, 1, 2, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, cb2, 2, 2, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, age, 0, 3, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, txt3, 1, 3, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, adr, 0, 4, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.NORTH);
        addComponent (f, txt4, 1, 4, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, na, 0, 5, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
        addComponent (f, c, 1, 5, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);
            
        addComponent (f, re, 0, 6, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.NORTH);
        addComponent (f, list, 1, 6, 1, 1,
            GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER);

        addComponent (f, b, 1, 7, 1, 1,
            GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        
        f.pack();
        f.setVisible(true);
    }
    public static void main(String[] args){
        new souliya_layout();
    }
}
