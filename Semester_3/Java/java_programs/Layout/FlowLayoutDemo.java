package Layout;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutDemo{
    public static void main(String[] args){
        JFrame f = new JFrame();

        JLabel lbl1 = new JLabel("Hello");
        JLabel lbl2 = new JLabel("World hele boi gawd");

        f.add(lbl1);
        f.add(lbl2);


        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(400, 500);
        f.setVisible(true);
    }
}
