package main.Factory;

public class Coffee implements IDrink {
    public Coffee(){
        this.createdAt = System.currentTimeMillis();
    }
    private final long createdAt;
    private final static String name = "Coffee";

    public String serve(){
        return "serving" + name;
    }

    private final static int HotTime = 3000;
    public boolean IsHot(){
        return createdAt + HotTime > System.currentTimeMillis();
    }
}
