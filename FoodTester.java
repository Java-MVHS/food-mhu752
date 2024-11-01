/*
* Megumi Hu p5 10/23/2024 - wednesday
*FoodTester3.java
*
*This programm is a virtual bake sale. It will print out the amount and cost of the food type.
*It will also tell you about the ingredient and the method the food is cooked with.
*/
import java.util.Scanner;
public class FoodTester
{
	public FoodTester() //default constructor
	{
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n\n\n"); //print 3 lines
		Food food1 = new Food ("baked", "banana", "muffins"); //setting PrepMethod, ingredient, foodName for food1, food 2, pizza, DeepFishPizza
		food1.printForSale();
		Food food2 = new Food ("fried", "yam", "fritters");
		food2.printForSale();
		Pizza pizza = new Pizza ("pepperoni");
		pizza.printForSale();
		DeepDishPizza dp = new DeepDishPizza("fish"); 
		dp.printForSale();
		System.out.println("\n\n\n"); //print 3 lines

	}
}
