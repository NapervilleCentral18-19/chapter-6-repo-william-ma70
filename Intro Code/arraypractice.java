
/**
 * Write a description of class arraypractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;
public class arraypractice
{
    public static void main (String[] args)
{
    Random generator = new Random();
    
    ArrayList <Integer> list1 = new ArrayList<>();
    
    for (int i = 0; i<10;i++)
        list1.add(generator.nextInt(10));
    System.out.println(list1);
    
    int temp=0;
    for (int i = list1.size(); i>0; i--)
    {
        temp+=list1.get(i-1);
    }
    int avg=temp/list1.size();
    list1.add(avg);
    System.out.println("avg: "+avg);
    System.out.println(list1);
    
    ArrayList <Integer> reverse = new ArrayList<>();
    for (int i = list1.size(); i>0; i--)
    {
        reverse.add(list1.get(i-1));
    
    }
    System.out.println(reverse);
    }
}
