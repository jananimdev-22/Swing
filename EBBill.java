import javax.swing.*;
import java.awt.event.*;

public class EBBill implements ActionListener {

    JFrame f;
    JTextField units;
    JRadioButton r1, r2;
    JButton calc;
    JTextArea output;

    EBBill() {
        f = new JFrame("EB Bill Calculator");
        f.setSize(400, 400);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter Units:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        units = new JTextField();
        units.setBounds(150, 50, 100, 30);
        f.add(units);

        JLabel l2 = new JLabel("Connection:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        r1 = new JRadioButton("Domestic");
        r2 = new JRadioButton("Commercial");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.setBounds(150, 100, 100, 30);
        r2.setBounds(150, 130, 120, 30);

        f.add(r1);
        f.add(r2);

        calc = new JButton("Calculate");
        calc.setBounds(150, 180, 100, 30);
        f.add(calc);

        output = new JTextArea();
        output.setBounds(50, 230, 300, 100);
        f.add(output);

        calc.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int u = Integer.parseInt(units.getText());
        double bill = 0;

        if (r1.isSelected()) { // Domestic
            if (u <= 100) bill = u * 1.5;
            else if (u <= 200) bill = u * 2;
            else bill = u * 3;
        }

        if (r2.isSelected()) { // Commercial
            if (u <= 100) bill = u * 2;
            else if (u <= 200) bill = u * 3;
            else bill = u * 5;
        }

        output.setText("Units: " + u + "\nTotal Bill: Rs." + bill);
    }

    public static void main(String[] args) {
        new EBBill();
    }
}