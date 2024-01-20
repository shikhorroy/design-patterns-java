package roy.mr.designpatterns.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        showCoffeeDetails(simpleCoffee);

        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        showCoffeeDetails(milkCoffee);

        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        showCoffeeDetails(sugarCoffee);
    }

    static void showCoffeeDetails(Coffee coffee) {
        System.out.println("Enjoying [" + coffee.getDescription() + "] @" + coffee.getCost() + "TK");
    }
}
