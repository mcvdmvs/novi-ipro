package converter;

/**
* Use BigDecimal because of precision
*/
import java.math.BigDecimal;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class App {
  /**
  * @const furlong
  * A furlong is 201.168 SI meter
  */
  final BigDecimal furlong = new BigDecimal(201.168);

  /**
  * @const firkin
  * A firkin is a volume measurement of about 41 liters
  */
  final BigDecimal firkin = new BigDecimal(40.8233);

  public static App main (String[] args) {
    return new App();
  }

  /** 
  * Convert a SI meter to a Furlong
  * @param BigDecimal meter
  * @return BigDecimal furlong
  */
  public BigDecimal meter2furlong(BigDecimal meter) {
    return meter.divide(this.furlong);
  }

  /**
  * Convert Furlong to an SI meter
  * @param BigDecimal furlong
  * @return BigDecimal meter
  */
  public BigDecimal furlong2meter(BigDecimal furlong) {
    return furlong.multiply(this.furlong);
  }

  /**
  * Convert a liter to a firkin
  * @param BigDecimal liter
  * @return BigDecimal firkin
  */
  public BigDecimal liter2firkin(BigDecimal liter) {
    return liter.divide(this.firkin);
  }

  /**
  * Convert a firkin to a liter
  * @param BigDecimal firkin
  * @return BigDecimal liter
  */
  public BigDecimal firkin2liter(BigDecimal firkin) {
    return firkin.multiply(this.firkin);
  }

  /**
  * Calculate furlongage
  * How many firkin is used per furlong
  * @param BigDecimal firkin
  * @param BigDecimal furlong
  * @return BigDecimal furlongage
  */
  public BigDecimal furlongage(BigDecimal firkin, BigDecimal furlong) {
    return firkin.divide(furlong);
  }
}

