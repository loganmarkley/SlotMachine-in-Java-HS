//Author: Logan Markley
//Description: Slot Machine Game
//Date Last Edited: 4/7/18
//Current Steps Completed: all

import java.util.*;
import java.text.*;
public class Markley_SlotMachine
{
    static Scanner s = new Scanner(System.in);
    static Random r=new Random(); 

    static int money = 50;
    static String firstcol;
    static String secondcol;
    static String thirdcol;
    static int roll;
    static int again;
    static int check;

    public static void main (String args[])
    {
        System.out.println("WELCOME TO THE SLOT MACHINE");
        System.out.println("YOU START OFF WITH $50");
        System.out.println("YOU ARE BETTING $5");
        System.out.println("PRESS 1 TO ROLL");
        try  {roll = s.nextInt(); }       
        catch (Exception e)
        {
            System.out.println("Something went wrong.  Try Again");
            main(null);
        }
        
        if (roll != 1)
        {
            main(null);
        }
        else
        {
            System.out.println();
            System.out.println("ROLLING...");        
            System.out.println();

            firstcolumn();
        }
    } 

    public static void firstcolumn ()
    {
        for (int num=0; num<300; num++ )
        {
            int random1 = r.nextInt(4)+1;
            int random2 = r.nextInt(4)+1;        
            int random3 = r.nextInt(4)+1;

            if (random1 == 1)
            {
                firstcol = "-CHERRY-";
            }
            if (random1 == 2)
            {
                firstcol = "-ORANGE-";
            }
            if (random1 == 3)
            {
                firstcol = "--BAR---";
            }
            if (random1 == 4)
            {
                firstcol = "---7----";
            }

            if (random2 == 1)
            {
                secondcol = "-CHERRY-";
            }
            if (random2 == 2)
            {
                secondcol = "-ORANGE-";
            }
            if (random2 == 3)
            {
                secondcol = "--BAR---";
            }
            if (random2 == 4)
            {
                secondcol = "---7----";
            }

            if (random3 == 1)
            {
                thirdcol = "-CHERRY-";
            }
            if (random3 == 2)
            {
                thirdcol = "-ORANGE-";
            }
            if (random3 == 3)
            {
                thirdcol = "--BAR---";
            }
            if (random3 == 4)
            {
                thirdcol = "---7----";
            }
            System.out.println(firstcol+" | "+secondcol+" | "+thirdcol);
            try {
                Thread.sleep(10);                 //x is how many milliseconds it delays
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        secondcolumn();
    }

    public static void secondcolumn ()
    {
        for (int num=0; num<300; num++ )
        {
            int random2 = r.nextInt(4)+1;        
            int random3 = r.nextInt(4)+1;
            if (random2 == 1)
            {
                secondcol = "-CHERRY-";
            }
            if (random2 == 2)
            {
                secondcol = "-ORANGE-";
            }
            if (random2 == 3)
            {
                secondcol = "--BAR---";
            }
            if (random2 == 4)
            {
                secondcol = "---7----";
            }

            if (random3 == 1)
            {
                thirdcol = "-CHERRY-";
            }
            if (random3 == 2)
            {
                thirdcol = "-ORANGE-";
            }
            if (random3 == 3)
            {
                thirdcol = "--BAR---";
            }
            if (random3 == 4)
            {
                thirdcol = "---7----";
            }
            System.out.println(firstcol+" | "+secondcol+" | "+thirdcol);
            try {
                Thread.sleep(10);                 //x is how many milliseconds it delays
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        thirdcolumn();
    }

    public static void thirdcolumn ()
    {
        for (int num=0; num<300; num++ )
        {
      
            int random3 = r.nextInt(4)+1;


            if (random3 == 1)
            {
                thirdcol = "-CHERRY-";
            }
            if (random3 == 2)
            {
                thirdcol = "-ORANGE-";
            }
            if (random3 == 3)
            {
                thirdcol = "--BAR---";
            }
            if (random3 == 4)
            {
                thirdcol = "---7----";
            }
            System.out.println(firstcol+" | "+secondcol+" | "+thirdcol);
            try {
                Thread.sleep(10);                 //x is how many milliseconds it delays
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        end();
    }
    
    public static void end ()
    {
        System.out.println();
        System.out.println(firstcol+" | "+secondcol+" | "+thirdcol);
        
        int cherry1 = firstcol.compareTo("-CHERRY-"); //these four check to see what the first column has as its string
        int orange1 = firstcol.compareTo("-ORANGE-");
        int bar1 = firstcol.compareTo("--BAR---");
        int seven1 = firstcol.compareTo("---7----");
        
        int cherry2 = secondcol.compareTo("-CHERRY-"); //these four check to see what the second column has as its string
        int orange2 = secondcol.compareTo("-ORANGE-");
        int bar2 = secondcol.compareTo("--BAR---");
        int seven2 = secondcol.compareTo("---7----");
        
        int cherry3 = thirdcol.compareTo("-CHERRY-"); //these four check to see what the third column has as its string
        int orange3 = thirdcol.compareTo("-ORANGE-");
        int bar3 = thirdcol.compareTo("--BAR---");
        int seven3 = thirdcol.compareTo("---7----");
        
        check = 0;

        if (seven1 == 0 && seven2 == 0 && seven3 == 0) //these check to see if you get three of a kind
        {
            System.out.println("YOU GOT LUCKY SEVENS!!!");
            System.out.println("YOU WIN $500!!!");
            money = money+ 500;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if (bar1 == 0 && bar2 == 0 && bar3 == 0)
        {
            System.out.println("YOU GOT 3 BARS!!!");
            System.out.println("YOU WIN $300!!!");
            money = money+ 300;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if (orange1 == 0 && orange2 == 0 && orange3 == 0)
        {
            System.out.println("YOU GOT 3 ORANGES!!!");
            System.out.println("YOU WIN $200!!!");
            money = money+ 200;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if (cherry1 == 0 && cherry2 == 0 && cherry3 == 0)
        {
            System.out.println("YOU GOT 3 CHERRYS!!!");
            System.out.println("YOU WIN $50!!!");
            money = money+ 50;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        
        if ( ((seven1 == 0 && seven2 == 0) || (seven2 == 0 && seven3 == 0) || (seven1 == 0 && seven3 == 0)) && check != 1) //these check to see if you get two of a kind
        {
            System.out.println("YOU GOT 2 SEVENS!!!");
            System.out.println("YOU WIN $10!!!");
            money = money+ 10;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if ( ((bar1 == 0 && bar2 == 0) || (bar2 == 0 && bar3 == 0) || (bar1 == 0 && bar3 == 0)) && check != 1 )
        {
            System.out.println("YOU GOT 2 BARS!!!");
            System.out.println("YOU WIN $10!!!");
            money = money+ 10;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if ( ((orange1 == 0 && orange2 == 0) || (orange2 == 0 && orange3 == 0) || (orange1 == 0 && orange3 == 0)) && check != 1)
        {
            System.out.println("YOU GOT 2 ORANGES!!!");
            System.out.println("YOU WIN $10!!!");
            money = money+ 10;
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        if ( ((cherry1 == 0 && cherry2 == 0) || (cherry2 == 0 && cherry3 == 0) || (cherry1 == 0 && cherry3 == 0)) && check != 1)
        {
            System.out.println("YOU GOT 2 CHERRYS!!!");
            System.out.println("YOU WIN $10!!!");
            money = money+ 10;
            System.out.println("YOU NOW HAVE $"+money);
            check = 2;
        }
        
        if ( (cherry1 == 0 || cherry2 == 0 || cherry3 == 0) && (check != 1 && check != 2) ) //checks to see if they got any cherries
        {
            System.out.println("YOU GOT A CHERRY!!!");
            System.out.println("YOU DID NOT LOSE ANY MONEY!!!");
            System.out.println("YOU NOW HAVE $"+money);
            check = 1;
        }
        
        if (check != 1 && check != 2)
        {
            System.out.println("YOU LOST YOUR $5!!!");
            money = money - 5;
            System.out.println("YOU NOW HAVE $"+money);
        }
        
        again();
    }
    
    public static void again ()
    {
        System.out.println();
        System.out.println("Would you like to play again??? (1 for yes, 2 for no)");
        again = s.nextInt();       
        
        
        if (again == 1)
        {
            firstcolumn ();
        }
        else
        {
            System.exit(0);
        }
    }
}