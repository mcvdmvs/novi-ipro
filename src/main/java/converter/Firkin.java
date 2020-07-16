package converter;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*
* A Firkin has three different values:
* - US unit of dry measure 1 firkin = 9 US gallons = 34 liters
* - UK unit of weight 1 firkin = 56 pounds = 25 kilogram
* - UK unit of volume 1 firkin = 0.25 barrel = 41 liter
*/
public class Firkin {
  final float US_VOLUME_FIRKIN = 34f;
  final float UK_VOLUME_FIRKIN = 40.8233f;
  final float UK_WEIGHT_FIRKIN = 25f;

  /**
  * @const firkin
  * A firkin is a volume measurement of about 41 liters
  */
  float conversion = this.UK_VOLUME_FIRKIN;

  /**
  * @var float
  */
  private float firkin = 0;

  /**
  * @var float
  */
  private float liter = 0;

  /**
  * @var String type
  */
  private String type;

  /**
  * Create a new and empty firkin
  */
  public Firkin() {
  }

  /**
  * Create a new firkin with a type
  * @param String type;
  */
  public Firkin(String type) {
    switch (type) {
      case "US_VOLUME_FIRKIN":
        this.conversion = this.US_VOLUME_FIRKIN;
        break;

      case "UK_VOLUME_FIRKIN":
        this.conversion = this.UK_VOLUME_FIRKIN;
        break;

      case "UK_WEIGHT_FIRKIN":
        throw new RuntimeException("Weight conversion is not implemented");
    
      default:
        throw new RuntimeException("Illegal value of type");
    }
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
    return liter / this.conversion;  
  }

  /**
  * Convert a firkin to a liter
  * @return float liter
  */
  private float convertToLiter(float firkin) {
    return firkin * this.conversion;
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
