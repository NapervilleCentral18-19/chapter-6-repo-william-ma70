/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{

/**/
        mathy useful = new mathy();
        int x = 50;
        
        
        int[] values; //defines my array
        //int values1 [];
        
        //values are numbers are aliases
        values = useful.poprandomArray(MAX,10);
        
        
        /*
         * use an enhanced for loop to print all items in the array
         * do not use i, this denotes an index
         * s is a copy of the value in the array
         * s = value[0], s=values[1] .. [n]
         * advantage: not give an out of bounds error
         * limits: will not change the int value in the array
         */
        for (int s: values)
        {
             System.out.println(s);
             s=0;
          }
        System.out.println(values[0]+"---");
        foo((values[0]));
        System.out.println(values[0]+"VVV");
        foo(values);
        System.out.println(values[0]+"RRR");
        System.out.println(oddnumbers(values));
/*

        System.out.println(Searches.linearSearch(num,look)  );
        Sorts.selectionSort(num);
        System.out.println(Searches.binarySearch(num,look)  );



        //for each loop
/*

        useful.getOdd(num,oddnum);




        //System.out.println("----------SORTING-----------"  );






/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*







 /*
       //make a two dementional array
       int [][] table = new int [5][10];

       // Load the table with values
       for (int row=0; row < table.length; row++)
          for (int col=0; col < table[row].length; col++)
             table[row][col] = row * 10 + col;

       //print the table
        for (int row=0; row < table.length; row++)
        {
            for (int col=0; col < table[row].length; col++)
                System.out.print (table[row][col] + "\t");

            System.out.println();
        }


    // make a 2d array with an iniitalizer list.
    //print the length of row and col
/*
    int [][] scores = { {1,2,3},//6
                        {2,2,3},//7
                        {3,2,3},//8
                        {4,2,3}    };//9

    //how many columns
    System.out.println(scores[0].length+"col");
    //how many rows
    System.out.println(scores.length+"row");

    //sum entire 2D array
    System.out.print("The sum of this array is" );

    //sum a row of 2D array
    System.out.print("The sum of row "));







/**/
}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    /*
     * @param array
     * @return int of how many odd values are in the array
     */


   public static int oddnumbers(int [] numbers)
   {
       
       int count =0;
       //for (int s:numbers)
       for (int i=0; i<numbers.length;i++)
        {
             if ((numbers[i]%2)==1);
                count++;
          }
          
       return count;


   }// end of odd

    /*  */
}// end of class











