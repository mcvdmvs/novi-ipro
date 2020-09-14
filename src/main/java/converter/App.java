package converter;

import converter.Furlong;
import converter.Firkin;
import converter.Fortnight;

import org.apache.commons.cli.*;

/**
* @author Mick van der Most van Spijk
* Leerlijn IPRO
* Datum 16 Juli 2020
*/
public class App {
  private boolean running = false;

  /**
   * Start application and read command line option to convert a parameter
   * to FFF
   */
  public static void main (String[] args) {
    Options options = new Options();
    options.addOption(new Option("help", "This message"));
    
    options.addOption(new Option("firkin", true, "Convert Firkins to liters"));
    options.addOption(new Option("furlong", true, "Convert Furlongs to meters"));
    options.addOption(new Option("fortnight", true, "Convert Fortnight to seconds"));

    CommandLineParser parser = new DefaultParser();
    try {
      CommandLine line = parser.parse(options, args);

      if (line.hasOption("help")) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("converter", options);
	return;
      } 
      
      if (line.hasOption("firkin")) {
	Float firkin_value = Float.parseFloat(line.getOptionValue("firkin"));
	Float liter = App.firkin2liter(firkin_value);
	String f2l = String.format("%.2f firkin is equal to %.2f liter", firkin_value, liter);
	System.out.println(f2l);
      }

      if (line.hasOption("furlong")) {
        Float furlong_value = Float.parseFloat(line.getOptionValue("furlong"));
	Float meter = App.furlong2meter(furlong_value);
	String f2m = String.format("%.2f furlong is equal to %.2f meter", furlong_value, meter);
	System.out.println(f2m);
      
      }

      if (line.hasOption("fortnight")) {
	Float fortnight_value = Float.parseFloat(line.getOptionValue("fortnight"));
	Float seconds = App.fortnight2seconds(fortnight_value);
	String f2s = String.format("%.2f fortnight is equal to %.2f seconds", fortnight_value, seconds);
	System.out.println(f2s);
      }

    } catch (ParseException e) {
      System.err.println("Parsing of command line options failed: " +
		      e.getMessage());
    }

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
  public static float meter2furlong(float meter) {
    return Furlong.fromMeter(meter);
  }

  /**
  * Convert Furlong to an SI meter
  * @param float furlong
  * @return float meter
  */
  public static float furlong2meter(float furlong) {
    return Furlong.toMeter(furlong);
  }

  /**
  * Convert a liter to a firkin
  * @param float liter
  * @return float firkin
  */
  public static float liter2firkin(float liter) {
    return Firkin.fromLiter(liter);  
  }

  /**
  * Convert a firkin to a liter
  * @param float firkin
  * @return float liter
  */
  public static float firkin2liter(float firkin) {
    return Firkin.toLiter(firkin);
  }

  /**
  * Calculate furlongage 
  * How many firkin is used per furlong, like 1 liter to 20 km
  * @param Firkin firkin
  * @param Furlong furlong
  * @return float furlongage
  */
  public static float furlongage(Firkin firkin, Furlong furlong) {
    return firkin.getFirkin() / furlong.getFurlong();
  }

  /**
  * How many furlongs on one firkin
  * @param Furlong furlong
  * @param Firkin firkin
  * @return float furlongage
  */
  public static float furlongage(Furlong furlong, Firkin firkin) {
    return furlong.getFurlong() / firkin.getFirkin();
  }

  /**
  * Convert seconds to fortnight
  * @param float seconds
  * @return float fortnight
  */
  public static float seconds2fortnight(float seconds){
    return Fortnight.fromSeconds(seconds);
  }

  /**
  * Convert fortnight to second
  * @param float fortnight
  * @return float seconds
  */
  public static float fortnight2seconds(float fortnight) {
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

