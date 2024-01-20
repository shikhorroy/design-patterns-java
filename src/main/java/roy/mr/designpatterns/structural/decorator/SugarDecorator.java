package roy.mr.designpatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sugar";
    }
}
