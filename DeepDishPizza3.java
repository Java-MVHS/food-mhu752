/*
* Megumi Hu p5 10/23/2024 - wednesday
*DeepDishPizza3.java
*
*This programm is a virtual bake sale. It will print out the amount and cost of the food type.
*It will also tell you about the ingredient and the method the food is cooked with.
*/
public class DeepDishPizza3 extends Pizza3
{ //extend pizza class
    // Constructor for DeepDishPizza that accepts only one parameter: the ingredient
    public DeepDishPizza3(String ingredient){
        // Call the superclass (Pizza) constructor to set the ingredient
        super(ingredient, "deep dish pizza"); //override pizza with deep dish pizza
    }
    // Overloaded constructor that allows additional details for preparation method
    public DeepDishPizza3 (String prepMethod, String ingredient){
        
        super(ingredient); //calling the constructor from pizza
        str = "At the sale: deep dish pizza " + prepMethod + " with " + ingredient;
    }
}
