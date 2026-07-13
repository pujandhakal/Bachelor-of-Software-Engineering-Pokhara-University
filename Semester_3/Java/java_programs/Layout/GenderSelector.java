import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderSelector extends JFrame {
    private JLabel resultLabel;
    private JRadioButton maleBtn, femaleBtn, othersBtn;
    private ButtonGroup group;

    public GenderSelector() {
        // Setup Frame
        setTitle("Gender Selector");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        // Instructions Label
        add(new JLabel("Select Gender:"));

        // Initialize Radio Buttons
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        othersBtn = new JRadioButton("Others");

        // Group the buttons so only one can be selected
        group = new ButtonGroup();
        group.add(maleBtn);
        group.add(femaleBtn);
        group.add(othersBtn);

        // Result Label
        resultLabel = new JLabel("Gender: None");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add Action Listener to update the label
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton selected = (JRadioButton) e.getSource();
                resultLabel.setText("Gender: " + selected.getText());
            }
        };

        maleBtn.addActionListener(listener);
        femaleBtn.addActionListener(listener);
        othersBtn.addActionListener(listener);

        // Add components to frame
        add(maleBtn);
        add(femaleBtn);
        add(othersBtn);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        new GenderSelector();
    }
}