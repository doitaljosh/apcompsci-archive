/*Josh Currier 10/25/17
Arithmetic Operations
Mr. Dodson APCS*/
import java.util.*;

public class arithmeticOperationsJSC {

   public static double quadraticEquation(double a, double b, double c) {

   if(Math.sqrt(Math.pow(b, 2) - 4*a*c) == 0)
   {
      return -b/(2*a);
   } else {
      double root1, root2;
      root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
      root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
      return Math.max(root1, root2);  
     }
   } 
  
   public static double lawOfSines(double side0, double side1, double side2, double angle0, double angle1) {
   
      side0 = ;
      side1 = ;
      side2 = ;
      angle0 = ;
      angle1 = ;
   
      double LoSanswer0 = (side0/Math.sin(side0)) == (side1/Math.sin(side1)) == (side2/Math.sin(side2));
      
   }

   public static void main(String[] args) {
      
      
         
   }

}