
/**
 * Coin
 *
 * William Ma
 * 4/2/21
 */
import java.util.Random;
import java.util.Scanner;

public class Coin
{
   double val;
   char type_coin;

   public Coin (double amount, char coin)
   {
      val = amount;
      type_coin = coin;
   }
   
   public char getType()
   {
       return type_coin;
    }
    
   public double getValue()
   {
       return val;
    }

   public String toString()
   {
      String faceName;
      faceName = getType() + " " + getValue();
      return faceName;
   }
}