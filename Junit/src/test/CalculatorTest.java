package test;

import com.main.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;

/**
 * Created by Sabab on 3/20/2019.
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
        Assert.assertEquals(10, calculator.sum(4, 6));
    }

    @Test
    public void diffTest() {
        Assert.assertEquals(4, calculator.diff(6, 2));
    }
}
