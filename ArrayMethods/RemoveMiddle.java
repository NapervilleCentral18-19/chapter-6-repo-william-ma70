import java.util.Random;

public class RemoveMiddle
{
   public void removeMiddle(int[] arr)
   {
      int size = arr.length;
       // Size is even
       if(size%2 ==2)
         // Figure out starting point for removal
         {
             int middle1 = (arr.length-1)/2;
             int middle2 = (arr.length+1)/2;
            arr[middle1]=0;
            arr[middle2]=0;
            int temp2=0; //{1,2,3,4,5}
            int temp1=arr[middle2];
            int last=arr[arr.length-1];
            for (int s=0; s<arr.length-1; s++)
            {
                temp2 = arr[s+1];
                arr[s+1]=temp1;
                temp1=temp2;
            }
       arr[middle2]=last;
            }

         // Remove middle two elements


      // Size is odd
      else if (size%2==1)
         // Figure out starting point for removal
         {
            int middle = arr.length/2;
            arr[middle]=0;
            int temp2=0; //{1,2,3,4,5}
            int temp1=arr[middle];
            int last=arr[arr.length-1];
            while(arr[arr.length-1]!=0){
            for (int s=middle; s<arr.length-1; s++)
            {
                temp2 = arr[s+1];
                arr[s+1]=temp1;
                temp1=temp2;
            }
        }
       arr[middle]=last;
            }

         // Remove middle element


   }

   public static void main(String[] args)
   {
      int[] randoms = new int[11];
      RemoveMiddle util = new RemoveMiddle();
      Random generator = new Random();

      // Create a test array containing random numbers
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      randoms = new int[10];
      // Create a test array with an even number of elements
      for (int i = 0; i < randoms.length; i++)
      {
         randoms[i] = generator.nextInt(100) + 1;
         // Print the values as they are assigned.
         System.out.print(randoms[i] + " ");
      }
      System.out.println();

      // Remove the middle element(s)
      util.removeMiddle(randoms);

      // Print again to see new order.
      for (int i = 0; i < randoms.length; i++)
      {
         System.out.print(randoms[i] + " ");
      }
      System.out.println();
   }
}
