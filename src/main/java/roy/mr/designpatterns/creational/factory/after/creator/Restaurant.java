package roy.mr.designpatterns.creational.factory.after.creator;

import roy.mr.designpatterns.creational.factory.after.product.Burger;

public abstract class Restaurant {

    protected abstract Burger prepareBurger();

    public Burger order() {
        return prepareBurger();
    }
}
