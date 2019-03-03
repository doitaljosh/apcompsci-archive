/*Josh Currier 10/25/17
Cash Register Project
Mr. Dodson APCS*/

public class dungeonCashRegisterJSC {

   public static final double WHIPS_VALUE = 0.33;
   public static final double CHAINS_VALUE = 0.11;
   public static final double ROPES_VALUE = 0.66;
   public static final double CAGES_VALUE = 0.88;
   private double purchase;
   private double payment;

   public dungeonCashRegisterJSC() {
   
      purchase = 0;
      payment = 0;      
   
   }
   
   public void recordPurchase(double amount) {
   
      purchase = purchase + amount;
   
   }
   
   public void enterPayment(int dungeons, int whips, int chains, int ropes, int cages) {
   
      payment = dungeons + whips * WHIPS_VALUE + chains * CHAINS_VALUE + ropes * ROPES_VALUE + cages * CAGES_VALUE;
   
   }
   
   public double giveChange() {
   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   
   }
}