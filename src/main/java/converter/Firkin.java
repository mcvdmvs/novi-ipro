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

  /**
  * @var float
  */
  private float firkin = 0;

  /**
  * @var float
  */
  private float liter = 0;

  /**
  * Create a new and empty firkin
  */
  public Firkin() {
  }

  /**
  * Create a firkin with volume
  * @param float firkin
  */
  public Firkin(float firkin) {
    this.setFirkin(firkin);
  }

  /**
  * Get liter
  * @return float liter
  */
  public float getLiter() {
    return this.liter;
  }

  /**
  * Set liter and convert to firkin while we on it
  * @param float liter
  */
  public void setLiter(float liter) {
    this.liter = liter;
    this.firkin = this.convertFromLiter(liter);
  }

  /**
  * Get firkin
  * @return float firkin
  */
  public float getFirkin() {
    return this.firkin;
  }

  /**
  * Set firkin
  * @param float firkin
  */
  public void setFirkin(float firkin) {
    this.firkin = firkin;
    this.liter = this.convertToLiter(firkin);
  }

  /**
  * Convert a liter to a firkin
  * @param float liter
  */
  private float convertFromLiter(float liter) {
    return liter / this.LITER;  
  }

  /**
  * Convert a firkin to a liter
  * @return float liter
  */
  private float convertToLiter(float firkin) {
    return firkin * this.LITER;
  }

  public static float fromLiter(float liter) {
    Firkin f = new Firkin();
    f.setLiter(liter);

    return f.getFirkin();
  }

  public static float toLiter(float firkin) {
    Firkin f = new Firkin(firkin);
    return f.getLiter();
  }
}
