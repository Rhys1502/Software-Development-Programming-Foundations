package RandomStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingApp extends JFrame implements ActionListener {
    
    private JButton button;
    
    public GreetingApp() {
        super("Greeting App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a button with the label "Greet Me!"
        button = new JButton("Greet Me!");
        
        // Set the button's preferred size and add it to the content pane
        button.setPreferredSize(new Dimension(100, 30));
        getContentPane().add(button, BorderLayout.CENTER);
        
        // Register the current object (which implements ActionListener) as the button's action listener
        button.addActionListener(this);
        
        pack();
        setVisible(true);
    }
    
    // Implement the ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // When the button is clicked, display an input dialog box prompting the user to enter their name
        String name = JOptionPane.showInputDialog(this, "What is your name?");
        
        // If the user entered a name, display a message dialog box greeting them by name
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
        }
    }
    
    public static void main(String[] args) {
        // Create an instance of the GreetingApp class, which creates and displays the GUI
        new GreetingApp();
    }
}