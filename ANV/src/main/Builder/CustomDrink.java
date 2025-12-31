package main.Builder;

public class CustomDrink {
    private String base;
    private boolean milk;
    private boolean sugar;
    private boolean caramel;

    public CustomDrink(Builder builder){
        base = builder.base;
        milk = builder.milk;
        sugar = builder.sugar;
        caramel = builder.caramel;
    }

    public String getBase() {
        return base;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isCaramel() {
        return caramel;
    }

    public static class Builder{
        String base;

        //optional
        private boolean milk = false;
        private boolean sugar = false;
        private boolean caramel = false;

        public Builder(String base)
        {
            this.base = base;
        }
        public Builder milk()
        {
            milk = true;
            return this;
        }
        public Builder sugar()
        {
            sugar = true;
            return this;
        }
        public Builder caramel()
        {
            caramel = true;
            return this;
        }
        public CustomDrink build(){
            return new CustomDrink(this);
        }
    }


}
