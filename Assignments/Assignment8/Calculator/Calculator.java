package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener{
    private JLabel firstLabel, secondLabel, resultLabel;
    private JTextField firstText, secondText, thirdText;
    private JButton addButton, subButton, mulButton, divButton;

    public Calculator() {
        create();
        addToFrame();
        makeItVisible();
    }

    void create() {
        firstLabel = new JLabel(" First Number : ");
        secondLabel = new JLabel(" Second Number : ");
        resultLabel = new JLabel(" Result : ");

        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        mulButton = new JButton("Multiply");
        divButton = new JButton("Divide");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        firstText = new JTextField();
        secondText = new JTextField();
        thirdText = new JTextField();
    }

    void addToFrame() {
        setLayout(new GridLayout(5,2));
        add(firstLabel,0);
        add(firstText);
        add(secondLabel);
        add(secondText);
        add(resultLabel);
        add(thirdText);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = 0;
        try {
            a = Integer.parseInt(firstText.getText());
        } catch (RuntimeException re) {
            JOptionPane.showMessageDialog(this, "Number should be entered in the first text field");
            throw re;
        }
        int b = 0;
        try {
            b = Integer.parseInt(secondText.getText());
        } catch (RuntimeException re) {
            JOptionPane.showMessageDialog(this, "Number should be entered in the second text field");
            throw re;
        }
        String choice = e.getActionCommand();
        int result = getResult(a, b, choice);
        thirdText.setText(Integer.toString(result));
    }

    private int getResult(int a, int b, String choice) {
        if (choice.equals("Add")) {
            return a + b;
        } if (choice.equals("Subtract")) {
            return a - b;
        } if (choice.equals("Multiply")) {
            return a * b;
        } else {
            return a / b;
        }
    }

    void makeItVisible() {
        setSize(300,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
