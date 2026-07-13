package MenuElement;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(save);
        file.add(exit);

        menuBar.add(file);

        f.setJMenuBar(menuBar);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);



    }
}
