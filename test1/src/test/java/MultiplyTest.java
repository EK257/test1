import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    public void bigIntMultiply() {
        Multiply multiply = new Multiply();
        assertEquals("15", multiply.bigIntMultiply("3", "5"));
        assertEquals("-15", multiply.bigIntMultiply("-3", "5"));
        assertEquals("-15", multiply.bigIntMultiply("3", "-5"));
        assertEquals("15", multiply.bigIntMultiply("-3", "-5"));
        assertEquals("0", multiply.bigIntMultiply("0", "1"));
    }

    @Test
    public void secondMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(15, multiply.secondMultiply(3, 5));
        assertEquals(-15, multiply.secondMultiply(-3, 5));
        assertEquals(-15, multiply.secondMultiply(3, -5));
        assertEquals(15, multiply.secondMultiply(-3, -5));
        assertEquals(0, multiply.secondMultiply(0, 1));
    }

    @Test
    public void simpleMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(15, multiply.simpleMultiply(3, 5));
        assertEquals(-15, multiply.simpleMultiply(-3, 5));
        assertEquals(-15, multiply.simpleMultiply(3, -5));
        assertEquals(15, multiply.simpleMultiply(-3, -5));
        assertEquals(0, multiply.simpleMultiply(0, 1));
    }

    @Test
    public void fastMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(15, multiply.fastMultiply(3, 5));
        assertEquals(-15, multiply.fastMultiply(-3, 5));
        assertEquals(-15, multiply.fastMultiply(3, -5));
        assertEquals(15, multiply.fastMultiply(-3, -5));
        assertEquals(0, multiply.fastMultiply(0, 1));
    }
}
