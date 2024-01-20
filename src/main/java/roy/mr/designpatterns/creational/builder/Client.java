package roy.mr.designpatterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Meal meal1 = new Meal.Builder("Chicken Burger")
                .drink("Coke")
                .dessert("Brownie")
                .build();
        System.out.println(meal1);

        Meal meal2 = new Meal.Builder("Vegetarian Burger")
                .dessert("Fruit Salad")
                .build();
        System.out.println(meal2);
    }
}
