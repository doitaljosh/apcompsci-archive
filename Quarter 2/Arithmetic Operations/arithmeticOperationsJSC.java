/*Josh Currier 10/25/17
Arithmetic Operations
Mr. Dodson APCS*/
import java.util.*;

public class arithmeticOperationsJSC {

   public void quadraticFormula() {
   
      double aValQF = 0;
      double bValQF = 0;
      double cValQF = 0;
      
      double qfAnswer0 = (-bValQF + Math.sqrt(Math.pow(bValQF, 2) - (4 * aValQF * cValQF))) / (2 * aValQF);
      double qfAnswer1 = (-bValQF - Math.sqrt(Math.pow(bValQF, 2) - (4 * aValQF * cValQF))) / (2 * aValQF);
      
      if (Double.isNaN(qfAnswer0) || Double.isNaN(qfAnswer1)) {
         //Error jFrame code goes here.
      } else //Answer jFrame code goes here.
   
   }
   
   public void lawOfSines() {
   
      double side0 = 0;
      double side1 = 0;
      double side2 = 0;
      double angle0 = 0;
      double angle1 = 0;
      
      double LoSanswer0 = (side0/Math.sin(side0)) == (side1/Math.sin(side1)) == (side2/Math.sin(side2));
      
   
   }

   public static void main(String[] args) {
      
      
         
   }

}