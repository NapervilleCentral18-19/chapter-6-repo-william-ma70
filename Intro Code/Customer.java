
/**
 * Customer
 *
 * William Ma
 * 3/20/21
 */
public class Customer
{
    private String name;
    private double amount;
    public Customer(String name, double amount)
    {
        this.name = name;
        this.amount = amount;
    }
    public String getName()
    {
        return name;
    }
    public double getAmount()
    {
        return amount;
    }
    public String toString()
    {
        return name + "\t" + amount;
    }
}