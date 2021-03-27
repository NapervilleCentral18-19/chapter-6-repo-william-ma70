
/**
 * storeDemo
 *
 * William Ma
 * 3/20/21
 */
import java.util.*;
public class storeDemo
{   
    public static void main(String[] args)   
    {      
        Store myStore = new Store();      
        Scanner in = new Scanner(System.in);      
        boolean done = false;      
        int i = 0;      
        while (!done)      
        {         
            System.out.println("Enter the price: ");         
            double d = in.nextDouble();         
            if (d == 0)         
            {            
                done = true;         
            }         
            else         
            {
                System.out.println("Enter your name: "); 
                Scanner keyboard = new Scanner(System.in); 
                String name = keyboard.nextLine();
                myStore.addSale(name,d);         
            }      
        }      
        System.out.println("Best customer's name "+ myStore.nameOfBestCustomer());
    }
}

/*
 * Output:
 * Enter the price: 
10
Enter your name: 
William
Enter the price: 
20
Enter your name: 
Jim
Enter the price: 
15
Enter your name: 
Sally
Enter the price: 
0
Best customer's name Jim
 */