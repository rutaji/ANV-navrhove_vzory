package main;

public class Water implements IDrink {
    public Water(){
    }
    private final static String name = "Water";

    public String serve(){
        return "serving" + name;
    }
}