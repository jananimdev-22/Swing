import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Swing Demo Launcher");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btnWindow = new JButton("Open MyWindow");
        JButton btnFrame = new JButton("Open MyFrame");
        JButton btnDialog = new JButton("Open MyDialog");
        JButton btnPanel = new JButton("Open PanelExample");

        panel.add(btnWindow);
        panel.add(btnFrame);
        panel.add(btnDialog);
        panel.add(btnPanel);

        mainFrame.add(panel);
        mainFrame.setVisible(true);

        // Call the main() method of each class
        btnWindow.addActionListener(e -> MyWindow.main(new String[]{}));
        btnFrame.addActionListener(e -> MyFrame.main(new String[]{}));
        btnDialog.addActionListener(e -> MyDialog.main(new String[]{}));
        btnPanel.addActionListener(e -> PanelExample.main(new String[]{}));
    }
}