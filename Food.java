/*
* Megumi Hu p5 10/23/2024 - wednesday
*Food.java
*
*This programm is a virtual bake sale. It will print out the amount and cost of the food type.
*It will also tell you about the ingredient and the method the food is cooked with.
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
