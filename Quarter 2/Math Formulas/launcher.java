import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.net.*;
import java.io.*;
import java.awt.image.BufferedImage;

public class launcher extends JPanel {

   quadraticFormula qf = new quadraticFormula();
   lawOfSines los = new lawOfSines();
   lawOfCosines loc = new lawOfCosines();
   pythagTheorem pt = new pythagTheorem();
   grapTrigFunc gtf = new graphTrigFunc();
   calculator calc = new calculator();

   private JLabel title;
   private JButton qfButton; //Quadratic Formula
   private JButton losButton; //Law of Sines
   private JButton locButton; //Law of Cosines
   private JButton ptButton; //Pythagorean Theorem
   private JButton gtfButton; //Graph Trig Function
   private JButton calcButton; //Calculator

   public static void main(String[] args) {
   
      
   
   }

}