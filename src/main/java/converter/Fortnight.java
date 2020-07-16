package converter;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class Fortnight {
  /**
  * @const fortnight
  * A fortnight is a unit of time equal to 14 days or 1.1m seconds
  * and not a battle royal game like many think
  */
  final float SECONDS = 1184400f;

  /**
  * @var float
  */
  private float fortnight = 0;

  /**
  * @var seconds
  */
  private float seconds = 0;

  /**
  * Create a new fortnight with no lenght
  */
  public Fortnight() {
  }

  /**
  * Create a new fortnight with a length
  * @param float fortnight
  */
  public Fortnight(float fortnight) {
    this.setFortnight(fortnight);
  }

  /**
  * Get seconds
  */
  public float getSeconds() {
    return this.seconds;
  }

  /**
  * Set seconds and fortnight
  * @param seconds
  */
  public void setSeconds(float seconds) {
    this.seconds = seconds;
    this.fortnight = this.convertFromSeconds(seconds);
  }

  /**
  * get fortnight
  */
  public float getFortnight() {
    return this.fortnight;
  }

  /**
  * Set fortnight
  * @param float fortnight
  */
  public void setFortnight(float fortnight) {
    this.fortnight = fortnight;
    this.seconds = this.convertToSeconds(fortnight);
  }

  /**
  * Convert seconds to fortnight
  * @param float seconds
  */
  public float convertFromSeconds(float seconds){
    return seconds / this.SECONDS;
  }

  /**
  * Convert fortnight to second
  * @return float seconds
  */
  public float convertToSeconds(float fortnight) {
    return fortnight * this.SECONDS;
  }

  public static float fromSeconds(float seconds) {
    Fortnight f = new Fortnight();
    f.setSeconds(seconds);
    return f.getFortnight();
  }

  public static float toSeconds(float fortnight) {
    Fortnight f = new Fortnight(fortnight);
    return f.getSeconds();
  }
}

