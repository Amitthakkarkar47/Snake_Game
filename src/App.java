import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int frameWidth = 600 ;
        int frameHeight = frameWidth;

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(frameWidth, frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Snake snakeGame = new Snake(frameWidth, frameHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
        
    }   
}
