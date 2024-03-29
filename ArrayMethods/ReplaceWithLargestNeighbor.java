import java.util.Random;

public class ReplaceWithLargestNeighbor
{
   public void replaceWithLargestNeighbor(int[] arr)
   {
      // Start loop at one, and stop before the end
      for(int s=1; s<arr.length; s+=2)
      {
          if(arr[s]>arr[s-1])
            arr[s-1]=arr[s];
          else if (arr[s-1]>arr[s])
            arr[s] = arr[s-1];
        }
   }

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      ReplaceWithLargestNeighbor util = new ReplaceWithLargestNeighbor();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < 10; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Replace with largest neighbor
      util.replaceWithLargestNeighbor(randoms);

      // Print again to see new elements.
      for (int i = 0; i < 10; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
