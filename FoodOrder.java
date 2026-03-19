import javax.swing.*;
import java.awt.event.*;

public class FoodOrder implements ActionListener {

    JFrame f;
    JCheckBox c1, c2, c3;
    JRadioButton r1, r2;
    JTextField qty1, qty2, qty3;
    JTextArea output;
    JButton order;

    FoodOrder() {
        f = new JFrame("Food Order Form");
        f.setSize(500, 500);
        f.setLayout(null);

        JLabel title = new JLabel("Food Order");
        title.setBounds(180, 20, 200, 30);
        f.add(title);

        c1 = new JCheckBox("Pizza (100)");
        c2 = new JCheckBox("Burger (80)");
        c3 = new JCheckBox("Juice (50)");

        c1.setBounds(50, 80, 120, 30);
        c2.setBounds(50, 120, 120, 30);
        c3.setBounds(50, 160, 120, 30);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        qty1 = new JTextField();
        qty2 = new JTextField();
        qty3 = new JTextField();

        qty1.setBounds(200, 80, 50, 30);
        qty2.setBounds(200, 120, 50, 30);
        qty3.setBounds(200, 160, 50, 30);

        f.add(qty1);
        f.add(qty2);
        f.add(qty3);

        JLabel pay = new JLabel("Payment:");
        pay.setBounds(50, 210, 100, 30);
        f.add(pay);

        r1 = new JRadioButton("Cash");
        r2 = new JRadioButton("UPI");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        r1.setBounds(150, 210, 80, 30);
        r2.setBounds(230, 210, 80, 30);

        f.add(r1);
        f.add(r2);

        order = new JButton("Order");
        order.setBounds(150, 260, 100, 30);
        f.add(order);

        output = new JTextArea();
        output.setBounds(50, 310, 350, 120);
        f.add(output);

        order.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String result = "---- BILL ----\n";

        if (c1.isSelected()) {
            int q = Integer.parseInt(qty1.getText());
            total += q * 100;
            result += "Pizza x " + q + "\n";
        }

        if (c2.isSelected()) {
            int q = Integer.parseInt(qty2.getText());
            total += q * 80;
            result += "Burger x " + q + "\n";
        }

        if (c3.isSelected()) {
            int q = Integer.parseInt(qty3.getText());
            total += q * 50;
            result += "Juice x " + q + "\n";
        }

        String payment = "";
        if (r1.isSelected()) payment = "Cash";
        if (r2.isSelected()) payment = "UPI";

        result += "\nPayment: " + payment;
        result += "\nTotal: " + total;

        output.setText(result);
    }

    public static void main(String[] args) {
        new FoodOrder();
    }
}