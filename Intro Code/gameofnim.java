
/**
 * Game of Nim.
 *
 * William Ma. Partners: Benjamin Wang and Dane Engman
 * 3/10/21
 */

import java.util.Scanner;
public class gameofnim
{
    static int[] stones = {3, 5, 8};
    static Scanner keyboard= new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    
    public static void displayNim()
    {
        for(int col=0; col<stones.length;col++)
            {
                for (int i=0;i<stones[col];i++)
                    System.out.print("O");
                    
                System.out.println();
        }
    }
    
    public static void takeStones(int col, int take)
    {
        if (stones[col-1]>=take)
            stones[col-1]-=take;
        else
            System.out.println("Invalid number of stones");
    }
    
    public static void reset()
    {
        stones[0]=3;
        stones[1]=5;
        stones[2]=8;
    }
    
    
    public static void main (String[] args)
{
    boolean again=true;
    while(again)
    {
        gameofnim.displayNim();
        while(stones[0]!=0 || stones[1]!=0 || stones[2]!=0)
    {
        System.out.println("Player 1, which column do you choose?: ");
        int col = keyboard.nextInt();
        System.out.println("Player 1, how many stones do you take?: ");
        int take = keyboard.nextInt();
        
        gameofnim.takeStones(col,take);
        gameofnim.displayNim();
        if(stones[0]==0 && stones[1]==0 && stones[2]==0)
        {
            System.out.println("Player 2 Wins! Would you like to play again?(y/n)");
            String cont=in.nextLine();
            if (cont=="y")
                break;
            else{
                again=false;
                break;
            }
        }
        else{
        System.out.println("Player 2, which column do you choose?: ");
        col = keyboard.nextInt();
        System.out.println("Player 2, how many stones do you take?: ");
        take = keyboard.nextInt();
        gameofnim.takeStones(col,take);
        gameofnim.displayNim();
        if(stones[0]==0 && stones[1]==0 && stones[2]==0)
        {
            System.out.println("Player 1 Wins! Would you like to play again?(y/n)");
            String cont=in.nextLine();
            if (cont!="y")
                again=false;
            else
                again=true;
            
        }
    }
    }
    gameofnim.reset();
    }
    
    
}
}
