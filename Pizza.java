/*
* Megumi Hu p5 10/23/2024 - wednesday
*Pizza.java
*
*/

public class Pizza extends Food
{
	protected String ingredientIn; //declaring variables
	protected String name; 
	public Pizza() //default constructor
	{
	}
	
	public Pizza (String ingredientIn) 
	{
		super("baked", ingredientIn, "pizza"); //calling the constructor from Food.java
	}
	public Pizza(String ingredientIn, String nameIn)
	{
			super("baked", ingredientIn, nameIn); //calling the constructor from Food.java
	}
}
