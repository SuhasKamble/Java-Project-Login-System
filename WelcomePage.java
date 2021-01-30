package loginApp;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    WelcomePage(String name) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        label.setText("Welcome " + name);
        label.setFont(new Font("Suhas", Font.ITALIC, 40));
        label.setForeground(Color.BLUE);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.setSize(500, 500);
        frame.setTitle("Welcome Page");
        frame.setLayout(new BorderLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
