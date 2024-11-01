/*
* Megumi Hu p5 10/23/2024 - wednesday
*Food3.java
*
*This programm is a virtual bake sale. It will print out the amount and cost of the food type.
*It will also tell you about the ingredient and the method the food is cooked with.
*/
public class Food3 {
    protected String str; //initializing str as protected
    protected String foodName; //initializing foodName as protected
    // Default constructor
    public Food3() {
        str = ""; //set str as blank
        foodName = ""; //same with str
    }
    // Parameterized constructor
    public Food3(String prepMethod, String ingredient, String foodName) { //constructor
        str = "At the sale: " + foodName + " " + prepMethod + " with " + ingredient; //declaring str
    }
    // Method to print the sale message
    public void printForSale() {
        System.out.println(str); //print str
    }
    public void printForSale(int cost, int amount) { //initializing the cost/amount
        String s = String.format("%s will be sold for %d cents each. With %d %s(s), $%.2f can be made", str, cost, amount, foodName, cost * amount / 100.0); //using String.format()
        System.out.println(s); //print
    }
}
