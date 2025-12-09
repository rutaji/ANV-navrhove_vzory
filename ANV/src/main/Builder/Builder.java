package main.Builder;

public class Builder{
    CustomDrink product = null;
    public Builder(String base)
    {
        product = new CustomDrink();
        product.base = base;
    }
    public Builder milk()
    {
        product.milk = true;
        return this;
    }
    public Builder sugar()
    {
        product.sugar = true;
        return this;
    }
    public Builder caramel()
    {
        product.caramel = true;
        return this;
    }
    public CustomDrink build(){
        return product;
    }
}