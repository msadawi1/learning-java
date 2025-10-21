import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Font font = new Font("SansSerif", Font.BOLD, 16);

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

        var opField = new JTextField();
        opField.setPreferredSize(new Dimension(100, 30));

        var secondNumField = new JTextField();
        secondNumField.setPreferredSize(new Dimension(100, 30));

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
        resultField.setPreferredSize(new Dimension(100, 30));

        bottomPanel.add(resultField);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.pack();

        frame.setVisible(true);
    }
}