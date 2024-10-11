import javax.swing.*;
import java.awt.*;

public class SimpleWebsite {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("我的简易网站");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(76, 175, 80));
        JLabel headerLabel = new JLabel("欢迎来到我的网站", SwingConstants.CENTER);
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);

        // Content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 1));
        JLabel textLabel1 = new JLabel("这是我的第一个网页！", SwingConstants.CENTER);
        JLabel textLabel2 = new JLabel("很高兴你来访问。", SwingConstants.CENTER);
        contentPanel.add(textLabel1);
        contentPanel.add(textLabel2);

        // Set layout and add panels to frame
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(contentPanel, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
