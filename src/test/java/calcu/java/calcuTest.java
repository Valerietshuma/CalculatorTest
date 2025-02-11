package calcu.java;
import static junit.framework.Assert.assertEquals;


public class calcuTest {
    private final Calcu calculator = new Calcu();

    @Test
    public void testAddTwoIntegers() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void testAddMultipleIntegers() {
        assertEquals(15, calculator.add(1, 2, 3, 4, 5));
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void testMultiplyTwoIntegers() {
        assertEquals(3, calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3));
    }

    @Test
    public void testMultiplyMultipleIntegers() {
        assertEquals(120, calculator.multiply(1, 2, 3, 4, 5));
        assertEquals(3, calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3));
    }

}
