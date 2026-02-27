import javax.swing.*;

public class MyDialog {

public static void main(String[] args) {

JFrame frame = new JFrame();

JDialog dialog = new JDialog(frame, "My Dialog",
true);

dialog.setSize(200, 150);

dialog.setVisible(true);

}

}