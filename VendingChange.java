/**

 File name: VendingChange.java

 This program does the following:
  Prompts the user to enter cost of item (between 25 cents and a
		dollar, in 5-cent increments).
  Echoes the cost of the item.
	Determines and displays the change assuming payment of a dollar.


	Assumes amount entered meets the stated criteria, between 25
		cents and a dollar, and in 5-cent increments.

 Based on ChangeMaker.java, Display 2.6
 Modified by: Lew Rakocy
 email address: LRakocy@devrycols.edu
 Date: 8/13/2000
 Last changed: Updated for 4th edition by Brian Durney, November 2004

*/
import java.util.*;

public class VendingChange
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter price of item");
        System.out.println
        	("(from 25 cents to a dollar, in 5-cent increments");
        int originalAmount = keyboard.nextInt();
        int change = 100 - originalAmount;

        int quarters = change/25;
        change = change%25;// remaining change after deducting quarters
        int dimes = change/10;
        change = change%10;// remaining change after deducting dimes, too
        int nickels = change/5;

        //The grammar will be incorrect if any of the values are 1
        //because the required program statements to handle that
        //situation have not been covered, yet.   
        System.out.println
        	("You bought an item for " + originalAmount
        	+ " and gave me a dollar.");
        System.out.println("so your change is");
        System.out.println(quarters + " quarters,");
        System.out.println(dimes + " dimes, and");
        System.out.println(nickels + " nickel.");
    }
}
