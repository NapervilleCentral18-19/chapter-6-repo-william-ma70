
/**
 * Write a description of class countodd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class countodd
{
    public static void main(String args[])
    {
       int [] numbers = {4,2,5,6,8,92,63,75,31};
       int count =0;
       for (int s: numbers)
       //for (int i=0; i<numbers.length;i++)
        {
             if ((s % 2) !=0)
                count++;
          }
       System.out.println(count);
    }
}
