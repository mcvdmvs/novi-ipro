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
    // there should be 40.9148269 liter in a firkin
    assertEquals(
      1f, 
      this.converter.liter2firkin(40.9148269f));
  }

  @Test
  public void firkin2liter() {
    assertEquals(
      40.9148269f, 
      this.converter.firkin2liter(1f));
  }

  @Test
  public void USfirkin2liter() {
    Firkin usf = new Firkin ("US_VOLUME_FIRKIN");
    usf.setFirkin(2);

    assertEquals(
      68,
      usf.getLiter());
  }

  @Test
  public void furlongage() {
    assertEquals(
      0.05f, 
      this.converter.furlongage(
        new Firkin(1f),
        new Furlong(20f)));
  }

  public void currentSpeed() {
    assertEquals(
      "Your current speeds is 1.000000 furlong per fortnight, "
      + "which equals to 0.000611 km/u",
      this.converter.currentSpeedMessage(1, 1));
  }
}
