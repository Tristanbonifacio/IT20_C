/*
 * Stack Calculator Application
 * A simple calculator that uses a stack for operations.
 */

package topic_3_stack_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class StackCalculatorGUI extends JFrame implements ActionListener {
    private final Stack<Integer> numberStack;
    private final JTextArea outputArea;

    public StackCalculatorGUI() {
        this.numberStack = new Stack<>();
        setTitle("Simple Stack Calculator");
        setSize(360, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));

        // Output area
        outputArea = new JTextArea(6, 25);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Verdana", Font.PLAIN, 16));
        outputArea.setMargin(new Insets(10, 10, 10, 10));
        add(new JScrollPane(outputArea), BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 8, 8));

        // Create buttons for numbers
        for (int i = 0; i < 10; i++) {
            addButton(buttonPanel, String.valueOf(i));
        }

        // Create buttons for operations
        String[] operators = {"+", "-", "*", "/"};
        for (String operator : operators) {
            addButton(buttonPanel, operator);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.addActionListener(this);
        panel.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (Character.isDigit(command.charAt(0))) {
            int number = Integer.parseInt(command);
            numberStack.push(number);
            updateDisplay();
        } else {
            calculate(command);
        }
    }

    private void calculate(String operator) {
        if (numberStack.size() < 2) {
            outputArea.append("Error: Need at least two numbers in the stack.\n");
            return;
        }

        int secondOperand = numberStack.pop();
        int firstOperand = numberStack.pop();
        int result;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                if (secondOperand == 0) {
                    outputArea.append("Error: Division by zero.\n");
                    numberStack.push(firstOperand);
                    numberStack.push(secondOperand);
                    return;
                }
                result = firstOperand / secondOperand;
                break;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }

        numberStack.push(result);
        outputArea.append(String.format("Computed: %d %s %d = %d\n", firstOperand, operator, secondOperand, result));
        updateDisplay();
    }

    private void updateDisplay() {
        outputArea.append("Stack: " + numberStack + "\n\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackCalculatorGUI app = new StackCalculatorGUI();
            app.setVisible(true);
        });
    }
}
