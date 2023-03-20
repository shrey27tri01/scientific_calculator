import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void additionTruePositive() {
        assertEquals("Adding two numbers for True Positive", 6.9, calculator.add(2.34, 4.56), DELTA);
        assertEquals("Adding two numbers for True Positive", 12.45672, calculator.add(9, 3.45672), DELTA);
    }

    @Test
    public void additionFalsePositive() {
        assertNotEquals("Adding two numbers for False Positive", 69, calculator.add(2.3221, 4), DELTA);
        assertNotEquals("Adding two numbers for False Positive", 1245.672, calculator.add(9, 3), DELTA);
    }

    @Test
    public void subtractionTruePositive() {
        assertEquals("Subtracting two numbers for True Positive", 1.662, calculator.sub(2.34, 0.678), DELTA);
        assertEquals("Subtracting two numbers for True Positive", 5.54328, calculator.sub(9, 3.45672), DELTA);
    }

    @Test
    public void subtractionFalsePositive() {
        assertNotEquals("Subtracting two numbers for False Positive", 69, calculator.sub(78.3221, 4), DELTA);
        assertNotEquals("Subtracting two numbers for False Positive", 7.99972, calculator.sub(9, 1), DELTA);
    }

    @Test
    public void multiplicationTruePositive() {
        assertEquals("Multiplying two numbers for True Positive", 1.58652, calculator.mul(2.34, 0.678), DELTA);
        assertEquals("Multiplying two numbers for True Positive", 0.0000, calculator.mul(9.87, 0), DELTA);
    }

    @Test
    public void multiplicationFalsePositive() {
        assertNotEquals("Multiplying two numbers for False Positive", 69, calculator.mul(78.3221, 4), DELTA);
        assertNotEquals("Multiplying two numbers for False Positive", 7.99972, calculator.mul(9, 1), DELTA);
    }
}