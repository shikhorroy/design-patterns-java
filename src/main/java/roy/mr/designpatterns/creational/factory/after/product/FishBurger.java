package roy.mr.designpatterns.creational.factory.after.product;

public class FishBurger implements Burger {
    @Override
    public String name() {
        return "Tuna Tango Twist Delight";
    }

    @Override
    public String toString() {
        return "Burger{name=" + name() + "}";
    }
}
