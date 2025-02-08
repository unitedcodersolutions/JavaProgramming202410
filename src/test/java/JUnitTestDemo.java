import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnitTestDemo {

    @BeforeAll
    public static void setUp()
    {
        System.out.println("Before all will run only once in the JUnit Framework Before any test");
    }
    @BeforeEach
    public void beforeTestInfo()
    {
        System.out.println("test start ...... ");
    }
    @Order(1)
    @Test
    public void sqareRootTest()
    {
        System.out.println("This is a test for checking a sqare root");
        Assertions.assertTrue(Math.sqrt(9)==3);
    }
    @Order(2)
    @Test
    public void compareStringTest()
    {
        System.out.println("This is a test for comparing two strings");
        String s1="United Coder";
        String s2="United coder";
        Assertions.assertEquals(s1,s2);
    }
    @Order(3)
    @Test
    public void mathPowerTest()
    {
        System.out.println("This is a test for power calculation");
        Assertions.assertTrue(Math.pow(10,2)==100);
    }

    @AfterEach
    public void afterTestInfo()
    {
        System.out.println("test ends ......");
    }
    @AfterAll
    public static void tearDown()
    {
        System.out.println("After all will run only once after all tests have been executed in the test class");
    }
}
