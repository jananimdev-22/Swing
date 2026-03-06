import javax.swing.*; import java.awt.event.*;
public class JButtonExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Button Example");
    JButton btn = new JButton("Click Me");
    btn.setBounds(100, 70, 120, 30);
    btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
      } 
    }
    );
    frame.add(btn);
    frame.setSize(300, 200);
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); 
  } 
}