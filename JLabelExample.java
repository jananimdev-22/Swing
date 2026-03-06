import javax.swing.*;
public class JLabelExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Label Example");
    JLabel label = new JLabel("Welcome to Java");
    label.setBounds(80, 50, 200, 30);
    frame.add(label);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}