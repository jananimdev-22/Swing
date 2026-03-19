import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame f;
    JTextField t;
    JButton b[] = new JButton[16];

    String s = "", op = "";
    double num1 = 0, num2 = 0;

    Calculator() {
        f = new JFrame("Calculator");
        f.setSize(300, 400);
        f.setLayout(null);

        t = new JTextField();
        t.setBounds(30, 40, 220, 30);
        f.add(t);

        String btn[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0","C","=","+"
        };

        int x = 30, y = 100;

        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(btn[i]);
            b[i].setBounds(x, y, 50, 40);
            f.add(b[i]);
            b[i].addActionListener(this);

            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            s += cmd;
            t.setText(s);
        }

        else if (cmd.equals("C")) {
            s = "";
            t.setText("");
        }

        else if (cmd.equals("=")) {
            num2 = Double.parseDouble(s);

            switch (op) {
                case "+": t.setText("" + (num1 + num2)); break;
                case "-": t.setText("" + (num1 - num2)); break;
                case "*": t.setText("" + (num1 * num2)); break;
                case "/": t.setText("" + (num1 / num2)); break;
            }

            s = "";
        }

        else {
            num1 = Double.parseDouble(s);
            op = cmd;
            s = "";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}