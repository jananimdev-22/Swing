import javax.swing.*;
public class JListExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("JList Example");
    String[] data = {"Java", "Python", "C++"};
    JList<String> list = new JList<>(data);
    list.setBounds(80, 40, 100, 80);
    frame.add(list);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}