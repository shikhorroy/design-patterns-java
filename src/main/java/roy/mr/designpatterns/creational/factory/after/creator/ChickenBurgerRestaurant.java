package roy.mr.designpatterns.creational.factory.after.creator;

import roy.mr.designpatterns.creational.factory.after.product.Burger;
import roy.mr.designpatterns.creational.factory.after.product.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {
    @Override
    protected Burger prepareBurger() {
        return new ChickenBurger();
    }
}
