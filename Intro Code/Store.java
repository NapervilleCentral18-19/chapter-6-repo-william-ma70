
/**
 * Store
 *
 * William Ma
 * 3/20/21
 */

import java.util.ArrayList;
public class Store
{
    ArrayList<Customer> customers = new ArrayList<Customer>();
    public Store(){
        
        
    }
    public void addSale(String customerName, double amount)
    {
        Customer c = new Customer(customerName,amount);
        customers.add(c);
        
    }
    public String nameOfBestCustomer()
    {
        double maxSale=0;
        String bestCustomer = new String("");
        for (Customer customer: customers)
        {
            if (customer.getAmount() > maxSale)
            {
                maxSale = customer.getAmount();
                bestCustomer = customer.getName();
            }
        }
        
        return bestCustomer;
        
    }
}
