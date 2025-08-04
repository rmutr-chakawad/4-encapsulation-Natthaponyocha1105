public class testpizza {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();

        myPizza.addToppings("Cheese");
        myPizza.addToppings("Pepperoni");
        myPizza.addToppings("Mushroom");
        myPizza.addToppings("Cheese"); // ทดสอบ topping ซ้ำ

        System.out.println("Total toppings: " + myPizza.getTotalToppings());
        System.out.println("Price of pizza: " + myPizza.getPrice());
    }
}
