package regressiontest;

import com.unitedcoder.project.CurrencyConverterApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {
    @Test
    public void testCurrencyConverterJPY()
    {
        CurrencyConverterApp app=new CurrencyConverterApp();
        Assertions.assertEquals(app.convert("USD","JPY",100),15000.00);
    }
 @Test
    public void testCurrencyConverterTRY()
    {
        CurrencyConverterApp app=new CurrencyConverterApp();
        Assertions.assertEquals(app.convert("USD","TRY",100),3475.00);
    }
}
