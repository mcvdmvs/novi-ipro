package converter;

// we don't want to use floating points, but real decimals
import java.math.BigDecimal;

public class App {
  // size of furlong will never change, so make it a constant
  final BigDecimal furlong = new BigDecimal(201.168);
  final BigDecimal firkin = new BigDecimal(40.8233);

  // weight in grams of petrol at 15 degree celsius
  final int petrol_weight = 750;

  public static App main (String[] args) {
    return new App();
  }

  public BigDecimal meter2furlong(BigDecimal meter) {
    return meter.divide(this.furlong);
  }

  public BigDecimal furlong2meter(BigDecimal furlong) {
    return furlong.multiply(this.furlong);
  }

  public BigDecimal gram2firkin(BigDecimal gram) {
    return gram.divide(this.firkin);
  }

  public BigDecimal firkin2gram(BigDecimal firkin) {
    return firkin.multiply(this.firkin);
  }

  // distance traveled per weight of petrol used
  public BigDecimal firkin_per_furlong(BigDecimal furlong, BigDecimal firkin) {
    return furlong.divide(firkin);
  }

  public BigDecimal petrol_liters_2_firkin(int liters) {
    BigDecimal grams = new BigDecimal(liters * petrol_weight);
    return gram2firkin(grams);
  }
}

