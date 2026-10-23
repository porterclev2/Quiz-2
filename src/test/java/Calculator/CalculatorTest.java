package quiz_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test
    public void testSum() {
        int positiveExpected = 3;
        int negativeExpected = -1;
        int zeroExpected = 0;
        assertEquals(positiveExpected, calculator.sum(1, 2));
        assertEquals(negativeExpected, calculator.sum(1, -2));
        assertEquals(zeroExpected, calculator.sum(1, -1));
    }
    @Test
    public void testSubtract() {
        int positiveExpected = 3;
        int negativeExpected = -1;
        int zeroExpected = 0;
        assertEquals(positiveExpected, calculator.subtract(1, -2));
        assertEquals(negativeExpected, calculator.subtract(1, 2));
        assertEquals(zeroExpected, calculator.subtract(1, 1));
    }
    @Test
    public void testMultiply() {
        int negativeExpected = -4;
        int zeroExpected = 0;
        assertEquals(negativeExpected, calculator.multiply(2, -2));
        assertEquals(zeroExpected, calculator.multiply(2, 0));
    }
    @Test
    public void testDivide() {
        int expected = 1;
        int actual = calculator.divide(2, 2);
        assertEquals(expected, actual);
    }
    @Test
    public void testIsEven(){
        boolean expected = true;
        boolean actual = calculator.isEven(2);
        assertEquals(expected, actual);
    }
    
}
