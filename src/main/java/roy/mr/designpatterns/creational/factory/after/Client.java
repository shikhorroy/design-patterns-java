package roy.mr.designpatterns.creational.factory.after;

import roy.mr.designpatterns.creational.factory.after.creator.ChickenBurgerRestaurant;
import roy.mr.designpatterns.creational.factory.after.creator.FishBurgerRestaurant;
import roy.mr.designpatterns.creational.factory.after.creator.Restaurant;
import roy.mr.designpatterns.creational.factory.after.creator.VegBurgerRestaurant;

public class Client {
    public static void main(String[] args) {

        Restaurant restaurant1 = new FishBurgerRestaurant();
        System.out.println("Oh yeah! I love " + restaurant1.order());

        Restaurant restaurant2 = new ChickenBurgerRestaurant();
        System.out.println("Oh yeah! " + restaurant2.order() + " is great!");

        Restaurant restaurant3 = new VegBurgerRestaurant();
        System.out.println(restaurant3.order() + " is great!");
    }
}