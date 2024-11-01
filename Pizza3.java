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
