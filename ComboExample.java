import javax.swing.*;
public class ComboExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Combo Example");
    String[] courses = {"BCA", "MCA", "BSc"};
    JComboBox<String> combo = new JComboBox<>(courses);
    combo.setBounds(80, 50, 120, 30);
    frame.add(combo);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}