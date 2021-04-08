
/**
 * Hash Code
 *
 * William Ma
 * 4/1/21
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;


public class HashCode
{


   public static void main(String[] args)
   {

      Account p1 = new Account("Homer Simpson", 0001, 1090.45, 1);
      Account p2 = new Account("Homer Simpson", 0002, 786.54, 2);
      Account p3 = new Account("Bart Simpson", 1564, 4571.60, 1);
      Account p4 = new Account("Liz Wilson", 1349, 2034.52, 2);
      Account p5 = new Account("Jack Hagested", 2389, 280.67, 1);
      Account p6 = new Account("Jack Hagested", 2391, 1008.53, 2);
      Account p7 = new Account("Emy Hayes", 3598, 1260.84, 1);
      Account p8 = new Account("Doug Dralle", 4562, 5783.90, 1);
      Account p9 = new Account("Eric Willhelm", 3208, 3420.75, 1);
      Account p10 = new Account("Julie Noris", 4568, 9041.49, 2);
      /**
       * curly brackets to initialize a list of Objects
       * size will be how many objects you put in the init list
       */

      Account [] myList = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

      Sorts.insertionSort(myList);
      
      //hash Array to be twice the size of the original Array

      Account [] hashList = new Account[myList.length*2];

      for (int i = 0; i < myList.length; i ++)
      {
          System.out.println(myList[i].getName() + " -- " + myList[i].hashCode() + " -  $" + myList[i].getBalance());
      }

      System.out.println();

       for (int i = 0; i < myList.length; i++)
       {
           hashList[Math.abs(myList[i].hashCode())%20] = myList[i];
       }
       System.out.println();
       for (Account s : hashList)
       {
           System.out.println(s);
       }
      
       /*
        * public int hash_code()
    {
        int hash_num = 0;

        for (int i = 0; i< name.length(); i++)
        {
            hash_num+=name.charAt(i);
        }
        hash_num = hash_num*20;
        hash_num *= 15555;
        hash_num = hash_num%13;
        return hash_num;
    }
        */
   }
   
}



/*
 * Output
 * 2389	Jack Hagested	$280.67
Homer Simpson -- 76836956 -  $1090.45
Homer Simpson -- 72239526 -  $786.54
Bart Simpson -- 2013362152 -  $4571.6
Liz Wilson -- 1746852900 -  $2034.52
Jack Hagested -- 1328502763 -  $280.67
Jack Hagested -- 962208977 -  $1008.53
Emy Hayes -- 1243064869 -  $1260.84
Doug Dralle -- 1417064639 -  $5783.9
Eric Willhelm -- 1641227733 -  $3420.75
Julie Noris -- 155711890 -  $9041.49


1349	Liz Wilson	$2,034.52
null
null
2389	Jack Hagested	$280.67
null
null
2	Homer Simpson	$786.54
null
null
3598	Emy Hayes	$1,260.84
4568	Julie Noris	$9,041.49
null
1564	Bart Simpson	$4,571.60
3208	Eric Willhelm	$3,420.75
null
null
1	Homer Simpson	$1,090.45
2391	Jack Hagested	$1,008.53
null
4562	Doug Dralle	$5,783.90
 */








