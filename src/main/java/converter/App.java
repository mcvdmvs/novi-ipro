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
  private boolean running = false;

  public static App main (String[] args) {
    return new App();
  }

  public App () {
    this.running = true;
  }

  /**
   * Method to show working of if/else
   */
  public boolean isRunning() {
    if (this.running) {
      return true;
    } else {
      return false;
    }
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
    return Firkin.fromLiter(liter);  
  }

  /**
  * Convert a firkin to a liter
  * @param float firkin
  * @return float liter
  */
  public float firkin2liter(float firkin) {
    return Firkin.toLiter(firkin);
  }

  /**
  * Calculate furlongage 
  * How many firkin is used per furlong, like 1 liter to 20 km
  * @param Firkin firkin
  * @param Furlong furlong
  * @return float furlongage
  */
  public float furlongage(Firkin firkin, Furlong furlong) {
    return firkin.getFirkin() / furlong.getFurlong();
  }

  /**
  * How many furlongs on one firkin
  * @param Furlong furlong
  * @param Firkin firkin
  * @return float furlongage
  */
  public float furlongage(Furlong furlong, Firkin firkin) {
    return furlong.getFurlong() / firkin.getFirkin();
  }

  /**
  * Convert seconds to fortnight
  * @param float seconds
  * @return float fortnight
  */
  public float seconds2fortnight(float seconds){
    return Fortnight.fromSeconds(seconds);
  }

  /**
  * Convert fortnight to second
  * @param float fortnight
  * @return float seconds
  */
  public float fortnight2seconds(float fortnight) {
    return Fortnight.toSeconds(fortnight);
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

