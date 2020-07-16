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
  */
  final float SECONDS = 1184400f;

  private float fortnight = 0;

  public void Fortnight() {
  }

  public void Fortnight(float fortnight) {
    this.fortnight = fortnight;
  }

  /**
  * Convert seconds to fortnight
  * @param float seconds
  */
  public void fromSeconds(float seconds){
    this.fortnight = seconds / this.SECONDS;
  }

  /**
  * Convert fortnight to second
  * @return float seconds
  */
  public float toSeconds() {
    return this.fortnight * this.SECONDS;
  }
}

