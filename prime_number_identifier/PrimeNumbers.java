/**
  * NAME: Theodore Fong
  * DATE: 19 NOV 2010
  * FILE: GradeCalculator2.java
  * COMMENTS: Code works with raptor to identify prime numbers.
  */

public class PrimeNumbers extends eecs.Gui
{
   public static boolean testIfPrime(int number)
   {
      // declare variables
      int divisor = 0;
      boolean prime = false;

      divisor = 2;
      prime = true;
      while (divisor < number && prime == true)
      {
         if (number % divisor == 0)
         {
            prime = false;
         }
         else
         {
         }
         divisor = divisor + 1;
      }
      return prime;
   } // close testIfPrime

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

   public static void main(String[] args)
   {
      // declare variables
      int numberToCheck = 0;
      boolean isPrime = true;

      numberToCheck = getValidInput("Please enter a number between 1 and 100",1,100);
      isPrime = testIfPrime(numberToCheck);
      if (isPrime == true)
      {
         printLine(numberToCheck + " is prime");
      }
      else
      {
         printLine(numberToCheck + " is not prime");
      }
   } // close main
} // close PrimeNumbers
