package converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;                                                   

public class AppTest {
  private final App converter = new App();

  @Test
  public void meter2furlong() {
    assertEquals(new BigDecimal(1.0), this.converter.meter2furlong(new
    BigDecimal(201.168)));
  }

  @Test
  public void furlong2meter() {
    assertEquals(new BigDecimal(201.168), this.converter.furlong2meter(new
    BigDecimal(1)));
  }
 
  @Test
  public void liter2firkin() {
    // there should be 40.8233 liter in a firkin
    assertEquals(new BigDecimal(1), this.converter.liter2firkin(new
    BigDecimal(40.8233)));
  }
}
