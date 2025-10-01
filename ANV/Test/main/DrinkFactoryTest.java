package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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