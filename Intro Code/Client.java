
/**
 * Client
 *
 * William Ma
 * 4/2/21
 */
import java.util.Scanner;
public class Client
{ 
    
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Client
     */
    public static void main (String args[])
    {
        Purse bag = new Purse();
        Scanner scan = new Scanner (System.in);
        Coin penny = new Coin (0.01,'P');
        Coin nickel = new Coin (0.05, 'N');
        Coin dime = new Coin (0.1, 'D');
        Coin quarter = new Coin (0.25, 'Q');
        
        System.out.println("Choose one: \n a: Add a Coin \n r: Remove a coin \n d: Display purse");
        char cont = scan.next().charAt(0);
        scan.nextLine();
        
        while ( (cont == 'a') || (cont == 'r') || (cont == 'd'))
        {
            if (cont == 'a')
            {
                 System.out.println("What coin would you like to add? \n 1: penny \n 2: nickel \n 3: dime \n 4: quarter");
                 String choice = scan.nextLine();
                 
                 if (choice.equals( "1"))
                 {
                     bag.add(penny);
                    }
                 else if (choice.equals("2"))
                 {
                     bag.add(nickel);
                    }
                 else if (choice.equals("3"))
                 {
                     bag.add(dime);
                    }
                 else if (choice.equals("4"))
                 {
                     bag.add(quarter);
                    }
                }
            else if (cont == 'r')
            {
                 System.out.println("What coin would you like to remove? \n 1: penny \n 2: nickel \n 3: dime \n 4: quarter");
                 String choice = scan.nextLine();
                 
                 if (choice.equals("1"))
                 {
                     bag.RemoveCoin('P');
                    }
                 else if (choice.equals("2"))
                 {
                     bag.RemoveCoin('N');
                    }
                 else if (choice.equals("3"))
                 {
                     System.out.println("hi");
                     bag.RemoveCoin('D');
                    }
                 else if (choice.equals("4"))
                 {
                     bag.RemoveCoin('Q');
                    }
                }
            else if (cont == 'd')
            {
                System.out.println(bag.toString());
            }
            
            System.out.println("Choose one: \n a. Add a Coin \nr. Remove a coin \nd. Display purse \nPress any other key to exit \n");
            System.out.println();
            cont = scan.next().charAt(0);
            scan.nextLine();
        }
 
    }
}