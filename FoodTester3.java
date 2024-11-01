public class FoodTester3 {
    public static void main (String[] args) {
        Food muffins = new	Food ("baked", "banana", "muffins"); //prepMethod, ingredient, name
        Food fritters = new Food("fried", "yam", "fritters"); //prepMethod, ingredient, name
        Pizza	pizza = new Pizza ("pepperoni"); //put in ingredient
        muffins.printForSale();//calls the method to print Muffins
        fritters.printForSale(); //calls the method to print Fritters
        pizza.printForSale(); //calls the method to print Pizza
        muffins.printForSale(50, 12); //input cost/amt for muffins
        fritters.printForSale(100, 3); //input cost/amt for fritters
        pizza.printForSale(250, 8); //input cost/amt for pizza
    }
}


