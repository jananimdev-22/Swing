import javax.swing.*;
public class TextAreaExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("TextArea Example");
    JTextArea ta = new JTextArea(5, 20);
    ta.setBounds(50, 40, 200, 80);
    frame.add(ta);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}