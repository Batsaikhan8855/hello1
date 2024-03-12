package snake1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);

        // Creating a restart button
        JButton restartButton = new JButton("Restart");
        restartButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle restart logic here
                snakeGame.restartGame();
            }
        });

        // Adding restart button to a panel at the bottom of the frame
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(restartButton);
        frame.add(panel, BorderLayout.SOUTH);

        frame.pack();
        snakeGame.requestFocus();
    }
}
