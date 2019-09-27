/**
  * NAME: Theodore Fong
  * DATE: 02 NOV 2010
  * FILE: BankAccount.java
  * COMMENTS: Code works with raptor to simulate bank deposits and withdrawals.
  */

public class BankAccount extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      double transaction = 1;
      double balance = 1;

      raptor_prompt_variable_zzyz = "Enter the starting balance";
      balance = getDouble(raptor_prompt_variable_zzyz);
      raptor_prompt_variable_zzyz = "Enter the value for transaction. Positive values indicate a deposit, negative values indicate a withdrawal, and 0 indicates quit entering transactions";
      transaction = getDouble(raptor_prompt_variable_zzyz);
      while (transaction < 0 || transaction > 0)
      {
         balance = balance + transaction;
         raptor_prompt_variable_zzyz = "Enter the value for transaction. Positive values indicate a deposit, negative values indicate a withdrawal, and 0 indicates quit entering transactions";
         transaction = getDouble(raptor_prompt_variable_zzyz);
      }
      printLine("The final balance is $" + balance);
   } // close main
} // close BankAccount
