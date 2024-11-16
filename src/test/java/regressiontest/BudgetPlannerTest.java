package regressiontest;
import com.unitedcoder.homework.week5.BudgetPlanner;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetPlannerTest {
@Test
public void testBudgetPlanner()
{
    ByteArrayInputStream in = new ByteArrayInputStream("3000\nRent\n900\nGroceries\n300".getBytes());
    System.setIn(in);
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    String[] args = {};
   BudgetPlanner.main(args);
    String consoleOutput = "Enter your total monthly income: \n";
    consoleOutput += "Enter your expense description: \n";
    consoleOutput += "Enter the amount for Rent: \n";
    consoleOutput +="Enter your expense description: \n";
    consoleOutput +="Enter the amount for Groceries: \n";
    consoleOutput += "Remaining balance for the month 1800\n";
    assertEquals(out.toString(),consoleOutput);
}
}
