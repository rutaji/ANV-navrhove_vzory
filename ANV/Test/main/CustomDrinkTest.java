package main;

import main.Builder.CustomDrink;
import main.Singleton.CafeConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomDrinkTest {

    @Test
    void todo() {

        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().build();

        Assertions.assertEquals("coffee",customDrink.getBase());
        Assertions.assertTrue(customDrink.isSugar());
        Assertions.assertFalse(customDrink.isCaramel());
    }
}


