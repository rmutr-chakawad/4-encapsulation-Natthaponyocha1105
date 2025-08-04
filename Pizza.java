import java.util.ArrayList;
import java.util.List;

public class Pizza {
    final private int maxtopping = 10;
    ArrayList<String> toppings = new ArrayList<String>();
    private int totalToppings;

    public double getPrice() {
        if (totalToppings <= 0) {
            return 100;
        } else {
            return totalToppings * 10;
        }
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public void addToppings(String topping) {
        if (this.totalToppings >= maxtopping) {
            System.out.println("Cannot add more toppings. Maximum limit of " + maxtopping + " reached.");
        } else if (!this.toppings.contains(topping)) {
            this.toppings.add(topping);
            this.totalToppings++;
        } else {
            System.out.println("Topping already added: " + topping);
        }
    }

}

