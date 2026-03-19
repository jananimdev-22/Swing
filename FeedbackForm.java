import javax.swing.*;
import java.awt.event.*;

public class FeedbackForm implements ActionListener {

    JFrame f;
    JTextField name;
    JTextArea feedback, output;
    JRadioButton r1, r2, r3;
    JCheckBox c1, c2, c3;
    JButton submit;

    FeedbackForm() {
        f = new JFrame("Feedback Form");
        f.setSize(500, 500);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        name = new JTextField();
        name.setBounds(150, 50, 150, 30);
        f.add(name);

        JLabel l2 = new JLabel("Feedback:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        feedback = new JTextArea();
        JScrollPane sp = new JScrollPane(feedback);
        sp.setBounds(150, 100, 200, 80);
        f.add(sp);

        JLabel l3 = new JLabel("Rating:");
        l3.setBounds(50, 200, 100, 30);
        f.add(l3);

        r1 = new JRadioButton("Good");
        r2 = new JRadioButton("Average");
        r3 = new JRadioButton("Poor");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        r1.setBounds(150, 200, 80, 30);
        r2.setBounds(230, 200, 100, 30);
        r3.setBounds(330, 200, 80, 30);

        f.add(r1);
        f.add(r2);
        f.add(r3);

        JLabel l4 = new JLabel("Suggestions:");
        l4.setBounds(50, 250, 100, 30);
        f.add(l4);

        c1 = new JCheckBox("Improve UI");
        c2 = new JCheckBox("Add Features");
        c3 = new JCheckBox("Fast Service");

        c1.setBounds(150, 250, 120, 30);
        c2.setBounds(150, 280, 120, 30);
        c3.setBounds(150, 310, 120, 30);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        submit = new JButton("Submit");
        submit.setBounds(150, 360, 100, 30);
        f.add(submit);

        output = new JTextArea();
        output.setBounds(200, 400, 350, 200);
        f.add(output);

        submit.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String n = name.getText();
        String fb = feedback.getText();

        String rating = "";
        if (r1.isSelected()) rating = "Good";
        if (r2.isSelected()) rating = "Average";
        if (r3.isSelected()) rating = "Poor";

        String sug = "";
        if (c1.isSelected()) sug += "Improve UI ";
        if (c2.isSelected()) sug += "Add Features ";
        if (c3.isSelected()) sug += "Fast Service ";

        output.setText(
            "Name: " + n +
            "\nFeedback: " + fb +
            "\nRating: " + rating +
            "\nSuggestions: " + sug
        );
    }

    public static void main(String[] args) {
        new FeedbackForm();
    }
}