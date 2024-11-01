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
