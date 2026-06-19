import javax.swing.*;
import java.awt.event.*;

public class ExamGUI {
    public static void main(String[] args) {
        // 1. Create the Window (Frame)
        JFrame frame = new JFrame("Online Exam Portal 2026");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Allows us to place components manually

        // 2. Add Username Label and Text Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);
        frame.add(userText);

        // 3. Add Password Label and Password Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);
        frame.add(passText);

        // 4. Add Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 160, 100, 30);
        frame.add(loginButton);

        // 5. Button Logic (The "Brain")
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = new String(passText.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                    // Here we will later add code to open the Exam Screen
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials!");
                }
            }
        });

        // 6. Make the window visible
        frame.setVisible(true);
    }
}
