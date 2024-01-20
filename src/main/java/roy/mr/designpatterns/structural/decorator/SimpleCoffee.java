package roy.mr.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "simple coffee";
    }
}
