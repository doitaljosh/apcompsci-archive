import java.awt.*;
import javax.swing.*;

class helpWindow {

   private static final Font bf = new Font("Arial", Font.PLAIN, 25);
   private static final Font txt = new Font("Arial", Font.PLAIN, 20);

   public void main() {
   
      JFrame frame = new JFrame("Help");
      frame.setSize(400, 700);
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      JPanel panel = new JPanel();
      frame.add(panel);
      frame.setVisible(true);
      placeComponents(panel);
      
   }

   private void placeComponents(JPanel panel) {
      
      panel.setLayout(null);
      panel.setBackground(Color.GRAY);
      
      JLabel title = new JLabel("Help:");
      title.setBounds(35, 20, 300, 30);
      title.setForeground(Color.WHITE);
      title.setFont(bf);
      title.setHorizontalAlignment(JLabel.CENTER);
      panel.add(title);
      
      JLabel htxt = new JLabel("<html><pre><b>Game Instructions:</b></html></pre><br>");
      JLabel htxtb = new JLabel("<html><p>The game of Collect the Objects is <br>a strategy and reaction time based game where the player must complete a pathway <br>collecting loot along the way. Between the player and the loot will be enemy <br>protagonists which will move up and down <br>across the screen. In order to get through, the player must dodge these enemies. <br>If an enemy and the player comes in <br>contact, the game is lost. If the player gets to the other end without hitting an <br>enemy, they will level up.</p></html>");
      htxt.setFont(txt);
      htxtb.setFont(txt);
      panel.add(htxtb);
      panel.add(htxt);
      htxt.setBounds(0, 80, 400, 20);
      htxtb.setBounds(0, 80, 400, 600);
      htxt.setBackground(Color.lightGray);
      htxtb.setBackground(Color.lightGray);
      htxt.setForeground(Color.WHITE);
      htxtb.setForeground(Color.WHITE);
   }
}