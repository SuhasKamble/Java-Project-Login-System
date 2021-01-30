package loginApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    // main frame
    JFrame frame = new JFrame();
    // labels
    JLabel userIDLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel message = new JLabel();

    JTextField userText = new JTextField();
    JPasswordField passwordField = new JPasswordField();

    JButton resetButton = new JButton("Reset");
    JButton loginButton = new JButton("Login");

    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    LoginPage(HashMap loginData) {
        loginInfo = loginData;
        frame.setTitle("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 400);

        userIDLabel.setBounds(90, 100, 100, 30);
        userIDLabel.setFont(new Font("Sans Serif", Font.PLAIN, 16));

        passwordLabel.setBounds(90, 150, 100, 30);
        passwordLabel.setFont(new Font("Sans Serif", Font.PLAIN, 16));

        userText.setBounds(180, 100, 200, 30);
        userText.setFont(new Font("Sans Serif", Font.PLAIN, 16));

        passwordField.setBounds(180, 150, 200, 30);
        passwordField.setFont(new Font("Sans Serif", Font.PLAIN, 16));

        loginButton.setBounds(180, 200, 100, 30);
        loginButton.setFocusable(false);
        loginButton.setCursor(cursor);
        loginButton.addActionListener(this::actionPerformed);

        resetButton.setBounds(280, 200, 100, 30);
        resetButton.setFocusable(false);
        resetButton.setCursor(cursor);
        resetButton.addActionListener(this::actionPerformed);

        message.setBounds(140, 250, 300, 50);
        message.setFont(new Font("Sans Serif", Font.ITALIC, 25));

        frame.add(userIDLabel);
        frame.add(passwordLabel);
        frame.add(userText);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(message);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userText.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == loginButton) {
            String username = userText.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (loginInfo.containsKey(username)) {
                if (loginInfo.get(username).equals(password)) {
                    message.setText("Login Succesfully!");
                    message.setForeground(Color.green);
                    WelcomePage welcomePage = new WelcomePage(username);
                    frame.dispose();
                } else {
                    message.setText("Wrong Password!");
                    message.setForeground(Color.red);
                }

            } else {
                message.setText("Username is not found!");
                message.setForeground(Color.red);
            }
        }
    }
}
