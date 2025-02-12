package calcu.java;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import org.junit.Test ;


public class calcuTest {
    private final Calcu calculator = new Calcu();

    @Test
    public void testAddTwoIntegers() {
        // Arrange
        int num1 = 1;
        int num2 = 2;
        int expectedSum1 = 3;

        int num3 = -1;
        int num4 = -1;
        int expectedSum2 = -2;

        // Act
        int result1 = calculator.add(num1, num2);
        int result2 = calculator.add(num3, num4);

        // Assert
        assertEquals(expectedSum1, result1);
        assertEquals(expectedSum2, result2);
    }

    @Test
    public void testAddMultipleIntegers() {
        // Arrange
        int[] nums1 = {1, 2, 3, 4, 5};
        int expectedSum1 = 15;

        int[] nums2 = {1, 2};
        int expectedSum2 = 3;

        int[] nums3 = {-1, -1};
        int expectedSum3 = -2;

        // Act
        int result1 = calculator.add(nums1);
        int result2 = calculator.add(nums2);
        int result3 = calculator.add(nums3);

        // Assert
        assertEquals(expectedSum1, result1);
        assertEquals(expectedSum2, result2);
        assertEquals(expectedSum3, result3);
    }

    @Test
    public void testMultiplyTwoIntegers() {
        // Arrange
        int num1 = 1;
        int num2 = 3;
        int expectedProduct1 = 3;

        int num3 = -1;
        int num4 = 3;
        int expectedProduct2 = -3;

        // Act
        int result1 = calculator.multiply(num1, num2);
        int result2 = calculator.multiply(num3, num4);

        // Assert
        assertEquals(expectedProduct1, result1);
        assertEquals(expectedProduct2, result2);
    }

    @Test
    public void testMultiplyMultipleIntegers() {
        // Arrange
        int[] nums1 = {1, 2, 3, 4, 5};
        int expectedProduct1 = 120;

        int[] nums2 = {1, 3};
        int expectedProduct2 = 3;

        int[] nums3 = {-1, 3};
        int expectedProduct3 = -3;

        // Act
        int result1 = calculator.multiply(nums1);
        int result2 = calculator.multiply(nums2);
        int result3 = calculator.multiply(nums3);

        // Assert
        assertEquals(expectedProduct1, result1);
        assertEquals(expectedProduct2, result2);
        assertEquals(expectedProduct3, result3);
    }
}


