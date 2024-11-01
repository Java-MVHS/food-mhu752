/* 
 * header
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
