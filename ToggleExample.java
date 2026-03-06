import javax.swing.*;
import java.awt.event.*;
public class ToggleExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Toggle Example");
    JToggleButton toggle = new JToggleButton("ON/OFF");
    toggle.setBounds(100, 70, 120, 30);
    toggle.addActionListener(e -> {
      if (toggle.isSelected())
        System.out.println("ON");
      else
        System.out.println("OFF");
    });
    frame.add(toggle);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); } 
}