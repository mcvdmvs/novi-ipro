package converter;

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
  final float furlong = 201.168f;

  /**
  * @const firkin
  * A firkin is a volume measurement of about 41 liters
  */
  final float firkin = 40.8233f;

  public static App main (String[] args) {
    return new App();
  }

  /** 
  * Convert a SI meter to a Furlong
  * @param float meter
  * @return float furlong
  */
  public float meter2furlong(float meter) {
    return meter / this.furlong;
  }

  /**
  * Convert Furlong to an SI meter
  * @param float furlong
  * @return float meter
  */
  public float furlong2meter(float furlong) {
    return furlong * this.furlong;
  }

  /**
  * Convert a liter to a firkin
  * @param float liter
  * @return float firkin
  */
  public float liter2firkin(float liter) {
    return liter / this.firkin;
  }

  /**
  * Convert a firkin to a liter
  * @param float firkin
  * @return float liter
  */
  public float firkin2liter(float firkin) {
    return firkin * this.firkin;
  }

  /**
  * Calculate furlongage
  * How many firkin is used per furlong
  * @param float firkin
  * @param float furlong
  * @return float furlongage
  */
  public float furlongage(float firkin, float furlong) {
    return firkin / furlong;
  }
}

