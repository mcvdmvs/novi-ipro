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

  public void furlong2meter() {
    assertEquals(new BigDecimal(201.168), this.converter.furlong2meter(new
    BigDecimal(1)));
  }
}
