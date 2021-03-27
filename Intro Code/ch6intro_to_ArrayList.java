/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_ArrayList

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //ArrayList notes
/*
    // <> indicates the type of ArrayList
    ArrayList <String> farm = new ArrayList<>();

    farm.add("cow");farm.add("chicken");
    for (int i = 0; i<20;i++)
    {
        farm.add("cow");
        farm.add("chicken");
        farm.add("chicken");
        farm.add("duck");
        farm.add("horse");

    }
    farm.add("dog");farm.add("dog");farm.add("dog");
    farm.add("pig");farm.add("pig");farm.add("pig");
    farm.add("pig");farm.add("pig");farm.add("pig");

    System.out.println(farm);

    int count = 0;
    for (int i = 0; i<farm.size();i++)
    {
        if(farm.get(i).equals("chicken"))
            count++;

            if (farm.get(i).equals("chicken"))
            farm.remove(i);

            else
                i++;
    }
    
    //add( index, object) adds the obj at said index
    farm.add(1,"daughter");
    farm.add(1,"son");
    
    //set(index,obj) returns the obj at said index. like replace
    String obj = farm.set(1,"wife");
    farm.set(1,"wife");
    
    
    

    System.out.println("There are " + count+ " chickens");

    System.out.println(farm);
    */
   
    // insert into an ArrayList in order
    Scanner in = new Scanner(System.in);
    ArrayList <Integer> numbers = new ArrayList<>();
    int num;
    int j=0;
    for (int i = 0; i<10; i++)
    {
        System.out.println ("Enter a Integer");
        num = in.nextInt();
        //first number is 628 where do I put it?
        if (numbers.size() == 0)
            numbers.add(num);
        else
        {
            j=0;
            while(j<numbers.size() && num>numbers.get(j))
                j++;
            numbers.add(j,num);
        }
        System.out.println(numbers);
       // add to arrayList in order        
    }

    
    /*

    ArrayList <String> list = new ArrayList<>();

    //ArrayList <int> list1 = new ArrayList<>();// no primitive data types

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
    
    
    
/*
    ArrayList <CD> mycds = new ArrayList<>();

    //for(int i = 0; i<3; i++)
    //{

    mycds.add(new CD("Wilco","Jeff Tweety",12.99,16));
    mycds.add(new CD("Throwup","Britiny Spears",12.99,16));
    mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16));

    System.out.print(mycds);

    //}
*/


}// end of main

}// end of class











