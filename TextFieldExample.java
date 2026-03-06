import javax.swing.*;
public class TextFieldExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("TextField Example");
    JTextField tf = new JTextField();
    tf.setBounds(80, 50, 150, 30);
    frame.add(tf);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}