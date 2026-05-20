import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 5 + 5 * 2;
        assertEquals(result, 15);
    }


    @Test
    public void testFoo2() {
    int result = 5;
    assertEquals(result, 5);
    }
}