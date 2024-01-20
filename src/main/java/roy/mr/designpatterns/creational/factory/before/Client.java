package roy.mr.designpatterns.creational.factory.before;

public class Client {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        System.out.println("Oh yeah! I love " + restaurant.order("fish"));
        System.out.println("Oh yeah! " + restaurant.order("chicken") + " is great!");
        System.out.println(restaurant.order("veg") + " is great!");
    }
}