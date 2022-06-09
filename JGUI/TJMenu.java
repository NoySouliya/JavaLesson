package JGUI;
// import java.awt.*;
import javax.swing.*;
public class TJMenu {
    public static void main(String[] args){
        JFrame f=new JFrame("JFrame");
        JMenuBar mb=new JMenuBar();
        f.setJMenuBar(mb);
        JMenu fileMenu=new JMenu("File");
        mb.add(fileMenu);
        JMenuItem openItem=new JMenuItem("Open");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        JMenuItem exitItem=new JMenuItem("Exit");
        fileMenu.add(exitItem);
        JMenu editMenu=new JMenu("Edit");
        mb.add(editMenu);
        JMenuItem cutItem=new JMenuItem("Cut");
        editMenu.add(cutItem);
        JMenuItem copyItem=new JMenuItem("Copy");
        editMenu.add(copyItem);
        JMenuItem pasteItem=new JMenuItem("Paste");
        editMenu.add(pasteItem);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
