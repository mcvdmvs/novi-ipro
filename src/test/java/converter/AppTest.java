package converter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
  private final App converter = new App();

  @Test
  public void meter2furlong() {
    assertEquals(
      1.0f, 
      this.converter.meter2furlong(201.168f));
  }

  @Test
  public void furlong2meter() {
    assertEquals(
      201.168f, 
      this.converter.furlong2meter(1f));
  }
 
  @Test
  public void liter2firkin() {
    // there should be 40.8233 liter in a firkin
    assertEquals(
      1f, 
      this.converter.liter2firkin(40.8233f));
  }

  @Test
  public void firkin2liter() {
    assertEquals(
      40.8233f, 
      this.converter.firkin2liter(1f));
  }

  @Test
  public void furlongage() {
    assertEquals(
      0.05f, 
      this.converter.furlongage(
        1f,
        20f));
  }
}
