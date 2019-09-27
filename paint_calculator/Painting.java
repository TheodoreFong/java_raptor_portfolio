/**
  * NAME: Theodore Fong
  * DATE: 28 NOV 2010
  * FILE:  Painting.java
  * COMMENTS: Code works with raptor to calculate paint required
  */

public class Painting extends eecs.Gui
{
   public static int getValidInput(String prompt, int lowestValue, int highestValue)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      int userInput = 0;

      raptor_prompt_variable_zzyz = prompt;
      userInput = getInt(raptor_prompt_variable_zzyz);
      while (userInput < lowestValue || userInput > highestValue)
      {
         raptor_prompt_variable_zzyz = "Invalid Entry! " + prompt;
         userInput = getInt(raptor_prompt_variable_zzyz);
      }
      return userInput;
   } // close getValidInput

   public static int calculatePaintGallons(int totalRooms)
   {
      // declare variables
      int counter = 0;
      double wallArea = 1;
      int width = 0;
      int gallons = 0;
      double totalWallArea = 1;
      int length = 0;

      counter = 1;
      width = 0;
      length = 0;
      totalWallArea = 0;
      while (counter <= totalRooms)
      {
         length = getValidInput("Enter the length",1,1000);
         width = getValidInput("Enter the width",1,1000);
         wallArea = 20 * (length + width);
         totalWallArea = totalWallArea + wallArea;
         counter = counter + 1;
      }
      gallons = ceiling(totalWallArea / 400);
      return gallons;
   } // close calculatePaintGallons

   public static void displayCost(int gallonsPaint, int paintCategory)
   {
      // declare variables
      double pricePerGallon = 1;
      double cost = 1;

      if (paintCategory == 1)
      {
         pricePerGallon = 4.75;
      }
      else
      {
         pricePerGallon = 5.5;
      }
      cost = gallonsPaint * pricePerGallon;
      printLine("Cost: $" + cost);
   } // close displayCost

   public static void main(String[] args)
   {
      // declare variables
      int numRooms = 0;
      int gallonsNeeded = 0;
      int paintType = 0;

      numRooms = 0;
      paintType = 0;
      numRooms = getValidInput("Enter the number of rooms",1,10);
      paintType = getValidInput("Enter 1 for flat paint or 2 for glossy paint",1,2);
      gallonsNeeded = calculatePaintGallons(numRooms);
      printLine("Gallons Needed: " + gallonsNeeded);
      displayCost(gallonsNeeded,paintType);
   } // close main
} // close Painting
