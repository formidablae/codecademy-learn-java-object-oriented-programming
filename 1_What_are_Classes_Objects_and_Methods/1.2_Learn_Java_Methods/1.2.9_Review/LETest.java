import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.containsString;

public class LETest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  public void checkHello() {
    String expected = "Hello!";
    SavingsAccount savingsTest = new SavingsAccount(2000);
    
    savingsTest.checkBalance();
    
    assertThat("Does your `checkBalance()` method print \"Hello!\"?", outContent.toString(), containsString(expected));
  }
  
  @Test
  public void checkYourBalanceIs() {
    String expected = "Your balance is 2000";
    SavingsAccount savingsTest = new SavingsAccount(2000);
    
    savingsTest.checkBalance();
    
    assertThat("Does your `checkBalance()` method print \"Your balance is \" + balance?", outContent.toString(), containsString(expected));
  }
}
