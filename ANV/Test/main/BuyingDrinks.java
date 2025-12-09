package main;

import main.Builder.Builder;
import main.Builder.CustomDrink;
import main.Singleton.CafeConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyingDrinks {

    @Test
    void todo() {

        CustomDrink customDrink = new Builder("coffee").milk().sugar().build();
        Assertions.assertEquals("TODO",CafeConfig.getInstance().GetCafeName());
    }
}


