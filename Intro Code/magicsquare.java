
/**
 * Magic Square
 *
 * William Ma
 * 3/14/21
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class magicsquare
{
    public int magicnum;
    public int [] [] square;
    public magicsquare(int [] [] array)
    {
        setMagicSquare(array);
        magicnum=addRow(0);
        System.out.println("magicnum:"+magicnum);
        //sets the magicnum = one row/col of the array
        
    }
    
    public boolean isMagic()
    {
        boolean magic=true;
        System.out.println(square.length);
        for(int s=0; s<square.length; s++)
        {
            
            if (addRow(s)!=magicnum)
            {
                magic=false;
                break;
            }
            }
        for(int i=0; i<square[0].length; i++)
        {
            if (addColumns(i)!=magicnum)
            {
                magic=false;
                break;
            }
            }     
        System.out.println(magic);
        return magic;
    }
    
    public int getMagicNum()
    {
        return magicnum;
    }
    public void setMagicSquare(int [] [] array)
    {
        square = array;
    }
    public int addRow(int row)
    {
        int rowsum=0;
        for (int s=0; s<square[row].length; s++)
             rowsum+=square[row] [s];
        return rowsum;
    }
    int addColumns(int col)
    {
        int colsum=0;
        for(int s=0; s<square.length; s++)
            colsum+=square[s] [col];
        return colsum;
    }
    //comment loops – what row, column, or diagonal are the totaling
    
}// end of class
