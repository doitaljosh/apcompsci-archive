/*Josh Currier
Quarter 2 Project
Goblin Class; APCS*/

import java.util.*;
import java.lang.*;

public class goblinClass {

   public int width; //Playfield width
   public int height; //Playfirld height
   public int playField; //Playfield area
   public int damage; //Declare damage variable
   public int maxDamage = 80; //Maximum damage level
   public int chosenWeapon; //Set default weapon
   public int action; //Declare action variable
   public int health = 1000; //Maximum health level
   public int maxHealth = 1000;
   public int minHealth = 0; //Minimum health threshold
   public int playerHealth = 1000; //Maximum player health level
   public boolean clearedPos; //Cleared position boolean
   public int availPos = playField; //Declare the maximum available positions to equal the area of the playfield
   
   //I know you're triggered by this, but it's not what you think.
   Thread loot = new Thread(new Runnable() {
   
      public void run() {
         //define array of available looted weapon damages
         int[] lootDamage = {10, 20, 30, 40, 50, 60, 70, 80};
         //Set and define the dungeon size
         width = 8;
         height = 8;
         playField = width * height;
         //Randomly choose weapon until all of the play area is discovered
         for(int i = 1; i <= playField; i++) {
            chosenWeapon = (lootDamage[new Random().nextInt(lootDamage.length)]);
               //Sets damage level of weapon based on what weapon is selected.
               if (chosenWeapon == lootDamage[0]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has not found any new weapons. Damage remains 10.");
                } else if (chosenWeapon == lootDamage[1]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Knife. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[2]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Hammer. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[3]) {  
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Shovel. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[4]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Jerry can. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[5]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Katana. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[6]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Rocket Launcher. Damage is now: " + damage);
                } else if (chosenWeapon == lootDamage[7]) {
                   damage = chosenWeapon;
                   System.out.println("Goblin has found a Torch. Damage is now: " + damage);
                } else {
                   System.out.println("Goblin has not found any new weapons.");
                }
            //Catch exceptions. Why? Because Java.       
            try {
            Thread.sleep(2000);
            } catch(InterruptedException e) {
            }           
         }
      }
   });
   
   Thread goblinAction = new Thread(new Runnable() {
   
      public void run() {
         //define array of goblin actions
         int[] goblin = {750, 500, 250, chosenWeapon, 1, 2};
         //Randomly choose what the goblin will do within position size
         for(int i = 1; i <= playField; i++) {
            action = (goblin[new Random().nextInt(goblin.length)]);
            //Attack player
            if (action == goblin[1]) {
               playerHealth = playerHealth - chosenWeapon;
               System.out.println("Goblin has attacked the player! The player's health is now: " + playerHealth * 100 / health + "%");
            } else {
               switch (action) {
                  //Health boosters
                  case 750:
                     if (health >= 250) {
                        System.out.println("Goblin has restored 75% health.");
                        health = health + 750;
                     } else {
                        System.out.println("Goblin has restored 50% health. It is currently:" + health * 100 / maxHealth);
                        health = health + 500;
                     }
                     break;
                  case 500:
                     if (health >= 500) {
                        System.out.println("Goblin has restored 50% health. It is currently:" + health * 100 / maxHealth);
                        health = health + 500;
                     } else {
                        System.out.println("Goblin has restored 25% health. It is currently:" + health * 100 / maxHealth);
                        health = health + 250;
                     }
                     break;
                  case 250:
                     if (health >= 750) {
                        System.out.println("Goblin has restored 25% health. It is currently:" + health * 100 / maxHealth);
                        health = health + 250;
                     } else {
                     //do nothing.
                     }
                     break;
                  //Player attacks goblin
                  case 1:
                     System.out.println("Goblin has been attacked.");
                     health = health - chosenWeapon;  
                     break;
                  case 2:
                  //   System.out.println("Player has restored 5% health");
                  //   playersHealth = playersHealth + 50;
                     break;
                  //This should never run, except in the case of a solar flare or an EMP WMD.
                  default:
                     System.out.println("Something seriously bad has happened! Go get some cover!");
                     System.out.println("Goblin.exe has stopped responding.");
                  } 
            }  
            //Stop running if goblin has reached minimum health threshold
            if (health <= minHealth) {
               System.out.println("Goblin has died!");
               System.exit(1);
            }
            if (playerHealth <= 0) {
               System.out.println("The player has died.");
               System.exit(1);
            }
            //Catch exceptions. Why? Because Java.
            try {
            Thread.sleep(2000);
            } catch(InterruptedException e) {
            }
         }
      }
   });
   
   public void startThreads() {
      loot.start();
      goblinAction.start();
   }
   
}