package main;

public class DrinkFactory {

    public static IDrink createDrink(String name){
        return switch (name) {
            case "Coffee" -> new Coffee();
            case "Water" -> new Water();
            default -> null;
        };
    }
}
