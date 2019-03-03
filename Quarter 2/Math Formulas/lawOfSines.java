public class lawOfSines {

   int a, b, c; // distance lengths
   double A, B, C; // angle measurements

   public lawOfSines(int sideA, int sideB, int sideC) {
      a = sideA;
      b = sideB;
      c = sideC;  
      computeAngles();
   }

   private void computeAngles() {
      A = Math.acos((b * b + c * c - a * a)/(2.0 * b * c)); // law of cosines
      B = Math.asin((Math.sin(Math.toRadians(A)) * b)/a); // law of sines
      C = 180 - (A + B); 
   }

   public int getPacing() {
      return (int)(A+0.5);
   }

   public int getStride() {
      return (int)((C + B)/2.0 + 0.5); // average of two stride angles
   }

}