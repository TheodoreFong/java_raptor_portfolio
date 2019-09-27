/**
  * NAME: Theodore Fong
  * DATE: 17 DEC 2010
  * FILE: SwimMeet.java
  * COMMENTS: Code works with raptor to score a swim meet.
  */

public class SwimMeet extends eecs.Gui
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
         raptor_prompt_variable_zzyz = "Invalid Entry " + prompt;
         userInput = getInt(raptor_prompt_variable_zzyz);
      }
      return userInput;
   } // close getValidInput

   public static int getEventScore()
   {
      // declare variables
      int counter = 0;
      int score = 0;
      int points = 0;
      int finish = 0;

      score = 0;
      counter = 0;
      while (counter < 3)
      {
         finish = getValidInput("What place did the swimmer finish (1-6)",1,6);
         points = 6 - finish;
         if (finish == 1)
         {
            points = points + 4;
         }
         else
         {
         }
         score = score + points;
         counter = counter + 1;
      }
      return score;
   } // close getEventScore

   public static void outputFinalResults(int total1, int total2)
   {
      if (total1 > total2)
      {
         printLine("Team 1 wins " + total1 + " to " + total2 + "!");
      }
      else
      {
         if (total2 > total1)
         {
            printLine("Team 2 wins " + total2 + " to " + total1 + "!");
         }
         else
         {
            printLine("The final score is tied at " + total1 + ".");
         }
      }
   } // close outputFinalResults

   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      int team2Total = 0;
      int team1Total = 0;
      int team2Score = 0;
      String eventName = "";
      int anotherEvent = 0;
      int team1Score = 0;

      team1Total = 0;
      team2Total = 0;
      anotherEvent = 1;
      while (anotherEvent == 1)
      {
         raptor_prompt_variable_zzyz = "Enter the swimming event name";
         eventName = getString(raptor_prompt_variable_zzyz);
         team1Score = getEventScore();
         team1Total = team1Total + team1Score;
         team2Score = 19 - team1Score;
         team2Total = team2Total + team2Score;
         printLine("Team 1's score for the " + eventName + " event is " + team1Score + ".");
         printLine("Team 2's score for the " + eventName + " event is " + team2Score + ".");
         anotherEvent = getValidInput("Would you like to add another event? (1-yes, 0-no)",0,1);
      }
      outputFinalResults(team1Total,team2Total);
   } // close main
} // close SwimMeet
