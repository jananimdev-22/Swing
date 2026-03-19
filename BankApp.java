import javax.swing.*;
import java.awt.event.*;

public class BankApp implements ActionListener {

    JFrame f;
    JTextField amount;
    JTextArea output;
    JButton deposit, withdraw;

    double balance = 1000; // Initial balance

    BankApp() {
        f = new JFrame("Bank Account");
        f.setSize(400, 400);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter Amount:");
        l1.setBounds(50, 50, 120, 30);
        f.add(l1);

        amount = new JTextField();
        amount.setBounds(170, 50, 100, 30);
        f.add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        deposit.setBounds(50, 100, 100, 30);
        withdraw.setBounds(170, 100, 100, 30);

        f.add(deposit);
        f.add(withdraw);

        output = new JTextArea();
        output.setBounds(50, 160, 250, 150);
        f.add(output);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double amt = Double.parseDouble(amount.getText());

        if (e.getSource() == deposit) {
            balance += amt;
            output.setText("Deposited: " + amt + "\nBalance: " + balance);
        }

        if (e.getSource() == withdraw) {
            if (amt <= balance) {
                balance -= amt;
                output.setText("Withdrawn: " + amt + "\nBalance: " + balance);
            } else {
                output.setText("Insufficient Balance!");
            }
        }
    }

    public static void main(String[] args) {
        new BankApp();
    }
}