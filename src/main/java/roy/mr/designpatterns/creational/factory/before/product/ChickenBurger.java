package roy.mr.designpatterns.creational.factory.before.product;

public class ChickenBurger implements Burger {
    @Override
    public String name() {
        return "BBQ Chicken Burst";
    }

    @Override
    public String toString() {
        return "Burger{name=" + name() + "}";
    }
}
