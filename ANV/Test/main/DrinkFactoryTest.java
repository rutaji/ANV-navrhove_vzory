package main;

import main.Factory.Coffee;
import main.Factory.DrinkFactory;
import main.Factory.IDrink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DrinkFactoryTest {

    @Test
    void GetCoffee() {
        IDrink coffee = DrinkFactory.createDrink("Coffee");
        Assertions.assertInstanceOf(Coffee.class,coffee);
        Assertions.assertInstanceOf(IDrink.class,coffee);
        Assertions.assertNotNull(coffee);
    }
    @Test
    void WrongOrder(){
        IDrink drink = DrinkFactory.createDrink("masoiciodancsaonascmcsfjnaomsaopndjmxknck");
        Assertions.assertNull(drink);
    }
}