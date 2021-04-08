
/**
 * Purse
 *
 * William Ma
 * 4/2/21
 */
import java.text.*;
import java.util.*;
public class Purse
{
    private static ArrayList<Coin> pocket = new ArrayList<Coin>();
    public Purse(){}
    
    public static void add (Coin coin)
    {
        pocket.add(coin);
    }
    DecimalFormat form = new DecimalFormat("#.00"); 

    public static double getTotal()
    {
        double total=0;
        for (int i=0;i<pocket.size();i++){
            total+=pocket.get(i).getValue();
        }
        return total;
    }
    
    public static int getNumberofDimes(){
        int Coin=0;
        for (int i=0;i<pocket.size();i++){
            if (pocket.get(i).getType()=='D'){
                Coin++;
               }
           }
        return Coin;
       }
       
    public static int getNumberofPenny(){
        int Coin=0;
        for (int i=0;i<pocket.size();i++){
            if (pocket.get(i).getType()=='P'){
                Coin++;
               }
           }
        return Coin;
       }
       
    public static int getNumberofNickels(){
        int Coin=0;
        for (int i=0;i<pocket.size();i++){
            if (pocket.get(i).getType()=='N'){
                Coin++;
               }
           }
        return Coin;
       }
       
    public static int getNumberofQuarters(){
        int Coin=0;
        for (int i=0;i<pocket.size();i++){
            if (pocket.get(i).getType()=='Q'){
                Coin++;
               }
           }
        return Coin;
       }   
       
    public static void RemoveCoin(char c){
        boolean Removed=false;
        for(int i=0;i<pocket.size();i++){
            if (pocket.get(i).getType()==c){
                pocket.remove(i);
                i=pocket.size()+1;
                Removed=true;
                System.out.println("Coin removed");
            }
        }
        if (Removed==false){
                System.out.println("Coin type not in pocket");
        }
    }

    public String toString()
    {
       String Data = Purse.getNumberofPenny()+" Penny     .01\n";
       Data+=Purse.getNumberofNickels()+" Nickels     .05\n";
       Data+=Purse.getNumberofDimes()+" Dimes      .10\n";
       Data+=Purse.getNumberofQuarters()+" Quarters     .25\n";
       Data+="Total  "+form.format(Purse.getTotal())+"\n";
       Data+=pocket.size();
       return Data;
    }

}
