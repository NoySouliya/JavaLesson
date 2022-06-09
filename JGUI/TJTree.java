package JGUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class TJTree {
    public static void main(String[] args){
        JFrame f=new JFrame("JFrame");
        JPanel p=new JPanel();
        p.setLayout(new BorderLayout());
        f.getContentPane().add(p);
        
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("root");
        root.add(new DefaultMutableTreeNode("child1"));
        root.add(new DefaultMutableTreeNode("child2"));
        root.add(new DefaultMutableTreeNode("child3"));

        DefaultMutableTreeNode nexsiz=new DefaultMutableTreeNode("nexsiz");
        nexsiz.add(new DefaultMutableTreeNode("noy1"));
        nexsiz.add(new DefaultMutableTreeNode("noy2"));

        DefaultMutableTreeNode souliya=new DefaultMutableTreeNode("souliya");
        souliya.add(root);
        souliya.add(nexsiz);

        DefaultTreeModel myTree=new DefaultTreeModel(souliya);
        JTree t=new JTree(myTree);
        JScrollPane sc=new JScrollPane();
        sc.getViewport().add(t);
        p.add(sc, BorderLayout.CENTER);
        f.setSize(300, 500);
        f.setBackground(Color.red);
        f.setVisible(true);
    }
}
