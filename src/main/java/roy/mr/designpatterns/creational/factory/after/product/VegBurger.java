package roy.mr.designpatterns.creational.factory.after.product;

public class VegBurger implements Burger {
    @Override
    public String name() {
        return "Garden Glory Veggie Delight";
    }

    @Override
    public String toString() {
        return "Burger{name=" + name() + "}";
    }
}
