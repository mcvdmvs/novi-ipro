package converter;

import converter.Furlong;
import converter.Firkin;
import converter.Fortnight;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class App {
  /**
  * @const firkin
  * A firkin is a volume measurement of about 41 liters
  */
  final float firkin = 40.8233f;

  /**
  * @const fortnight
  * A fortnight is a unit of time equal to 14 days or 1.1m seconds
  */
  final float fortnight = 1184400f;

  public static App main (String[] args) {
    return new App();
  }

  /** 
  * Convert a SI meter to a Furlong
  * @param float meter
  * @return float furlong
  */
  public float meter2furlong(float meter) {
    return Furlong.fromMeter(meter);
  }

  /**
  * Convert Furlong to an SI meter
  * @param float furlong
  * @return float meter
  */
  public float furlong2meter(float furlong) {
    return Furlong.toMeter(furlong);
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

  /**
  * Convert seconds to fortnight
  * @param float seconds
  * @return float fortnight
  */
  public float seconds2fortnight(float seconds){
    return seconds / this.fortnight;
  }

  /**
  * Convert fortnight to second
  * @param float fortnight
  * @return float seconds
  */
  public float fortnight2seconds(float fortnight) {
    return fortnight * this.fortnight;
  }

  /**
  * Show a nice message telling speed with some string manipulation
  * @param float fortnight
  * @param float furlong
  * @return String message
  */
  public String currentSpeedMessage(float fortnight, float furlong) {
    // get speed in furlong per fortnight
    float ff = furlong / fortnight;

    // get speed in km/u
    float kmu = 
      (this.furlong2meter(furlong) / 1000)
      / (this.fortnight2seconds(fortnight) / 3600);

    return String.format("Your current speeds is %f furlong per fortnight, "
      + "which equals to %f km/u",
      ff, 
      kmu);
  }

}

