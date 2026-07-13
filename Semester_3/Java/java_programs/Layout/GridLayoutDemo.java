package Layout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class GridLayoutDemo {
    public static void main(String[] args){
        JFrame j = new JFrame();

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");

        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);

        j.setLayout(new GridLayout(2,2,10, 10));
        j.setSize(300, 300);
        j.setVisible(true);
    }
}
