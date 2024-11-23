package regressiontest;

import com.unitedcoder.homework.week6.PasswordChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordCheckerTest {
    @Test
    public void passwordCheckerTest()
    {
        PasswordChecker passwordChecker=new PasswordChecker();
        Assertions.assertEquals(passwordChecker.checkPassword("Ab$123trpaTA!"),"strong");
        Assertions.assertEquals(passwordChecker.checkPassword("Ab$123trpaTA!123tierei"),"strong");
        Assertions.assertEquals(passwordChecker.checkPassword("123456"),"weak");
        Assertions.assertEquals(passwordChecker.checkPassword("PaTr1234567"),"normal");
    }
}
