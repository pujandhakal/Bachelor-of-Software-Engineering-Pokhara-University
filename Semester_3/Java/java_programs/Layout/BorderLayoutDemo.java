package Layout;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class BorderLayoutDemo {
    public static void main(String[] args){
        JFrame f = new JFrame();

        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");

        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2, BorderLayout.SOUTH);
        f.add(btn3, BorderLayout.EAST);
        f.add(btn4, BorderLayout.WEST);
        f.add(btn5, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
