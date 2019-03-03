import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class gameWindow extends JFrame {

   public void launchGame(Graphics g) {
   
       JFrame frame = new JFrame("Maze");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.pack();
       frame.setSize(1020, 1040);
       frame.add(this);
       frame.setVisible(true);
   
       int width = 10;
       int height = 20;
       //first map
       int[][] map0 = {  
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, },
                        { 0, 1, 0, 0, 1, 0, 0, 1, 1, 2, },
                        { 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, },
                        { 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, },
                        { 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, },
                        { 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                        
                      };
       //second map                
       int[][] map1 = {
                        { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, },
                        { 2, 1, 0, 1, 1, 1, 0, 1, 0, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, },
                        { 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, },
                        { 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, },
                        { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                      };
       //third map
       int[][] map2 = {
                        { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, },
                        { 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, },
                        { 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, },
                        { 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 1, 2, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                       };
       //fourth map
       int[][] map3 = {
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, },
                        { 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, },
                        { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 2, 1, 0, 1, 1, 1, 0, 1, 1, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, }
                       };
       //fifth map
       int[][] map4 = {
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 2, 1, 0, 1, 1, 1, 1, 1, 1, 0, },
                        { 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                       };
       //sixth map
       int[][] map5 = {
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                        { 2, 1, 0, 1, 1, 1, 1, 1, 1, 0, },
                        { 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 2, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, },
                        { 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                       };
       //seventh map
       int[][] map6 = {
                        { 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, },
                        { 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, },
                        { 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, },
                        { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, },
                        { 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, },
                        { 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, },
                        { 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, },
                        { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, }
                       };
       
       
       int min = 0;
       int max = 6;             
       int mapNum = ThreadLocalRandom.current().nextInt(min, max);
       
       int[][] selectedMap; 
       if (mapNum == 0) {
         selectedMap = map0;
       } else if (mapNum == 1) {
         selectedMap = map1;
       } else if (mapNum == 2) {
         selectedMap = map2;
       } else if (mapNum == 3) {
         selectedMap = map3;
       } else if (mapNum == 4) {
         selectedMap = map4;
       } else if (mapNum == 5) {
         selectedMap = map5;
       } else if (mapNum == 6) {
         selectedMap = map6;
       }
      
       for (int i = 0; i < selectedMap.length; i++) {
           for (int j = 0; j < selectedMap.length; j++) {
               int factori = i * 100;
               int factorj = j * 100;
               switch (selectedMap[i][j]) {          
               case 0: {                  
                   g.setColor(Color.gray);
                   g.fillRect(factori, factorj, 100, 100);
                                       
               }                                         
                   break;
               case 1: {
                   g.setColor(Color.black);
                   g.fillRect(factori, factorj, 100, 100);
   
               }
                   break;
               case 2: {
                   g.setColor(Color.green);
                   g.fillRect(factori, factorj, 100, 100);
   
               }
                   break;
               }
           }
       }
   }
}