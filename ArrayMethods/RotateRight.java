import java.util.Random;

public class RotateRight
{
    //[1,4,2,5,8,7] rotatesRight to --> [7,1,4,2,5,8]
   public void rotateRight(int[] arr)
   {
       int temp2=0; //{1,2,3,4,5}
       int temp1=arr[0];
       int last=arr[arr.length-1];
       for (int s=0; s<arr.length-1; s++)
            {
                temp2 = arr[s+1];
                arr[s+1]=temp1;
                temp1=temp2;
            }
       arr[0]=last;
   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      RotateRight util = new RotateRight();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Rotate the array once to the right.
      util.rotateRight(randoms);

      // Print again to see new order.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
