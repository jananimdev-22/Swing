import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm implements ActionListener {

    JFrame f;
    JTextField t1, t2;
    JTextArea ta, output;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JComboBox<String> cb;
    JList<String> list;
    JButton b1, b2;

    StudentForm() {
        f = new JFrame("Student Registration Form");
        f.setSize(600, 600);
        f.setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);
        f.add(t1);

        JLabel l2 = new JLabel("Age:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        t2 = new JTextField();
        t2.setBounds(150, 100, 150, 30);
        f.add(t2);

        JLabel l3 = new JLabel("Address:");
        l3.setBounds(50, 150, 100, 30);
        f.add(l3);

        ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(150, 150, 150, 60);
        f.add(sp);

        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(50, 230, 100, 30);
        f.add(l4);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r1.setBounds(150, 230, 70, 30);
        r2.setBounds(220, 230, 80, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        JLabel l5 = new JLabel("Courses:");
        l5.setBounds(50, 270, 100, 30);
        f.add(l5);

        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");
        c3 = new JCheckBox("C++");

        c1.setBounds(150, 270, 80, 30);
        c2.setBounds(230, 270, 80, 30);
        c3.setBounds(310, 270, 80, 30);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        JLabel l6 = new JLabel("Department:");
        l6.setBounds(50, 310, 100, 30);
        f.add(l6);

        String dept[] = {"CSE", "IT", "ECE", "EEE"};
        cb = new JComboBox<>(dept);
        cb.setBounds(150, 310, 150, 30);
        f.add(cb);

        JLabel l7 = new JLabel("Skills:");
        l7.setBounds(50, 350, 100, 30);
        f.add(l7);

        String skills[] = {"Programming", "Communication", "Designing"};
        list = new JList<>(skills);
        JScrollPane sp2 = new JScrollPane(list);
        sp2.setBounds(150, 350, 150, 60);
        f.add(sp2);

        b1 = new JButton("Submit");
        b2 = new JButton("Reset");

        b1.setBounds(150, 430, 100, 30);
        b2.setBounds(260, 430, 100, 30);

        f.add(b1);
        f.add(b2);

        output = new JTextArea();
        JScrollPane sp3 = new JScrollPane(output);
        sp3.setBounds(320, 50, 250, 300);
        f.add(sp3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String name = t1.getText();
            String age = t2.getText();
            String address = ta.getText();

            String gender = "";
            if (r1.isSelected()) gender = "Male";
            if (r2.isSelected()) gender = "Female";

            String courses = "";
            if (c1.isSelected()) courses += "Java ";
            if (c2.isSelected()) courses += "Python ";
            if (c3.isSelected()) courses += "C++ ";

            String dept = (String) cb.getSelectedItem();

            String skill = list.getSelectedValue();

            output.setText(
                "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nGender: " + gender +
                "\nCourses: " + courses +
                "\nDepartment: " + dept +
                "\nSkill: " + skill
            );
        }

        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            ta.setText("");
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}