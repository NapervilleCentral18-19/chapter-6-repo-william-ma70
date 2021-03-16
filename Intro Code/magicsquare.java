
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
    private int magicnum;
    private int [] [] square;
    public magicsquare(int [] [] array)
    {
        setMagicSquare(array);
        
        //sets the magicnum = one row/col of the array
        
    }
    
    public boolean isMagic()
    {
        boolean magic=true;
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
        if ((addDiagonals()/2)!=magicnum)
        {
            magic = false;
        }
        return magic;
    }
    
    public int getMagicNum()
    {
        return magicnum;
    }
    public void setMagicSquare(int [] [] array)
    {
        square = array;
        magicnum=addRow(0);
    }
    public int addRow(int row)
    {
        int rowsum=0;
        for (int s=0; s<square[row].length; s++)
             rowsum+=square[row] [s];
        return rowsum;
    }
    public int addColumns(int col)
    {
        int colsum=0;
        for(int s=0; s<square.length; s++)
            colsum+=square[s] [col];
        return colsum;
    }
    public int addDiagonals()
    {
        int diagsum=0;
        for(int s=0; s<square.length; s++)
            diagsum+=square[s] [s];
        for(int s=0; s<square.length; s++)
            diagsum+=square[s] [square.length-s-1];
        return diagsum;
    }
    
    //comment loops – what row, column, or diagonal are the totaling
    
}// end of class
