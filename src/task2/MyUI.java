package task2;
import javax.swing.*;
import java.awt.*;

public class MyUI {

    // Method to design the UI
    public void designUI() {
        // Create a button (assuming you already have buttons defined)
        JButton button1 = new JButton("Submit");
        JButton button2 = new JButton("Cancel");

        // Update button color from blue to green
        button1.setBackground(Color.GREEN);
        button2.setBackground(Color.GREEN);

        // Update the button font for better visibility
        // Setting the font to "Arial", plain style, and size 18
        button1.setFont(new Font("Arial", Font.PLAIN, 20));
        button2.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add buttons to a panel (example layout)
        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);

        // Create a frame to hold the panel
        JFrame frame = new JFrame("Updated UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(panel);
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
