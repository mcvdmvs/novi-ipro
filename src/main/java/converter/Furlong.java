package converter;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class Furlong {
  /**
  * @const furlong
  * A furlong is 201.168 SI meter
  */
  final float METER = 201.168f;

  /**
  * @var float
  */
  private float furlong = 0;

  /**
  * @var float
  */
  private float meter = 0;

  /**
  * Create a new and empty furlong
  */
  public Furlong() {
  }

  /**
  * Create a new furlong with a furlong size
  * @param float furlong
  */
  public Furlong(float furlong) {
    this.setFurlong(furlong);
  }

  /**
  * Get meter
  * @return float meter
  */
  public float getMeter() {
    return this.meter;
  }

  /**
  * Set meter and furlong based on meter
  * @param float meter
  */
  public void setMeter(float meter) {
    this.meter = meter;
    this.furlong = this.convertFromMeter(meter);
  }

  /**
  * Get furlong
  * @return float furlong
  */
  public float getFurlong() {
    return this.furlong;
  }

  /**
  * Set furlong and meter based on furlong
  * @param float furlong
  */
  public void setFurlong(float furlong) {
    this.furlong = furlong;
    this.meter = this.convertToMeter(furlong);
  }

  /** 
  * Convert a SI meter to a Furlong
  * @param float meter
  * @return float furlong
  */
  private float convertFromMeter(float meter) {
    return meter / this.METER;
  }

  private float convertToMeter(float furlong) {
    return furlong * this.METER;
  }
  
  public static float fromMeter(float meter) {
    Furlong f = new Furlong();
    f.setMeter(meter);

    return f.getFurlong();
  }

  /**
  * Convert Furlong to an SI meter
  * @param float furlong
  * @return float meter
  */
  public static float toMeter(float furlong) {
    Furlong f = new Furlong(furlong);
    return f.getMeter();
  }
}
