/* Josh Currier
Primitive Types, Chapter 4
10/23/17 Mr. Dodson APCS
*/


public class primitiveTypes {

   public static void main(String[] args) {
   
      integerType();
      byteType();
      shortType();
      longType();
      doubleType();
      floatType();
      charType();
      booleanType();
   
   }

   public static void integerType() {
   
      int a = 450;
      int b = 550;
      int c = (a + b);
      System.out.println("Int:");
      System.out.println(c);
      System.out.println();
   
   }
   
   public static void byteType() {
   
       byte b = 10;
       Byte bpr0 = new Byte(b);
       System.out.println("Byte:");
       System.out.println(bpr0);
       System.out.println();
   
   }
   
   public static void shortType() {
   
      short a = 32767;
      short b = -32768;
      System.out.println("Short:");
      System.out.println(a - b);
      
      if (a - b == 65535)
         System.out.println("Answer is true.");
      else 
         System.out.println("Answer is false.");
         
      System.out.println();
   
   }
   
   public static void longType() {
   
      long a = 1048575;
      long b = -1048576;
      System.out.println("Long:");
      System.out.println(a - b);
      System.out.println();
   
   }
   
   public static void doubleType() {
   
      double r = 10.5;
      double a = r * r * Math.PI;
      System.out.println("Double:");
      System.out.println(a);
      System.out.println();
   
   }
   
   public static void floatType() {
   
      float a = 8E2f;
      int b = 16;
      float c = a * b;
      System.out.println("Float:");
      System.out.println(c);
      System.out.println();
   
   }
   
   public static void charType() {
   
      char a = 32768;
      char b = 16384;
      System.out.println("Char:");
      System.out.println(a / b);
      System.out.println();
   
   }
   
   public static void booleanType() {
   
      int a = 64;
      int b = 32;
      boolean result = a / b == 2;
      System.out.println("Boolean: Is 64 / 32 == 2?");
      System.out.println(result);
      System.out.println();
      
   }

}