package roy.mr.designpatterns.creational.factory.after.creator;


import roy.mr.designpatterns.creational.factory.after.product.Burger;
import roy.mr.designpatterns.creational.factory.after.product.FishBurger;

public class FishBurgerRestaurant extends Restaurant {
    @Override
    protected Burger prepareBurger() {
        return new FishBurger();
    }
}
