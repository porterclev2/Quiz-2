package quiz_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int positiveExpected = 2;
        int negativeExpected = -2;
        int zeroExpected = 0;
        assertEquals(positiveExpected, calculator.divide(4, 2));
        assertEquals(negativeExpected, calculator.divide(4, -2));
        assertEquals(zeroExpected, calculator.divide(0, 2));
    }
    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4, 0);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
    @Test
    public void testIsEven(){
        boolean expected = true;
        boolean actual = calculator.isEven(2);
        assertEquals(expected, actual);
    }
    
}
