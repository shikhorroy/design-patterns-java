package roy.mr.designpatterns.creational.factory.before;

import roy.mr.designpatterns.creational.factory.before.product.Burger;
import roy.mr.designpatterns.creational.factory.before.product.ChickenBurger;
import roy.mr.designpatterns.creational.factory.before.product.FishBurger;
import roy.mr.designpatterns.creational.factory.before.product.VegBurger;

public class Restaurant {

    private Burger prepareBurger(String type) {
        if (type.equals("fish")) return new FishBurger();
        else if (type.equals("veg")) return new VegBurger();
        else return new ChickenBurger();
    }

    public Burger order(String burgerType) {
        return prepareBurger(burgerType);
    }
}
