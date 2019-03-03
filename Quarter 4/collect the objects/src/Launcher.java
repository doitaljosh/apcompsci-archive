//package com.doitaljosh.cto;

import javax.swing.*;
import java.awt.*;
import java.awt.*;

public class Launcher extends JFrame {

        private static final Font f = new Font("Arial", Font.PLAIN, 30);
        private static final Font bf = new Font("Arial", Font.PLAIN, 25);
        private static final Font dbf = new Font("Arial", Font.PLAIN, 13);
        
  public static void main(String[] args) {    
        JFrame frame = new JFrame("Collect the Objects!");
        frame.setSize(620, 450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();    
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

  public static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        
        JLabel title = new JLabel("Collect the Objects!");
        title.setBounds(50, 20, 500, 50);
        panel.add(title);
        title.setFont(f);
        title.setForeground(Color.WHITE);
        title.setHorizontalAlignment(JLabel.CENTER);

        JButton startGame = new JButton("Start New Game");
        startGame.setBounds(100, 80, 400, 50);
        startGame.setBackground(Color.RED);
        startGame.setFont(bf);
        startGame.setForeground(Color.WHITE);
        panel.add(startGame);
        startGame.addActionListener(e -> {
            Maze m = new Maze();
            m();
        });
        
        JButton loadGame = new JButton("Load Game");
        loadGame.setBounds(100, 160, 400, 50);
        loadGame.setBackground(Color.RED);
        loadGame.setFont(bf);
        loadGame.setForeground(Color.WHITE);
        panel.add(loadGame);
        loadGame.addActionListener(e -> {
           JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

             int returnValue = jfc.showOpenDialog(null);
             // int returnValue = jfc.showSaveDialog(null);

             if (returnValue == JFileChooser.APPROVE_OPTION) {
                 java.io.File selectedFile = jfc.getSelectedFile();
                 System.out.println(selectedFile.getAbsolutePath());
             }
        });
        
        JButton settingsBtn = new JButton("Settings");
        settingsBtn.setBounds(100, 240, 400, 50);
        settingsBtn.setBackground(Color.RED);
        settingsBtn.setFont(bf);
        settingsBtn.setForeground(Color.WHITE);
        panel.add(settingsBtn);
        settingsBtn.addActionListener(e -> {
            settingsDialog sd = new settingsDialog();
            sd.showDialog();
        });
        
        JButton helpBtn = new JButton("Help");
        helpBtn.setBounds(100, 320, 400, 50);
        helpBtn.setBackground(Color.RED);
        helpBtn.setFont(bf);
        helpBtn.setForeground(Color.WHITE);
        panel.add(helpBtn);
        helpBtn.addActionListener(e -> {
            helpWindow hw = new helpWindow();
            hw.main();
        });
         
        
        
        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(260, 350, 100, 20);
        exitBtn.setBackground(Color.BLACK);
        exitBtn.setFont(dbf);
        exitBtn.setForeground(Color.WHITE);
        panel.add(exitBtn);
        exitBtn.addActionListener(e -> System.exit(0));
    }
}