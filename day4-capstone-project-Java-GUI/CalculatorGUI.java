import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Font font = new Font("SansSerif", Font.BOLD, 20);
        Font fieldFont = new Font("SansSerif", Font.PLAIN, 18);


        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

        var header = new JLabel("--- Simple Calculator ---");
        header.setFont(font);
        topPanel.add(header);
        header.setAlignmentX(Component.CENTER_ALIGNMENT);

        topPanel.add(Box.createVerticalStrut(10)); // spacing between the top and center panel

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 3));

        var firstNumLabel = new JLabel("1st Number");
        firstNumLabel.setFont(font);
        var operationLabel = new JLabel("Operation");
        operationLabel.setFont(font);
        var secondNumLabel = new JLabel("2nd Number");
        secondNumLabel.setFont(font);

        centerPanel.add(firstNumLabel);
        centerPanel.add(operationLabel);
        centerPanel.add(secondNumLabel);

        var firstNumField = new JTextField();
        firstNumField.setPreferredSize(new Dimension(100, 30));
        firstNumField.setFont(fieldFont);
        firstNumField.setHorizontalAlignment(JTextField.CENTER);

        var opField = new JTextField();
        opField.setPreferredSize(new Dimension(100, 30));
        opField.setFont(fieldFont);
        opField.setHorizontalAlignment(JTextField.CENTER);

        var secondNumField = new JTextField();
        secondNumField.setPreferredSize(new Dimension(100, 30));
        secondNumField.setFont(fieldFont);
        secondNumField.setHorizontalAlignment(JTextField.CENTER);

        centerPanel.add(firstNumField);
        centerPanel.add(opField);
        centerPanel.add(secondNumField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.add(Box.createVerticalStrut(10)); // spacing between the bottom and center

        var calculateButton = new JButton("Calculate");
        calculateButton.setFont(font);
        calculateButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        bottomPanel.add(calculateButton);

        bottomPanel.add(Box.createVerticalStrut(10)); // spacing between button and result

        var resultLabel = new JLabel("Result");
        resultLabel.setFont(font);
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        bottomPanel.add(resultLabel);
        JTextField resultField = new JTextField();
        resultField.setFont(fieldFont);
        resultField.setPreferredSize(new Dimension(100, 30));
        resultField.setHorizontalAlignment(JTextField.CENTER);

        bottomPanel.add(resultField);

        // calculator logic
        calculateButton.addActionListener(input -> {
            double firstNum;
            double secondNum;
            double result = Double.NaN;

            String firstNumString = firstNumField.getText();
            firstNumString.trim();
            if (firstNumString.isEmpty()) {
                resultField.setText("Error: first number empty");
                return;
            }

            String secondNumString = secondNumField.getText();
            secondNumString.trim();
            if (secondNumString.isEmpty()) {
                resultField.setText("Error: second number empty");
                return;
            }


            try {
                firstNum = Double.parseDouble(firstNumString);
                secondNum = Double.parseDouble(secondNumString);
            } catch (NumberFormatException e) {
                resultField.setText("Please enter numbers only.");
                return;
            }

            String operation = opField.getText();
            operation.trim();
            if (operation.isEmpty()) {
                resultField.setText("Error: operation empty");
                return;
            }


            if (operation.equals("/") || operation.equals("÷")) {
                result = firstNum / secondNum;
            } else if (operation.equals("*") || operation.equals("×")) {
                result = firstNum * secondNum;
            } else if (operation.equals("+")) {
                result = firstNum + secondNum;
            } else if (operation.equals("-")) {
                result = firstNum - secondNum;
            }
            if (Double.isNaN(result)) {
                resultField.setText("Please choose a supported operation.");
            } else {
                resultField.setText("" + result);
            }
        });

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.pack();

        frame.setVisible(true);
    }
}