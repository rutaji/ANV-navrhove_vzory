import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CafeConfigTest {

    @org.junit.jupiter.api.Test
    void getCafeName() {
        String name = CafeConfig.getInstance().GetCafeName();
        Assertions.assertEquals("default name",name);
    }

    @org.junit.jupiter.api.Test
    void setCafeName() {
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
    }
}