import java.util.Random;

public class MoveEvenToFront
{
   public void moveEvenToFront(int[] arr)
   {
      // Even
      // Save the even number
      int endOfEvens = 0;
      int temp;
      int nextOpen = 0;
      
      for (int i=0; i<arr.length; i++) {
          if (arr[i]%2==0) {
              temp = arr[nextOpen];
              // Move array element from end of
              // evens to current location
              arr[nextOpen] = arr[i];
              arr[i] = temp;
              nextOpen++;
          }
      }
   }

          

   public static void main(String[] args)
   {
      int[] randoms = new int[10];
      MoveEvenToFront util = new MoveEvenToFront();
      Random generator = new Random();

      // Create a test array containing random numbers.
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Move the evens to the front.
      util.moveEvenToFront(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
