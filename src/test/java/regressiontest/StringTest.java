package regressiontest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
@Test
public void StringLengthVerificationTest()
{
    Assertions.assertTrue("abcdef".length()==6);
}
}
