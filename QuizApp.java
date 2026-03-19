import javax.swing.*;
import java.awt.event.*;

public class QuizApp implements ActionListener {

    JFrame f;
    JLabel q;
    JRadioButton o1, o2, o3, o4;
    JButton next;
    ButtonGroup bg;

    int count = 0, score = 0;

    String questions[][] = {
        {"Java is a ?", "Language", "OS", "Browser", "Editor"},
        {"Which is not OOP?", "Java", "C++", "C", "Python"},
        {"Which is platform independent?", "Java", "C", "C++", "None"}
    };

    int answers[] = {1, 3, 1};

    QuizApp() {
        f = new JFrame("Quiz Application");
        f.setSize(500, 400);
        f.setLayout(null);

        q = new JLabel();
        q.setBounds(50, 50, 400, 30);
        f.add(q);

        o1 = new JRadioButton();
        o2 = new JRadioButton();
        o3 = new JRadioButton();
        o4 = new JRadioButton();

        o1.setBounds(50, 100, 200, 30);
        o2.setBounds(50, 130, 200, 30);
        o3.setBounds(50, 160, 200, 30);
        o4.setBounds(50, 190, 200, 30);

        bg = new ButtonGroup();
        bg.add(o1); bg.add(o2); bg.add(o3); bg.add(o4);

        f.add(o1); f.add(o2); f.add(o3); f.add(o4);

        next = new JButton("Next");
        next.setBounds(150, 250, 100, 30);
        f.add(next);

        next.addActionListener(this);

        loadQuestion();

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void loadQuestion() {
        q.setText(questions[count][0]);
        o1.setText(questions[count][1]);
        o2.setText(questions[count][2]);
        o3.setText(questions[count][3]);
        o4.setText(questions[count][4]);
        bg.clearSelection();
    }

    public void actionPerformed(ActionEvent e) {
        int selected = 0;

        if (o1.isSelected()) selected = 1;
        if (o2.isSelected()) selected = 2;
        if (o3.isSelected()) selected = 3;
        if (o4.isSelected()) selected = 4;

        if (selected == answers[count]) {
            score++;
        }

        count++;

        if (count < questions.length) {
            loadQuestion();
        } else {
            JOptionPane.showMessageDialog(f, "Your Score: " + score);
        }
    }

    public static void main(String[] args) {
        new QuizApp();
    }
}