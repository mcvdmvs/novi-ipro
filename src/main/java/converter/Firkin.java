package converter;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class Firkin {
  /**
  * @const firkin
  * A firkin is a volume measurement of about 41 liters
  */
  final float LITER = 40.8233f;

  private float firkin = 0;

  public void Firkin() {
  }

  public void Firkin(float firkin) {
    this.firkin = firkin;
  }

  /**
  * Convert a liter to a firkin
  * @param float liter
  */
  public void fromLiter(float liter) {
    this.firkin = liter / this.LITER;  
  }

  /**
  * Convert a firkin to a liter
  * @return float liter
  */
  public float toLiter(float firkin) {
    return firkin * this.LITER;
  }
}
