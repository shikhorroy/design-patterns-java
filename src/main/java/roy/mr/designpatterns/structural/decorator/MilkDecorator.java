package roy.mr.designpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + milk";
    }
}
