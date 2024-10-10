package task2;

import javax.swing.*;
import java.awt.*;

public class MyUI {

    // Method to design the UI
    public void designUI() {
        // Create a label
        JLabel label = new JLabel("Enter your name:");
        
        // Create a text field for user input
        JTextField textField = new JTextField(15);

        // Create buttons
        JButton button1 = new JButton("Submit");
        JButton button2 = new JButton("Cancel");

        // Update button color
        button1.setBackground(Color.GREEN);
        button2.setBackground(Color.GREEN);

        // Update the button font for better visibility
        button1.setFont(new Font("Arial", Font.PLAIN, 20));
        button2.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create a panel for the label and text field
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(label);
        inputPanel.add(textField);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Create a main panel to hold everything
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Create a frame to hold the main panel
        JFrame frame = new JFrame("Updated UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyUI().designUI();
            }
        });
    }
}
