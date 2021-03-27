
/**
 * ArrayListRunner
 *
 * @William Ma
 * @3/17/21
 */
import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
      
       // a) Invoke add() to enter the following names in sequence: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry. Print the ArrayList again.
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edwards");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       // b) Invoke get() twice to retrieve and print the first name in the list and the last name in the list.
       System.out.println(names.get(0));
       System.out.println(names.get(names.size()-1));
       
       // c) Print the size() of the ArrayList.
       System.out.println(names.size());

       // e) Use set() to change “Alice” to “Alice B. Toklas”. Print the ArrayList to verify the change.
       names.set(0,"Alice B. Toklas");
       System.out.println(names);
       
       // f) Use the alternate form of add() to insert “Doug” after “David”. Print the ArrayList again.
       names.add(4,"Doug");
       
       // g) Use an enhanced for loop to print each name in the ArrayList.
       for (String i : names)
       {
        System.out.println(i);
        }
       
       // h) Create a second ArrayList called names2 that is built by calling the ArrayList constructor that accepts another ArrayList as an argument. Pass names to the constructor to build 
       //names2. Then print the ArrayList.
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       
       // i) Call names.remove(0) to remove the first element. Print names and names2. Verify that Alice B. Toklas was removed from names, but not from names2.
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
       
       
   }
} 