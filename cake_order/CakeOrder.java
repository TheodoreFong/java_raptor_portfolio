/**
  * NAME: Theodore Fong
  * DATE: 26 OCT 2010
  * FILE: CakeOrder.java
  * COMMENTS: Code works with raptor to simulate ordering a cake.
  */

public class CakeOrder extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      int cakeChoice = 0;
      double totalCost = 1;
      String cakeType = "";
      double balloonCost = 1;
      double cakeCost = 1;
      String lastName = "";
      int numBalloons = 0;
      int balloons = 0;

      raptor_prompt_variable_zzyz = "Enter your last name";
      lastName = getString(raptor_prompt_variable_zzyz);
      raptor_prompt_variable_zzyz = "Enter your cake choice: Type 1 for chocolate, 2 for white, 3 for strawberry, and 4 for marble";
      cakeChoice = getInt(raptor_prompt_variable_zzyz);
      if (cakeChoice == 1)
      {
         cakeType = "chocolate";
      }
      else
      {
         if (cakeChoice == 2)
         {
            cakeType = "white";
         }
         else
         {
            if (cakeChoice == 3)
            {
               cakeType = "strawberry";
            }
            else
            {
               cakeType = "marble";
            }
         }
      }
      cakeCost = 15;
      printLine("You have ordered a " + cakeType + " cake.");
      raptor_prompt_variable_zzyz = "Would you like to add balloons to the order? If yes, type 1. If no, type 0";
      balloons = getInt(raptor_prompt_variable_zzyz);
      if (balloons == 1)
      {
         raptor_prompt_variable_zzyz = "Enter the number of balloons you would like to purchase";
         numBalloons = getInt(raptor_prompt_variable_zzyz);
         if (numBalloons >= 10)
         {
            balloonCost = 0.25 * numBalloons;
         }
         else
         {
            balloonCost = 0.35 * numBalloons;
         }
      }
      else
      {
         balloonCost = 0;
      }
      totalCost = cakeCost + balloonCost;
      printLine("Your order for CDT " + lastName + " will cost $" + totalCost + ".");
   } // close main
} // close CakeOrder
