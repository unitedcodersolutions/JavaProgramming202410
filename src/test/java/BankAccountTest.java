import com.unitedcoder.methodtutorial.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    public void depositTest()
    {
        BankAccount bankAccount=new BankAccount(112233,1000.00,"Test Account");
        Assertions.assertEquals(bankAccount.depositMoney(500),1500.00);
    }
}
