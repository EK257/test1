import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    public void bigIntMultiply() {
        Multiply multiply = new Multiply();
        assertEquals("24", multiply.bigIntMultiply("6", "4"));
        assertEquals("-24", multiply.bigIntMultiply("-6", "4"));
        assertEquals("-24", multiply.bigIntMultiply("6", "-4"));
        assertEquals("24", multiply.bigIntMultiply("-6", "-4"));
        assertEquals("0", multiply.bigIntMultiply("0", "1"));
    }

    @Test
    public void secondMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(24, multiply.secondMultiply(6, 4));
        assertEquals(-24, multiply.secondMultiply(-6, 4));
        assertEquals(-24, multiply.secondMultiply(6, -4));
        assertEquals(24, multiply.secondMultiply(-6, -4));
        assertEquals(0, multiply.secondMultiply(0, 1));
    }

    @Test
    public void simpleMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(24, multiply.simpleMultiply(6, 4));
        assertEquals(-24, multiply.simpleMultiply(-6, 4));
        assertEquals(-24, multiply.simpleMultiply(6, -4));
        assertEquals(24, multiply.simpleMultiply(-6, -4));
        assertEquals(0, multiply.simpleMultiply(0, 1));
    }

    @Test
    public void fastMultiply() {
        Multiply multiply = new Multiply();
        assertEquals(24, multiply.fastMultiply(6, 4));
        assertEquals(-24, multiply.fastMultiply(-6, 4));
        assertEquals(-24, multiply.fastMultiply(6, -4));
        assertEquals(24, multiply.fastMultiply(-6, -4));
        assertEquals(0, multiply.fastMultiply(0, 1));
    }
}

