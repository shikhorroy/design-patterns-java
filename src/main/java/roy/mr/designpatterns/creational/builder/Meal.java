package roy.mr.designpatterns.creational.builder;

public class Meal {
    private final String burger;
    private final String drink;
    private final String dessert;

    private Meal(String burger, String drink, String dessert) {
        this.burger = burger;
        this.drink = drink;
        this.dessert = dessert;
    }

    public String getBurger() {
        return burger;
    }

    public String getDrink() {
        return drink;
    }

    public String getDessert() {
        return dessert;
    }

    @Override
    public String toString() {
        return String.format("Meal(burger = %s, drink = %s, desert = %s)", burger, drink, dessert);
    }

    public static class Builder {
        private final String burger;

        private String drink = "Soda";
        private String dessert = "Ice Cream";

        public Builder(String burger) {
            this.burger = burger;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder dessert(String desert) {
            this.dessert = desert;
            return this;
        }

        public Meal build() {
            return new Meal(burger, drink, dessert);
        }
    }
}
