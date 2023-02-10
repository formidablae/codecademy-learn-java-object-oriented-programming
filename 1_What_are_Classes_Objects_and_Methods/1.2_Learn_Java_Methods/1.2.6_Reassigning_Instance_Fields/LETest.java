import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LETest {
  @Test
  public void increasesPriceByOne() {
    Store store = new Store("Lemonade", 1);
    store.increasePrice(1);
    double expected = 2;
    double actual = store.price;
    assertEquals("We tested increasing the price by 1 for a store with a starting price of 1, and got the wrong price!", expected, actual, 0.05);
  }
  
  @Test
  public void increasesPriceByTen() {
    Store store = new Store("Lemonade", 1);
    store.increasePrice(10);
    double expected = 11;
    double actual = store.price;
    assertEquals("We tested increasing the price by 10 for a store with a starting price of 1, and got the wrong price!", expected, actual, 0.05);
  }
}
