import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.PrintWriter;
import java.util.Hashtable;

public class settingsDialog extends JFrame {

   private static final Font f = new Font("Arial", Font.PLAIN, 30);
   private static final Font bf = new Font("Arial", Font.PLAIN, 16);

   private final JFrame sf = new JFrame("Settings");

   public void showDialog() {
	
		sf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		sf.setSize(550, 500);
		sf.setVisible(true);
      JPanel panel = new JPanel();    
      sf.add(panel);
      placeComponents(panel);
      sf.setVisible(true);
	}
   
   private void placeComponents(JPanel panel) {
   
      panel.setLayout(null);
      panel.setBackground(Color.GRAY);
      
      JLabel title = new JLabel("Collect The Objects Settings:");
      title.setForeground(Color.WHITE);
      title.setFont(f);
      title.setBounds(50, 20, 450, 60);
      title.setHorizontalAlignment(JLabel.CENTER);
      panel.add(title);
      
      JLabel dl = new JLabel("Difficulty Level:");
      dl.setForeground(Color.WHITE);
      dl.setFont(bf);
      dl.setBounds(30, 100, 80, 20);
      panel.add(dl);
      
      JSlider ds = new JSlider(JSlider.HORIZONTAL,0,100,10);
      ds.setBounds(200, 80, 300, 60);
      ds.setBackground(Color.GRAY);
      ds.setForeground(Color.WHITE);
      ds.setMajorTickSpacing(10);
      ds.setMinorTickSpacing(1);
      ds.setPaintTicks(false);
      ds.setPaintLabels(true);
      Hashtable dslbl = new Hashtable();
      dslbl.put(new Integer(0), new JLabel("Min"));
      dslbl.put(new Integer(10), new JLabel("Max"));
      ds.addChangeListener(e -> {

      });
      panel.add(ds);
      
      JLabel pcl = new JLabel("Player Color:");
      pcl.setBounds(30, 150, 100, 20);
      pcl.setForeground(Color.WHITE);
      pcl.setFont(bf);
      panel.add(pcl);
      
      JButton pcb = new JButton("Choose Color");
      pcb.setBounds(200, 150, 120, 40);
      pcb.setForeground(Color.WHITE);
      pcb.setBackground(Color.BLACK);
      pcb.addActionListener(e -> {

         
      });
      panel.add(pcb);
      
      JLabel wl = new JLabel("Weapon:");
      wl.setBounds(30, 200, 100, 50);
      wl.setForeground(Color.WHITE);
      wl.setFont(bf);
      panel.add(wl);
      
      String[] weapons = {"Meelee", "Baseball Bat", "Sword", "Katana", "Pistol", "AR-15"};
      final JComboBox<String> wc = new JComboBox<String>(weapons);
      wc.setVisible(true);
      wc.setBounds(200, 200, 100, 50);
      wc.setFont(bf);
      wc.setForeground(Color.WHITE);
      wc.setBackground(Color.BLACK);
      panel.add(wc);
      
      
      JButton scr = new JButton("Reset Score Counter");
      scr.setBounds(30, 270, 200, 60);
      scr.setFont(bf);
      scr.setBackground(Color.BLACK);
      scr.setForeground(Color.WHITE);
      panel.add(scr);
      scr.addActionListener(e -> {
          ctoGameWindow cgw = new ctoGameWindow();
          cgw.highScore = 0;
      });
      
      
      JButton exitBtn = new JButton("Close");
      exitBtn.setBounds(225, 400, 100, 50);
      exitBtn.setBackground(Color.BLACK);
      exitBtn.setFont(bf);
      exitBtn.setForeground(Color.WHITE);
      panel.add(exitBtn);
      exitBtn.addActionListener(e -> {
         if (e.getActionCommand().equals("EXIT")) {
              sf.dispose();
         }
      });
   }

}