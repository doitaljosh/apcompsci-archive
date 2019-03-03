/*Josh Currier
Quarter 2 Project
Goblin Class; APCS*/

import java.util.*;

public class goblinClass {

   public loot(String meeleeWeapon, int damage) {
   
      //define array of available weapons
      String[] lootArray = new String[9];
      lootArray[0] = "Meelee";
      lootArray[1] = "Knife";
      lootArray[2] = "Hammer";
      lootArray[3] = "Shovel";
      lootArray[4] = "Jerry can";
      lootArray[5] = "Flamethrower";
      lootArray[6] = "Shotgun";
      lootArray[7] = "Machete";
      lootArray[8] = "Rocket launcher";
      //Randomly choose the weapon
      String chosenWeapon = (lootArray[new Random().nextInt(lootArray.length)]);
      //Set damage level of enemy based on what weapon is picked
      if (chosenWeapon == lootArray[0]) {
         damage = 100;
         System.out.println("Goblin has not found any new weapons.");
      } else if (chosenWeapon == lootArray[1]) {
         damage = 50;
         System.out.println("Goblin has found a Knife.");
      } else if (chosenWeapon == lootArray[2]) {
         damage = 150;
         System.out.println("Goblin has found a Hammer.");
      } else if (chosenWeapon == lootArray[3]) {
         damage = 300;
         System.out.println("Goblin has found a Shovel.");
      } else if (chosenWeapon == lootArray[4]) {
         damage = 350;
         System.out.println("Goblin has found a Jerry can.");
      } else if (chosenWeapon == lootArray[5]) {
         damage = 200;
         System.out.println("Goblin has found a Flamethrower.");
      } else if (chosenWeapon == lootArray[6]) {
         damage = 250;
         System.out.println("Goblin has found a Shotgun.");
      } else if (chosenWeapon == lootArray[7]) {
         damage = 500;
         System.out.println("Goblin has found a Machete");
      } else {
         System.out.println("No weapons have been chosen!");
      }
   }
}