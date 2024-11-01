/* Write your heading
 * Megumi.Hu 10/23/2024 - Wednesday
 * Food.java
 *
 */

import java.util.Scanner;
public class Food
{
	protected String str; //declaring str
	
	public Food () //default constructor
	{
		str = new String("");
	}
	public Food (String prepMethod, String ingredient, String name) //constructor
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;
	}
	public void printForSale()
	{
		System.out.println(str); //print str
	}
}
