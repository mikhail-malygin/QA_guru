package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        Assertions.assertFalse(0 >= 2);
    }

    @Test
    public void secondTest() {
        Assertions.assertTrue(7 < 10);
    }
}
