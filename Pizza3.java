/*
* Megumi Hu p5 10/23/2024 - wednesday
*Pizza3.java
*
*This programm is a virtual bake sale. It will print out the amount and cost of the food type.
*It will also tell you about the ingredient and the method the food is cooked with.
*/
public class Pizza3 extends Food3 { //extend food class
    // Constructor for Pizza that accepts only one parameter: the ingredient
    public Pizza3(String ingredient) {
        // Call the superclass (Food) constructor with "baked" as the prepMethod,
        // "pizza" as the name, and the provided ingredient
        super("baked", ingredient, "pizza"); //only add the ingredient
    }
    public Pizza3(String ingredient, String foodName) {
        super("baked", ingredient, foodName); //add ingredient/name
        //calling the constructor from Food
    }
}
