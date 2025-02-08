import com.unitedcoder.methodtutorial.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void calculatorAddNumbersTest()
    {
        Calculator calculator=new Calculator();
        Assertions.assertEquals(calculator.addNumbers(10.00,15.00),25.00);
    }
}
