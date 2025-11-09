import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class BasicFrame {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame("My First GUI");
        frame.setSize(400, 300); // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close application on exit
        frame.setVisible(true); // Display the window*/

        JFrame frame = new JFrame("Adding Components");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to Swing!");
        JButton button = new JButton("Click Me");
        label.setBounds(50, 70, 120, 30);
        button.setBounds(50, 100, 120, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
            }
        });


        // frame.setLayout(null); // Disable layout managers
        frame.setLayout(new FlowLayout());
        frame.add(label); // Add label
        frame.add(button); // Add button
        // frame.setVisible(true);

        // Layout Manager
        // Border Layout
        /* 
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);*/

        // Grid Layout
        /*frame.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));*/

        // Display Image
        ImageIcon imageIcon = new ImageIcon("10. java_gui\\cat.jpg");
        JLabel label2 = new JLabel(imageIcon);
        frame.add(label2);
        frame.setVisible(true);
    }
}
