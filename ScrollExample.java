import javax.swing.*;
public class ScrollExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("ScrollPane Example");
    JTextArea ta = new JTextArea(5, 20);
    JScrollPane sp = new JScrollPane(ta);
    sp.setBounds(50, 40, 200, 100);
    frame.add(sp);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}