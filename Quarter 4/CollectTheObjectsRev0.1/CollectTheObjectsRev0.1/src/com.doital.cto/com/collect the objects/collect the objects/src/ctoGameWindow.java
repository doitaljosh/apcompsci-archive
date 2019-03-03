import java.awt.*;
import java.io.File;
import java.util.*;
import javax.swing.*;
public class ctoGameWindow extends JFrame{
        public int currentScore = 0;
        //public int highScore = new protagSprite.highScore();
        private static Font scoreFont = new Font("Arial", Font.PLAIN, 30);
        private static Font scoreFontSmall = new Font("Arial", Font.PLAIN, 18);

    public void showGameWindow() {
        JFrame gFrame = new JFrame("Collect the Objects!: Ongoing Match");
        gFrame.setSize(1280, 720);
        gFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gFrame.setBackground(Color.GRAY);
        JPanel gPanel = new JPanel();
        gFrame.add(gPanel);
        gFrame.setVisible(true);
        drawMap();

    }
    public void showPlayArea(JPanel panel) {

    }

    
    public void drawMap(Graphics g) {
         
         final int tW = 32;
         final int tH = 32;
         final int width = 10;
         final int height = 20;
          for (int x = 0; x < width; x++) {
              for (int y = 0;  y < height; y++) {
                  int fx = x * 50;
                  int fy = y * 50;
                  g.setColor(Color.red);
                  g.fillRect(fx, fy, tW, tH);
              }
          }  
    }

    public void scoreCounter(JPanel panel) {
        JLabel sclbl = new JLabel("Score:");
        sclbl.setBounds(20, 40, 80, 30);
        sclbl.setHorizontalAlignment(SwingConstants.CENTER);
        sclbl.setFont(scoreFontSmall);
        JLabel sc = new JLabel("Test");
        sc.setBounds(100, 40, 100, 30);
        sc.setHorizontalAlignment(SwingConstants.CENTER);
        sc.setFont(scoreFont);

        JLabel hslbl = new JLabel("High Score:");
        hslbl.setBounds(20, 80, 80, 30);
        hslbl.setHorizontalAlignment(SwingConstants.CENTER);
        hslbl.setFont(scoreFontSmall);
        JLabel hs = new JLabel("Test");
        hs.setBounds(100, 80, 100, 30);
        hs.setHorizontalAlignment(SwingConstants.CENTER);
        hs.setFont(scoreFont);
    }

    public void getHighScore() {
        //Scanner f = new Scanner(new File("resources/saves/savefile"));

    }
}
