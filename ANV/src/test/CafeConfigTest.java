package test;


import main.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CafeConfigTest {

    @Test
    void getCafeName() {
        CafeConfig instance = CafeConfig.getInstance();
        Assertions.assertEquals(CafeConfig.getInstance().GetCafeName(),instance.GetCafeName());
        Assertions.assertEquals("default name",CafeConfig.getInstance().GetCafeName());
    }

    @Test
    void setCafeName() {
        String nameToSet = "new name";
        CafeConfig cafeConfig = CafeConfig.getInstance();
        cafeConfig.SetCafeName(nameToSet);
        Assertions.assertEquals(nameToSet, cafeConfig.GetCafeName());

        cafeConfig.SetCafeName("wrong name");
        Assertions.assertNotEquals(nameToSet,cafeConfig.GetCafeName());
        CafeConfig.getInstance().SetCafeName(nameToSet);
        Assertions.assertEquals(nameToSet,cafeConfig.GetCafeName());
    }

    @Test
    void getInstance() {
        CafeConfig instace1 = CafeConfig.getInstance();
        CafeConfig instace2 = CafeConfig.getInstance();
        Assertions.assertEquals(instace1,instace2);
    }
}