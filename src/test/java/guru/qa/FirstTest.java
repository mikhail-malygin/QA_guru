package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        Assertions.assertTrue(5 >= 4);
    }

    @Test
    public void secondTest() {
        Assertions.assertFalse(7 < 5);
    }
}
